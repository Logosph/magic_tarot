package ru.damapi.domain.models

data class UserModel (
    val uuid: String,
    val username: String,
    val email: String,
    val dateOfRegistration: String,
    val cardOfTheDayId: Int
)