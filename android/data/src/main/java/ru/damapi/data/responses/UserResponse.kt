package ru.damapi.data.responses

import ru.damapi.domain.models.UserModel

data class UserResponse(
    val uuid: String,
    val name: String,
    val email: String,
    val date_of_registration: String,
    val prefs: Map<String, Any>,
    val card_of_the_day: Int
) {
    fun toModel(): UserModel? {
        return UserModel(
            uuid = uuid,
            username = name,
            email = email,
            dateOfRegistration = date_of_registration,
            cardOfTheDayId = card_of_the_day
        )
    }
}