package ru.damapi.divinaition.ui.start

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavController
import org.koin.androidx.compose.koinViewModel
import ru.damapi.divinaition.ui.Screen
import ru.damapi.divinaition.ui.divine_composables.DivineLoadingScreen

@Composable
fun StartView(
    navController: NavController,
    viewModel: StartViewModel = koinViewModel()
) {
    val viewState = viewModel.viewState.collectAsState()
    val viewAction = viewModel.viewAction.collectAsState()

    when (viewAction.value) {
        is StartAction.NavigateToLogin -> {
            viewModel.obtainEvent(StartEvent.ClearAction)
            navController.navigate(Screen.LoginScreen.route) {
                popUpTo(Screen.StartScreen.route) { inclusive = true }
            }
        }

        is StartAction.NavigateToHome -> {
            viewModel.obtainEvent(StartEvent.ClearAction)
            navController.navigate(Screen.HomeScreen.route) {
                popUpTo(Screen.StartScreen.route) { inclusive = true }
            }
        }

        null -> {}
    }

    when (viewState.value) {
        is StartState.Loading -> DivineLoadingScreen()
    }

}