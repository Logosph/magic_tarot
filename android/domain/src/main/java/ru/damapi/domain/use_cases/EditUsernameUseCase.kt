package ru.damapi.domain.use_cases

import ru.damapi.domain.repositories.UserRepository

class EditUsernameUseCase(
    private val userRepository: UserRepository
) {
    suspend fun execute(username: String): Boolean {
        return userRepository.updateName(username)
    }
}