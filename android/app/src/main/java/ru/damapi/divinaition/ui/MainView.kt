package ru.damapi.divinaition.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import ru.damapi.divinaition.ui.divine_composables.AuthBackground
import ru.damapi.divinaition.ui.divine_composables.HomeBackground
import ru.damapi.divinaition.ui.divine_composables.MainBackground
import ru.damapi.divinaition.ui.vectors.icons.Back

@Composable
fun MainView(
    navController: NavHostController = rememberNavController()
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val routesWithoutBackOption: Set<String> = setOf(
        Screen.StartScreen.route,
        Screen.LoginScreen.route,
        Screen.SignupScreen.route,
        Screen.HomeScreen.route
    )

    MaterialTheme {
        Scaffold { padding ->
            Background(currentRoute = currentRoute)
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                if (currentRoute !in routesWithoutBackOption) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Icon(
                            imageVector = Back,
                            contentDescription = "Back",
                            modifier = Modifier
                                .padding(16.dp)
                                .clickable {
                                    navController.popBackStack()
                                }
                        )
                    }
                }
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
