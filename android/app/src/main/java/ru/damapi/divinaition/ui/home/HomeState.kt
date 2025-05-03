package ru.damapi.divinaition.ui.home

import ru.damapi.domain.models.CardOfTheDayModel

sealed class HomeState {
    data class Main(
        val isLoading: Boolean = false,
        val cardOfTheDay: CardOfTheDayModel? = null,
        val showCardOfTheDay: Boolean = false,
    ): HomeState()
    data object Loading: HomeState()
}

sealed class HomeEvent() {
    data object TemplatesClicked: HomeEvent()
    data object QuestionClicked: HomeEvent()
    data object ProfileClicked: HomeEvent()
    data object ShowCardOfTheDay: HomeEvent()
    data object HideCardOfTheDay: HomeEvent()
    data object ClearAction: HomeEvent()
}

sealed class HomeAction() {
    data object NavigateToTemplates: HomeAction()
    data object NavigateToQuestion: HomeAction()
    data object NavigateToProfile: HomeAction()
}