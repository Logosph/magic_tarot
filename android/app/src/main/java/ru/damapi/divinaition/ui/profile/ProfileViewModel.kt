package ru.damapi.divinaition.ui.profile

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import ru.damapi.domain.models.UserModel
import ru.damapi.domain.use_cases.EditUsernameUseCase
import ru.damapi.domain.use_cases.GetCurrentUserUseCase

class ProfileViewModel (
    private val getCurrentUserUseCase: GetCurrentUserUseCase,
    private val editUsernameUseCase: EditUsernameUseCase
): ViewModel() {
    private val _viewState = MutableStateFlow<ProfileState>(ProfileState.Loading)
    val viewState: StateFlow<ProfileState>
        get() = _viewState

    fun obtainEvent(event: ProfileEvent) {
        when (event) {
            is ProfileEvent.LoadUser -> loadUser()
            is ProfileEvent.EditUsername -> editUsername(event.username)
        }
    }

    private fun editUsername(username: String) {
        val state = _viewState.value
        if (state is ProfileState.Main) {
            viewModelScope.launch {
                withContext(Dispatchers.IO) {
                    val result = editUsernameUseCase.execute(username)
                    if (result) {
                        val updatedUser = state.user.copy(username = username)
                        _viewState.value = ProfileState.Main(user = updatedUser)
                    } else {
                        _viewState.value = ProfileState.Error
                    }
                }
            }
        } else {
            Log.e("ProfileViewModel", "Cannot edit username, current state is not Main")
        }
    }

    private fun loadUser() {
        val state = _viewState.value
        _viewState.value = ProfileState.Loading
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val user = getCurrentUserUseCase.execute()
                if (user != null) {
                    _viewState.value = ProfileState.Main(user = user)
                } else {
                    _viewState.value = ProfileState.Error
                }
            }
        }
    }
}