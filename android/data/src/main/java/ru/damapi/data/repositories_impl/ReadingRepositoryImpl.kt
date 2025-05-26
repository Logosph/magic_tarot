package ru.damapi.data.repositories_impl

import android.util.Log
import ru.damapi.data.api.ReadingApi
import ru.damapi.data.requests.GetInterpretationRequest
import ru.damapi.data.requests.GetReadingByQuestionRequest
import ru.damapi.domain.models.ReadingWithCardsModel
import ru.damapi.domain.repositories.ReadingRepository
import ru.damapi.domain.repositories.SharedPrefsRepository

class ReadingRepositoryImpl(
    private val readingApi: ReadingApi,
    private val sharedPrefs: SharedPrefsRepository
) : ReadingRepository {
    override suspend fun getCardsByQuestion(question: String): ReadingWithCardsModel? {
        val token = sharedPrefs.getUserToken() ?: return null
        Log.d("server req", "getCardsByQuestion: $question")
        try {
            val reading = readingApi.getCardsByQuestion(
                readingRequest = GetReadingByQuestionRequest(
                    question = question
                ),
                token = "Bearer $token"
            )
            Log.d("server resp", "getCardsByQuestion: $reading")
            return reading.toModel()
        } catch (e: Exception) {
            Log.e("server resp", "getCardsByQuestion: ${e.message}")
            return null
        }
    }

    override suspend fun getInterpretation(readingId: Int): String? {
        val token = sharedPrefs.getUserToken() ?: return null
        Log.d("server req", "getInterpretation: $readingId")
        try {
            val interpretation = readingApi.getInterpretation(
                token = "Bearer $token",
                interpretationRequest = GetInterpretationRequest(
                    reading_id = readingId
                )
            ).interpretation
            Log.d("server resp", "getInterpretation: $interpretation")
            return interpretation
        } catch (e: Exception) {
            Log.e("server resp", "getInterpretation: ${e.message}")
            return null
        }
    }
}