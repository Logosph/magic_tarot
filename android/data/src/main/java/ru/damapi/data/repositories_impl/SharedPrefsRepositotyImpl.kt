package ru.damapi.data.repositories_impl

import android.content.Context
import ru.damapi.domain.repositories.SharedPrefsRepository

class SharedPrefsRepositotyImpl(context: Context) : SharedPrefsRepository {
    private val sharedPrefs = context.getSharedPreferences("prefs", Context.MODE_PRIVATE)
    override suspend fun saveUserToken(token: String) =
        sharedPrefs.edit().putString(PROPERTY.TOKEN.name, token).commit()

    override suspend fun getUserToken() =
        sharedPrefs.getString(PROPERTY.TOKEN.name, null)

    override suspend fun deleteUserToken() =
        sharedPrefs.edit().putString(PROPERTY.TOKEN.name, null).commit()
}

enum class PROPERTY {
    TOKEN
}