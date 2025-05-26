package ru.damapi.domain.use_cases

import ru.damapi.domain.repositories.UserRepository

class GetCardOfTheDayUseCase(private val repo: UserRepository) {
    suspend fun execute() = repo.getCardOfTheDay()
}