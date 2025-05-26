package ru.damapi.data.api

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT
import ru.damapi.data.requests.AuthRequest
import ru.damapi.data.requests.UpdateNameRequest
import ru.damapi.data.responses.CardResponse
import ru.damapi.data.responses.TokenResponse
import ru.damapi.data.responses.UserResponse

interface UserApi {
    @POST("auth/signin")
    suspend fun signin(@Body request: AuthRequest): TokenResponse

    @POST("auth/signup")
    suspend fun signup(@Body request: AuthRequest): TokenResponse

    @PUT("user/update_name")
    suspend fun updateName(
        @Header("Authorization") token: String,
        @Body updateNameRequest: UpdateNameRequest
    ): UserResponse

    @GET("user/me")
    suspend fun getUserByToken(
        @Header("Authorization") token: String
    ): UserResponse

    @GET("get_my_card_of_the_day")
    suspend fun getCardOfTheDay(
        @Header("Authorization") token: String
    ): CardResponse
}