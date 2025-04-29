package ru.damapi.data.repositories_test

import ru.damapi.domain.models.UserModel
import ru.damapi.domain.repositories.UserRepository
import ru.damapi.domain.use_cases.LoginResult
import ru.damapi.domain.use_cases.SIGNUP_RESULT

class UserRepositoryTest : UserRepository {
    override suspend fun login(email: String, password: String): LoginResult {
        return LoginResult.OK
    }

    override suspend fun signup(email: String, password: String, username: String): SIGNUP_RESULT {
        return SIGNUP_RESULT.OK
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
}