package ru.damapi.divinaition.ui.question

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class QuestionViewModel(

) : ViewModel() {
    private val _viewState = MutableStateFlow<QuestionState>(QuestionState.MainState())
    val viewState: StateFlow<QuestionState>
        get() = _viewState
    private val _viewAction = MutableStateFlow<QuestionAction?>(null)
    val viewAction: StateFlow<QuestionAction?>
        get() = _viewAction

    fun obtainEvent(event: QuestionEvent) {
        when (event) {
            is QuestionEvent.QuestionChanged -> questionChanged(event.question)
            is QuestionEvent.AskClicked -> askClicked()
            is QuestionEvent.ClearAction -> clearAction()
        }
    }

    private fun clearAction() {
        _viewAction.value = null
        _viewState.value = QuestionState.MainState()
    }

    private fun askClicked() {
        val state = _viewState.value
        if (state !is QuestionState.MainState || state.question.isBlank()) {
            return
        }
        _viewAction.value = QuestionAction.NavigateToReading(state.question)
    }

    private fun questionChanged(question: String) {
        val state = _viewState.value
        if (state !is QuestionState.MainState) return
        _viewState.value = state.copy(question = question)
    }
}