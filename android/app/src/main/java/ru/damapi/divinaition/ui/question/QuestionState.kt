package ru.damapi.divinaition.ui.question

sealed class QuestionState() {
    data class MainState(
        val question: String = "",
        val errorMessage: String? = null
    ) : QuestionState()

    data object Loading : QuestionState()
}

sealed class QuestionEvent() {
    data class QuestionChanged(val question: String) : QuestionEvent()
    data object AskClicked : QuestionEvent()
    data object ClearAction : QuestionEvent()
}

sealed class QuestionAction() {
    data class NavigateToReading(val question: String): QuestionAction()
}