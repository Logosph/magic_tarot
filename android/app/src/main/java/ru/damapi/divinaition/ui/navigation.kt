package ru.damapi.divinaition.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import ru.damapi.divinaition.ui.home.HomeView
import ru.damapi.divinaition.ui.login.LoginView
import ru.damapi.divinaition.ui.profile.ProfileView
import ru.damapi.divinaition.ui.question.QuestionView
import ru.damapi.divinaition.ui.question_reading.QuestionReadingView
import ru.damapi.divinaition.ui.signup.SignupView
import ru.damapi.divinaition.ui.start.StartView


sealed class Screen(val route: String) {
    data object StartScreen : Screen("start")
    data object LoginScreen : Screen("login")
    data object SignupScreen : Screen("signup")
    data object HomeScreen : Screen("home")
    data object QuestionScreen : Screen("question")
    data object QuestionReadingScreen : Screen("question_reading/{question}") {
        fun createRoute(question: String) = "question_reading/$question"
    }
    data object ProfileScreen : Screen("profile")
}

@Composable
fun SetUpNavHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = Screen.StartScreen.route) {
        composable(route = Screen.StartScreen.route) { StartView(navController) }
        composable(route = Screen.LoginScreen.route) { LoginView(navController) }
        composable(route = Screen.SignupScreen.route) { SignupView(navController) }
        composable(route = Screen.HomeScreen.route) { HomeView(navController) }
        composable(route = Screen.QuestionScreen.route) {
            QuestionView(navController)
        }
        composable(
            route = Screen.QuestionReadingScreen.route,
            arguments = listOf(navArgument("question") { type = NavType.StringType })
        ) { backStackEntry ->
            val question = backStackEntry.arguments?.getString("question") ?: ""
            QuestionReadingView(navController, question)
        }
        composable(route = Screen.ProfileScreen.route) {
            ProfileView()
        }
    }
}