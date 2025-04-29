package ru.damapi.divinaition.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.damapi.divinaition.ui.home.HomeView
import ru.damapi.divinaition.ui.login.LoginView
import ru.damapi.divinaition.ui.signup.SignupView


sealed class Screen(val route: String) {
    data object LoginScreen : Screen("login")
    data object SignupScreen : Screen("signup")
    data object HomeScreen : Screen("home")
}

@Composable
fun SetUpNavHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = Screen.LoginScreen.route) {
        composable(route = Screen.LoginScreen.route) { LoginView(navController) }
        composable(route = Screen.SignupScreen.route) { SignupView(navController) }
        composable(route = Screen.HomeScreen.route) { HomeView(navController) }
    }
}