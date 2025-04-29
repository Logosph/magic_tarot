package ru.damapi.divinaition.ui.login

sealed class LoginState() {
    data object Initialization: LoginState()
    data class Main(
        val email: String = "",
        val password: String = "",
        val emailError: String? = null,
        val passwordError: String? = null,
    ): LoginState()
    data object Loading: LoginState()
}

sealed class LoginEvent() {
    data object LoadData: LoginEvent()
    data object ProceedClicked: LoginEvent()
    data object SignupClicked: LoginEvent()
    data object ClearAction: LoginEvent()
    data class EmailChanged(val email: String): LoginEvent()
    data class PasswordChanged(val password: String): LoginEvent()
}

sealed class LoginAction() {
    data object NavigateToSignup: LoginAction()
    data object NavigateToHome: LoginAction()
}