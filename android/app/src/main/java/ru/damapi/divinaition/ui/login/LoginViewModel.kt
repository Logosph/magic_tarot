package ru.damapi.divinaition.ui.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import ru.damapi.domain.use_cases.GetCurrentUserUseCase
import ru.damapi.domain.use_cases.LoginResult
import ru.damapi.domain.use_cases.LoginUseCase

class LoginViewModel(
    private val getCurrentUserUseCase: GetCurrentUserUseCase,
    private val loginUseCase: LoginUseCase,
): ViewModel() {
    private val _viewState = MutableStateFlow<LoginState>(LoginState.Initialization)
    val viewState: StateFlow<LoginState>
        get() = _viewState
    private val _viewAction = MutableStateFlow<LoginAction?>(null)
    val viewAcion: StateFlow<LoginAction?>
        get() = _viewAction

    fun obtainEvent(event: LoginEvent) {
        when (event) {
            is LoginEvent.LoadData -> checkIfUserIsLoggedIn()
            is LoginEvent.ProceedClicked -> proceed()
            is LoginEvent.SignupClicked -> signup()
            is LoginEvent.ClearAction -> clearAction()
            is LoginEvent.EmailChanged -> emailChanged(event.email)
            is LoginEvent.PasswordChanged -> passwordChanged(event.password)
        }
    }

    private fun passwordChanged(password: String) {
        val state = _viewState.value
        if (state !is LoginState.Main) return
        _viewState.value = state.copy(password = password)
    }

    private fun emailChanged(email: String) {
        val state = _viewState.value
        if (state !is LoginState.Main) return
        _viewState.value = state.copy(email = email)
    }

    private fun clearAction() {
        _viewAction.value = null
    }

    private fun signup() {
        _viewAction.value = LoginAction.NavigateToSignup
    }

    private fun proceed() {
        val state = _viewState.value
        if (state !is LoginState.Main) return
        _viewState.value = LoginState.Loading
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val loginResult = loginUseCase.execute(state.email, state.password)
                when (loginResult) {
                    LoginResult.OK -> {
                        _viewAction.value = LoginAction.NavigateToHome
                    }
                    LoginResult.WRONG_EMAIL -> {
                        _viewState.value = state.copy(emailError = loginResult.error)
                    }
                    LoginResult.WORNG_PASSWORD -> {
                        _viewState.value = state.copy(passwordError = loginResult.error)
                    }
                    LoginResult.NETWORK_ERROR -> {
                        //переделать на что-то всплывающее?
                        _viewState.value = state.copy(passwordError = "Ошибка сети. Проверьте подключение")
                    }
                    LoginResult.SERVER_ERROR -> {
                        //тоже переделать
                        _viewState.value = state.copy(passwordError = "Ошибка сервера. Попробуйте повторить запрос")
                    }
                }
            }
        }
    }

    private fun checkIfUserIsLoggedIn() {
        _viewState.value = LoginState.Loading
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                //val user = getCurrentUserUseCase.execute()
                val user = null //Это тут пока нет апишника
                if (user != null) {
                    _viewAction.value = LoginAction.NavigateToHome
                } else {
                    _viewState.value = LoginState.Main()
                }
            }
        }
    }
}