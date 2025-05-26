package ru.damapi.divinaition.ui.start

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import ru.damapi.domain.use_cases.GetCurrentUserUseCase

class StartViewModel(
    private val getCurrentUserUseCase: GetCurrentUserUseCase
) : ViewModel() {
    private val _viewState = MutableStateFlow<StartState>(StartState.Loading)
    val viewState: StateFlow<StartState>
        get() = _viewState
    private val _viewAction = MutableStateFlow<StartAction?>(null)
    val viewAction: StateFlow<StartAction?>
        get() = _viewAction

    init {
        checkIfUserIsLoggedIn()
        //checkInternetConnection?
    }

    fun obtainEvent(event: StartEvent) {
        when(event) {
            is StartEvent.ClearAction -> _viewAction.value = null
        }

    }

    private fun checkIfUserIsLoggedIn() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val user = getCurrentUserUseCase.execute()
                if (user != null) {
                    _viewAction.value = StartAction.NavigateToHome
                } else {
                    _viewAction.value = StartAction.NavigateToLogin
                }
            }
        }
    }
}