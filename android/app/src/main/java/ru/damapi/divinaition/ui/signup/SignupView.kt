package ru.damapi.divinaition.ui.signup

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import org.koin.androidx.compose.koinViewModel
import ru.damapi.divinaition.ui.divine_composables.DivineButton
import ru.damapi.divinaition.ui.divine_composables.DivinePasswordField
import ru.damapi.divinaition.ui.divine_composables.DivineTextButton
import ru.damapi.divinaition.ui.divine_composables.DivineTextField
import ru.damapi.divinaition.ui.divine_composables.DivineTitle
import ru.damapi.divinaition.ui.Screen
import ru.damapi.divinaition.ui.vectors.backgrounds.Star


@Composable
fun SignupView(
    navController: NavController,
    viewModel: SignupViewModel = koinViewModel()
) {
    val viewState = viewModel.viewState.collectAsState()
    val viewAction = viewModel.viewAction.collectAsState()

    when (viewAction.value) {
        is SignupAction.NavigateToLogin -> {
            val currentEntry = navController.currentBackStackEntry
            val previousEntry = navController.previousBackStackEntry
            Log.d("StateDebug", "Current destination: ${currentEntry?.destination?.route}")
            Log.d("StateDebug", "Previous destination: ${previousEntry?.destination?.route}")
            viewModel.obtainEvent(SignupEvent.ClearAction)
            navController.navigate(Screen.LoginScreen.route) {
                launchSingleTop = true
                restoreState = true
            }
        }

        is SignupAction.NavigateToHome -> {
            viewModel.obtainEvent(SignupEvent.ClearAction)
            navController.navigate(Screen.HomeScreen.route) {
                popUpTo(Screen.LoginScreen.route) { inclusive = true }
            }
        }

        null -> {}
    }

    when (val state = viewState.value) {
        is SignupState.Main -> {
            MainState(
                state,
                onProceedClicked = { email, username, password, confirmPassword ->
                    viewModel.obtainEvent(
                        SignupEvent.ProceedClicked(
                            email,
                            username,
                            password,
                            confirmPassword
                        )
                    )
                },
                onLoginClicked = { viewModel.obtainEvent(SignupEvent.LoginClicked) },
                onEmailChanged = { viewModel.obtainEvent(SignupEvent.EmailChanged(it)) },
                onUsernameChanged = { viewModel.obtainEvent(SignupEvent.UsernameChanged(it)) },
                onPasswordChanged = { viewModel.obtainEvent(SignupEvent.PasswordChanged(it)) },
                onConfirmPasswordChanged = {
                    viewModel.obtainEvent(
                        SignupEvent.ConfirmPasswordChanged(
                            it
                        )
                    )
                }
            )
        }

        is SignupState.Loading -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(text = "Loading...")
            }
        }
    }
}


@Composable
fun MainState(
    state: SignupState.Main,
    onProceedClicked: (String, String, String, String) -> Unit,
    onLoginClicked: () -> Unit,
    onEmailChanged: (String) -> Unit,
    onUsernameChanged: (String) -> Unit,
    onPasswordChanged: (String) -> Unit,
    onConfirmPasswordChanged: (String) -> Unit,
) {
    val email = remember { mutableStateOf(state.email) }
    val username = remember { mutableStateOf(state.username) }
    val password = remember { mutableStateOf(state.password) }
    val confirmPassword = remember { mutableStateOf(state.confirmPassword) }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(64.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    modifier = Modifier.size(40.dp),
                    imageVector = Star,
                    contentDescription = "Star",
                )
                DivineTitle(
                    text = "Регистрация"
                )
                Icon(
                    modifier = Modifier.size(40.dp),
                    imageVector = Star,
                    contentDescription = "Star",
                )
            }
            DivineTextField(
                label = "Почта",
                text = email.value,
                onValueChanged = { email.value = it },
                onFocusChanged = { onEmailChanged(it) },
                errorMessage = state.emailError
            )
            DivineTextField(
                label = "Имя пользователя",
                text = username.value,
                onValueChanged = { username.value = it },
                onFocusChanged = { onUsernameChanged(it) },
                errorMessage = state.userNameError
            )
            DivinePasswordField(
                label = "Пароль",
                input = password.value,
                onValueChanged = { password.value = it },
                onFocusChanged = { onPasswordChanged(it) },
                errorMessage = state.passwordError
            )
            DivinePasswordField(
                label = "Подтверждение пароля",
                input = confirmPassword.value,
                onValueChanged = { confirmPassword.value = it },
                onFocusChanged = { onConfirmPasswordChanged(it) },
                errorMessage = state.confirmPassworError
            )
            DivineButton(
                text = "Войти",
                onClick = {
                    onProceedClicked(
                        email.value,
                        username.value,
                        password.value,
                        confirmPassword.value
                    )
                },
            )
        }
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            DivineTextButton(
                text = "Уже есть аккаунт? Войдите!",
                onClick = onLoginClicked,
            )
        }
    }
}