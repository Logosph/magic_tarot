package ru.damapi.data

import org.koin.dsl.module
import ru.damapi.data.repositories_impl.SharedPrefsRepositotyImpl
import ru.damapi.data.repositories_test.UserRepositoryTest
import ru.damapi.domain.repositories.SharedPrefsRepository
import ru.damapi.domain.repositories.UserRepository

val dataModule = module {
    single<SharedPrefsRepository> {SharedPrefsRepositotyImpl(get())}
    single<UserRepository> {UserRepositoryTest()}
}