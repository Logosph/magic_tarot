package ru.damapi.divinaition.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import ru.damapi.divinaition.ui.divine_composables.AuthBackground
import ru.damapi.divinaition.ui.divine_composables.HomeBackground
import ru.damapi.divinaition.ui.divine_composables.MainBackground

@Composable
fun MainView(
    navController: NavHostController = rememberNavController()
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Scaffold { padding ->
            Background(currentRoute = currentRoute)
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                SetUpNavHost(navController)
            }
        }
    }
}

@Composable
fun Background(currentRoute: String?) {
    when (currentRoute) {
        Screen.LoginScreen.route, Screen.SignupScreen.route -> {
            AuthBackground()
        }
        Screen.HomeScreen.route -> {
            HomeBackground()
        }
        else -> {
            MainBackground()
        }
    }
}
