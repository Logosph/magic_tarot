package ru.damapi.divinaition.ui

import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import ru.damapi.data.dataModule
import ru.damapi.divinaition.ui.home.HomeViewModel
import ru.damapi.divinaition.ui.login.LoginViewModel
import ru.damapi.divinaition.ui.signup.SignupViewModel
import ru.damapi.divinaition.ui.start.StartViewModel
import ru.damapi.domain.use_cases.GetCardOfTheDayUseCase
import ru.damapi.domain.use_cases.GetCurrentUserUseCase
import ru.damapi.domain.use_cases.LoginUseCase
import ru.damapi.domain.use_cases.SignupUseCase

val domainModule = module {
    factory<LoginUseCase> {LoginUseCase(get())}
    factory<SignupUseCase> {SignupUseCase(get())}
    factory<GetCurrentUserUseCase> {GetCurrentUserUseCase(get())}
    factory<GetCardOfTheDayUseCase> {GetCardOfTheDayUseCase(get())}
}

val appModule = module {
    viewModel<StartViewModel> {StartViewModel(get())}
    single<LoginViewModel> {LoginViewModel(get(), get())}
    single<SignupViewModel> {SignupViewModel(get())}
    viewModel<HomeViewModel> {HomeViewModel(get())}
}

val koinModules = listOf(dataModule, domainModule, appModule)