package ru.damapi.divinaition.ui.signup

sealed class SignupState {
    data class Main(
        val email: String = "",
        val username: String = "",
        val password: String = "",
        val confirmPassword: String = "",
        val emailError: String? = null,
        val passwordError: String? = null,
        val confirmPassworError: String? = null,
        val userNameError: String? = null,
    ): SignupState()
    data object Loading: SignupState()
}

sealed class SignupEvent() {
    data class ProceedClicked(
        val email: String,
        val username: String,
        val password: String,
        val confirmPassword: String
    ) : SignupEvent()
    data object LoginClicked : SignupEvent()
    data object ClearAction : SignupEvent()
    data class EmailChanged(val email: String) : SignupEvent()
    data class UsernameChanged(val username: String) : SignupEvent()
    data class PasswordChanged(val password: String) : SignupEvent()
    data class ConfirmPasswordChanged(val confirmPassword: String) : SignupEvent()
}

sealed class SignupAction() {
    data object NavigateToLogin : SignupAction()
    data object NavigateToHome : SignupAction()
}