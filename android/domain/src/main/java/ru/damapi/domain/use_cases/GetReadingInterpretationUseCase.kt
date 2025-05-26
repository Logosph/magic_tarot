package ru.damapi.domain.use_cases

import ru.damapi.domain.repositories.ReadingRepository

class GetReadingInterpretationUseCase(
    private val repo: ReadingRepository
) {
    suspend fun execute(readingId: Int): String? {
        return repo.getInterpretation(readingId)
    }
}