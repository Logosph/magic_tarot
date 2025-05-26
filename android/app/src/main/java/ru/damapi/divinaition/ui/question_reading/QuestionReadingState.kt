package ru.damapi.divinaition.ui.question_reading

import ru.damapi.domain.models.CardModel

sealed class QuestionReadingState {
    data class MainState(
        val question: String,
        val cards: List<CardModel>,
        val reading: String? = null,
        val isReadingLoading: Boolean = true
    ) : QuestionReadingState()

    data object Loading : QuestionReadingState()
    data object Error : QuestionReadingState()
}

sealed class QuestionReadingEvent {
    data class LoadCards(val question: String) : QuestionReadingEvent()
}