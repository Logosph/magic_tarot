package ru.damapi.domain.repositories

import ru.damapi.domain.models.CardOfTheDayModel
import ru.damapi.domain.models.UserModel
import ru.damapi.domain.use_cases.LoginResult
import ru.damapi.domain.use_cases.SignupResult

interface UserRepository {
    suspend fun login(email: String, password: String): LoginResult
    suspend fun signup(email: String, password: String, username:String): SignupResult
    suspend fun getCurrentUser(): UserModel?
    suspend fun getCardOfTheDay(): CardOfTheDayModel?
}


