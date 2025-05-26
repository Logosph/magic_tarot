package ru.damapi.divinaition.ui.profile

import ru.damapi.domain.models.UserModel

sealed class ProfileState() {
    data class Main(
        val user: UserModel,
    ): ProfileState()
    data object Loading: ProfileState()
    data object Error: ProfileState()
}

sealed class ProfileEvent() {
    data object LoadUser: ProfileEvent()
    data class EditUsername(val username: String): ProfileEvent()
}