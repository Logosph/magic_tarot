package ru.damapi.domain.use_cases

import ru.damapi.domain.repositories.UserRepository

class LoginUseCase(
    private val repo: UserRepository
) {
    suspend fun execute(email: String, password: String): LoginResult {
        return repo.login(email, password)
    }
}

enum class LoginResult(val error: String) {
    OK(""),
    WRONG_EMAIL("Пользователя с такой почтой не существует"),
    WORNG_PASSWORD("Неправильный пароль"),
    NETWORK_ERROR("Ошибка сети. Проверьте подключение"),
    SERVER_ERROR("Ошибка сервера. Попробуйте повторить запрос")
}