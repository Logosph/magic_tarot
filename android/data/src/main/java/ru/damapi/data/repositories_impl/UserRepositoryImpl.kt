package ru.damapi.data.repositories_impl

import android.util.Log
import ru.damapi.data.api.UserApi
import ru.damapi.data.requests.AuthRequest
import ru.damapi.data.requests.UpdateNameRequest
import ru.damapi.domain.models.CardModel
import ru.damapi.domain.models.UserModel
import ru.damapi.domain.repositories.SharedPrefsRepository
import ru.damapi.domain.repositories.UserRepository
import ru.damapi.domain.use_cases.LoginResult
import ru.damapi.domain.use_cases.SignupResult

class UserRepositoryImpl(
    private val userApi: UserApi,
    private val sharedPrefs: SharedPrefsRepository
) : UserRepository {
    override suspend fun login(email: String, password: String): LoginResult {
        Log.d("server req", "login: $email $password")
        try {
            val response = userApi.signin(
                AuthRequest(
                    email = email,
                    password = password
                )
            )
            Log.d("server resp", "login: $response")
            sharedPrefs.saveUserToken(response.access_token)
            return LoginResult.OK
        } catch (e: Exception) {
            Log.e("server resp", "login: ${e.message}")
            return LoginResult.WORNG_PASSWORD
        }
    }

    override suspend fun signup(email: String, password: String, username: String): SignupResult {
        Log.d("server req", "signup: $email $password $username")
        //422 -> emailTaken
        return try {
            val response = userApi.signup(
                AuthRequest(
                    email = email,
                    password = password
                )
            )
            Log.d("server resp", "signup: $response")
            sharedPrefs.saveUserToken(response.access_token)
            SignupResult.OK
        }
        catch (e: Exception) {
            Log.e("server resp", "signup: ${e.message}")
            if (e.message?.contains("422") == true) {
                SignupResult.EMAIL_TAKEN
            } else {
                SignupResult.SERVER_ERROR
            }
        }
    }

    override suspend fun updateName(name: String): Boolean {
        val token = sharedPrefs.getUserToken()
        Log.d("server req", "updateName: $name, token: $token")
        try {
            userApi.updateName(
                token = "Bearer $token",
                updateNameRequest = UpdateNameRequest(
                    name = name
                )
            )
            Log.d("server resp", "updateName: success")
            return true
        } catch (e: Exception) {
            Log.e("server resp", "updateName: ${e.message}")
            return false
        }
    }

    override suspend fun getCurrentUser(): UserModel? {
        val token = sharedPrefs.getUserToken()
        Log.d("server req", "getCurrentUser: $token")
        try {
            val response = userApi.getUserByToken(
                token = "Bearer $token"
            )
            Log.d("server resp", "getCurrentUser: $response")
            return response.toModel()
        } catch (e: Exception) {
            Log.e("server resp", "getCurrentUser: ${e.message}")
            return null
        }
    }

    override suspend fun getCardOfTheDay(): CardModel? {
        val token = sharedPrefs.getUserToken()
        Log.d("server req", "getCardOfTheDay: $token")
        try {
            val card = userApi.getCardOfTheDay(
                token = "Bearer $token"
            )
            Log.d("server resp", "getCardOfTheDay: $card")
            return card.toModel()
        } catch (e: Exception) {
            Log.e("server resp", "getCardOfTheDay: ${e.message}")
            return null
        }
    }
}

