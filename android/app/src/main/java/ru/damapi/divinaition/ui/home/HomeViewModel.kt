package ru.damapi.divinaition.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import ru.damapi.domain.use_cases.GetCardOfTheDayUseCase

class HomeViewModel(
    private val getCardOfTheDayUseCase: GetCardOfTheDayUseCase
): ViewModel() {
    private val _viewState = MutableStateFlow<HomeState>(HomeState.Main())
    val viewState: StateFlow<HomeState>
        get() = _viewState
    private val _viewAction = MutableStateFlow<HomeAction?>(null)
    val viewAction: StateFlow<HomeAction?>
        get() = _viewAction

    fun obtainEvent(event: HomeEvent) {
        when (event) {
            is HomeEvent.TemplatesClicked -> _viewAction.value = HomeAction.NavigateToTemplates
            is HomeEvent.QuestionClicked -> _viewAction.value = HomeAction.NavigateToQuestion
            is HomeEvent.ProfileClicked -> _viewAction.value = HomeAction.NavigateToProfile
            is HomeEvent.ShowCardOfTheDay -> cardOfTheDayClicked()
            is HomeEvent.ClearAction -> _viewAction.value = null
            HomeEvent.HideCardOfTheDay -> hideCardOfTheDay()
        }
    }

    private fun hideCardOfTheDay() {
        val state = _viewState.value
        if (state is HomeState.Main) {
            _viewState.value = state.copy(showCardOfTheDay = false)
        }
    }

    private fun cardOfTheDayClicked() {
        val state = _viewState.value
        if (state !is HomeState.Main) return
        if (state.cardOfTheDay == null) {
            _viewState.value = state.copy(
                isLoading = true
            )
            viewModelScope.launch {
                val card = getCardOfTheDayUseCase.execute()
                _viewState.value = state.copy(
                    isLoading = false,
                    cardOfTheDay = card,
                    showCardOfTheDay = (card != null)
                )
            }
        } else {
            _viewState.value = state.copy(
                showCardOfTheDay = true
            )
        }
    }
}