package ru.damapi.data.responses

import ru.damapi.domain.models.UserModel
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

data class UserResponse(
    val uuid: String,
    val name: String?,
    val email: String,
    val date_of_registration: String,
    val prefs: Map<String, Any>,
    val card_of_the_day: Int?
) {
    fun toModel(): UserModel? {
        return UserModel(
            uuid = uuid,
            username = name?: "",
            email = email,
            dateOfRegistration = formatDateToDateOnly(date_of_registration),
            cardOfTheDayId = card_of_the_day?: -1,
        )
    }

    fun formatDateToDateOnly(input: String): String {
        val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS", Locale.getDefault())
        val outputFormat = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault())

        return try {
            val date = inputFormat.parse(input)
            outputFormat.format(date ?: Date())
        } catch (e: Exception) {
            ""
        }
    }
}