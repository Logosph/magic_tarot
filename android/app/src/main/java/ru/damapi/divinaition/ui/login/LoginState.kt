package ru.damapi.divinaition.ui.login

sealed class LoginState() {
    data class Main(
        val email: String = "",
        val password: String = "",
        val emailError: String? = null,
        val passwordError: String? = null,
    ): LoginState()
    data object Loading: LoginState()
}

sealed class LoginEvent() {
    data class ProceedClicked(val email: String, val password: String): LoginEvent()
    data class SignupClicked(val email: String, val password: String): LoginEvent()
    data object ClearAction: LoginEvent()
    data class PasswordChanged(val password: String): LoginEvent()
    data class EmailChanged(val email: String): LoginEvent()
}

sealed class LoginAction() {
    data object NavigateToSignup: LoginAction()
    data object NavigateToHome: LoginAction()
}