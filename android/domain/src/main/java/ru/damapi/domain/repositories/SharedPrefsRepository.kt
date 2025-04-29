package ru.damapi.domain.repositories

interface SharedPrefsRepository {
    suspend fun saveUserToken(token: String): Boolean
    suspend fun getUserToken(): String?
    suspend fun deleteUserToken(): Boolean
}