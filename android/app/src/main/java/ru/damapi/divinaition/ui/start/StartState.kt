package ru.damapi.divinaition.ui.start


sealed class StartState() {
    data object Loading: StartState()
}

sealed class StartEvent() {
    data object ClearAction: StartEvent()
}

sealed class StartAction() {
    data object NavigateToLogin: StartAction()
    data object NavigateToHome: StartAction()
}