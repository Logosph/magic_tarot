package ru.damapi.data.repositories_test

import ru.damapi.domain.models.CardModel
import ru.damapi.domain.models.UserModel
import ru.damapi.domain.repositories.UserRepository
import ru.damapi.domain.use_cases.LoginResult
import ru.damapi.domain.use_cases.SignupResult

class UserRepositoryTest : UserRepository {
    override suspend fun login(email: String, password: String): LoginResult {
        return LoginResult.OK
    }

    override suspend fun signup(email: String, password: String, username: String): SignupResult {
        return SignupResult.OK
    }

    override suspend fun getCurrentUser(): UserModel? {
        return UserModel(
            uuid = "uuid",
            username = "Admin",
            email = "admin@admin.com",
            dateOfRegistration = "2025-04-29",
            cardOfTheDayId = 0
        )
    }

    override suspend fun getCardOfTheDay(): CardModel? {
        return CardModel(
            id = 0,
            name = "The Fool",
            meaning = "New beginnings, innocence, spontaneity, a free spirit",
            imageUrl = null,
            interpretationOfTheDay = "Today is a day for new beginnings. Embrace the unknown and take a leap of faith."
        )
    }
}