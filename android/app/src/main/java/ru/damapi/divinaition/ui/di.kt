package ru.damapi.divinaition.ui

import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import ru.damapi.data.dataModule
import ru.damapi.divinaition.ui.login.LoginViewModel
import ru.damapi.domain.use_cases.GetCurrentUserUseCase
import ru.damapi.domain.use_cases.LoginUseCase
import ru.damapi.domain.use_cases.SignupUseCase

val domainModule = module {
    factory<LoginUseCase> {LoginUseCase(get())}
    factory<SignupUseCase> {SignupUseCase(get())}
    factory<GetCurrentUserUseCase> {GetCurrentUserUseCase(get())}
}

val appModule = module {
    viewModel<LoginViewModel> {LoginViewModel(get(), get())}
}

val koinModules = listOf(dataModule, domainModule, appModule)