package ru.damapi.data.api

import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT
import ru.damapi.data.requests.GetInterpretationRequest
import ru.damapi.data.requests.GetReadingByQuestionRequest
import ru.damapi.data.responses.InterpretationResponse
import ru.damapi.data.responses.ReadingResponse

interface ReadingApi {
    @POST("readings/get_reading_by_question")
    suspend fun getCardsByQuestion(
        @Header("Authorization") token: String,
        @Body readingRequest: GetReadingByQuestionRequest
    ): ReadingResponse

    @PUT("readings/get_interpretation")
    suspend fun getInterpretation(
        @Header("Authorization") token: String,
        @Body interpretationRequest: GetInterpretationRequest
    ): InterpretationResponse
}