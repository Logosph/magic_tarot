package ru.damapi.domain.use_cases

import ru.damapi.domain.repositories.UserRepository

class SignupUseCase(
    private val repo: UserRepository
) {
    suspend fun execute(
        email: String,
        username: String,
        password: String,
        confirmPassword: String
    ): SignupResult {
        val invalidPasswordCharsRegex = "[^a-zA-Z0-9!@#$%^&*()_+{}\\[\\]:;<>,.?~\\\\/-]".toRegex()
        val passwordRegex =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9!@#$%^&*()_+{}\\[\\]:;<>,.?~\\\\/-]{8,}$".toRegex()
        val usernameRegex = "^[a-zA-Z0-9_а-яА-Я]+$".toRegex()
        if (password != confirmPassword) {
            return SignupResult.PASSWORDS_DO_NOT_MATCH
        }
        if (invalidPasswordCharsRegex.containsMatchIn(password)) {
            return SignupResult.PASSWORD_INCORRECT
        }
        if (!password.matches(passwordRegex)) {
            return SignupResult.PASSWORD_WEAK
        }
        if (username.length < 3 || username.length > 15) {
            return SignupResult.USERNAME_LENGTH
        } else if (!username.matches(usernameRegex)) {
            return SignupResult.USERNAME_INCORRECT
        }
        return repo.signup(email, password, username)
    }
}

enum class SignupResult(val error: String) {
    OK(""),
    PASSWORDS_DO_NOT_MATCH("Пароли не совпадают"),
    PASSWORD_WEAK("Слабый пароль"),
    PASSWORD_INCORRECT("Пароль содержит запрещенные символы"),
    EMAIL_TAKEN("Пользователь с такой почтой уже существует"),
    USERNAME_TAKEN("Пользователь с таким именем уже существует"),
    USERNAME_LENGTH("Имя пользователя должно содеражть от 3 до 15 символов"),
    USERNAME_INCORRECT("Имя пользователя содержит запрещенные символы"),
    NETWORK_ERROR("Ошибка сети. Проверьте подключение"),
    SERVER_ERROR("Ошибка сервера. Попробуйте повторить запрос")
}

fun isValidPassword(password: String): Boolean {
    if (password.length < 8) {
        return false
    }

    val hasUppercase = password.any { it.isUpperCase() && it.isLetter() }
    val hasLowercase = password.any { it.isLowerCase() && it.isLetter() }
    val hasDigit = password.any { it.isDigit() }

    return hasUppercase && hasLowercase && hasDigit
}