package ru.damapi.divinaition.ui.signup

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import ru.damapi.domain.use_cases.SignupResult
import ru.damapi.domain.use_cases.SignupUseCase

class SignupViewModel(
    private val signupUseCase: SignupUseCase
) : ViewModel() {
    private val _viewState = MutableStateFlow<SignupState>(SignupState.Main())
    val viewState: StateFlow<SignupState>
        get() = _viewState
    private val _viewAction = MutableStateFlow<SignupAction?>(null)
    val viewAction: StateFlow<SignupAction?>
        get() = _viewAction

    fun obtainEvent(event: SignupEvent) {
        when (event) {
            is SignupEvent.ProceedClicked -> proceed(
                event.email,
                event.username,
                event.password,
                event.confirmPassword
            )

            is SignupEvent.LoginClicked -> login()

            is SignupEvent.ClearAction -> clearAction()
            is SignupEvent.EmailChanged -> emailChanged(event.email)
            is SignupEvent.UsernameChanged -> userNameChanged(event.username)
            is SignupEvent.PasswordChanged -> passwordChanged(event.password)
            is SignupEvent.ConfirmPasswordChanged -> confirmPasswordChanged(event.confirmPassword)
        }
    }

    private fun confirmPasswordChanged(confirmPassword: String) {
        val state = _viewState.value
        if (state !is SignupState.Main) return
        _viewState.value = state.copy(confirmPassword = confirmPassword)
    }

    private fun passwordChanged(password: String) {
        val state = _viewState.value
        if (state !is SignupState.Main) return
        _viewState.value = state.copy(password = password)
    }

    private fun userNameChanged(username: String) {
        val state = _viewState.value
        if (state !is SignupState.Main) return
        _viewState.value = state.copy(username = username)
    }

    private fun emailChanged(email: String) {
        val state = _viewState.value
        if (state !is SignupState.Main) return
        _viewState.value = state.copy(email = email)
    }

    private fun clearAction() {
        _viewAction.value = null
    }

    private fun login() {
        _viewAction.value = SignupAction.NavigateToLogin
    }

    private fun proceed(
        email: String,
        username: String,
        password: String,
        confirmPassword: String
    ) {
        val state = _viewState.value
        if (state !is SignupState.Main) return
        _viewState.value = state.copy(
            email = email,
            username = username,
            password = password,
            confirmPassword = confirmPassword
        )
        Log.d("StateDebug", "email: $email, username: $username, password: $password, confirmPassword: $confirmPassword")
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                Thread.sleep(1000)
                val result = signupUseCase.execute(
                    email = email,
                    username = username,
                    password = password,
                    confirmPassword = confirmPassword
                )
                when (result) {
                    SignupResult.OK -> {
                        _viewAction.value = SignupAction.NavigateToHome
                    }

                    SignupResult.PASSWORDS_DO_NOT_MATCH -> {
                        _viewState.value = state.copy(
                            confirmPassworError = "Пароли не совпадают"
                        )
                    }

                    SignupResult.PASSWORD_WEAK -> {
                        _viewState.value = state.copy(
                            passwordError = "Пароль слишком слабый"
                        )
                    }

                    SignupResult.PASSWORD_INCORRECT -> {
                        _viewState.value = state.copy(
                            passwordError = result.error
                        )
                    }

                    SignupResult.EMAIL_TAKEN -> {
                        _viewState.value = state.copy(
                            emailError = result.error
                        )
                    }

                    SignupResult.USERNAME_TAKEN -> {
                        _viewState.value = state.copy(
                            userNameError = result.error
                        )
                    }

                    SignupResult.USERNAME_LENGTH -> {
                        _viewState.value = state.copy(
                            userNameError = result.error
                        )
                    }

                    SignupResult.USERNAME_INCORRECT -> {
                        _viewState.value = state.copy(
                            userNameError = result.error
                        )
                    }

                    SignupResult.NETWORK_ERROR -> {
                        //переделать на что-то всплывающее?
                        _viewState.value = state.copy(
                            passwordError = "Ошибка сети. Проверьте подключение"
                        )
                    }

                    SignupResult.SERVER_ERROR -> {
                        //тоже переделать
                        _viewState.value = state.copy(
                            passwordError = "Ошибка сервера. Попробуйте повторить запрос"
                        )
                    }
                }
            }
        }
    }
}