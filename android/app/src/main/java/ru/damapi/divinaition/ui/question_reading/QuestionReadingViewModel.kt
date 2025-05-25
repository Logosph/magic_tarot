package ru.damapi.divinaition.ui.question_reading

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.internal.wait
import ru.damapi.domain.use_cases.GetCardsByQuestionUseCase
import ru.damapi.domain.use_cases.GetReadingInterpretationUseCase

class QuestionReadingViewModel(
    private val getCardsByQuestionUseCase: GetCardsByQuestionUseCase,
    private val getReadingInterpretationUseCase: GetReadingInterpretationUseCase
) : ViewModel() {
    private val _viewState = MutableStateFlow<QuestionReadingState>(QuestionReadingState.Loading)
    val viewState: StateFlow<QuestionReadingState>
        get() = _viewState
    private val _viewAction = MutableStateFlow<QuestionReadingAction?>(null)
    val viewAction: StateFlow<QuestionReadingAction?>
        get() = _viewAction

    fun obtainEvent(event: QuestionReadingEvent) {
        when (event) {
            is QuestionReadingEvent.BackClicked -> backClicked()
            is QuestionReadingEvent.LoadCards -> loadCards(event.question)
        }
    }

    private fun loadCards(question: String) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val reading = getCardsByQuestionUseCase.execute(question)
                if (reading != null) {
                    val state = QuestionReadingState.MainState(
                        question = question,
                        cards = reading.cards
                    )
                    _viewState.value = state
                    delay(3000)
                    val interpretation = getReadingInterpretationUseCase.execute(reading.readingId)
                    _viewState.value = state.copy(
                        reading = interpretation ?: "Ошибка сервера",
                        isReadingLoading = false
                    )
                } else {
                    _viewState.value = QuestionReadingState.Error
                }

            }
        }

    }

    private fun backClicked() {
        _viewAction.value = QuestionReadingAction.NavigateToQuestion
    }
}
