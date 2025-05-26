package ru.damapi.data

import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.damapi.data.api.ReadingApi
import ru.damapi.data.api.UserApi
import ru.damapi.data.repositories_impl.ReadingRepositoryImpl
import ru.damapi.data.repositories_impl.SharedPrefsRepositotyImpl
import ru.damapi.data.repositories_impl.UserRepositoryImpl
import ru.damapi.data.repositories_test.ReadingRepositoryTest
import ru.damapi.data.repositories_test.UserRepositoryTest
import ru.damapi.domain.repositories.ReadingRepository
import ru.damapi.domain.repositories.SharedPrefsRepository
import ru.damapi.domain.repositories.UserRepository

const val baseUrl = "https://backend.divinaition.online/api/v1/"

val dataModule = module {
    single<OkHttpClient> { OkHttpClient() }
    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    single<UserApi> { get<Retrofit>().create(UserApi::class.java) }
    single<ReadingApi> { get<Retrofit>().create(ReadingApi::class.java) }

    single<SharedPrefsRepository> { SharedPrefsRepositotyImpl(get()) }
    single<UserRepository> { UserRepositoryImpl(get(), get()) }
    single<ReadingRepository> { ReadingRepositoryImpl(get(), get()) }
}