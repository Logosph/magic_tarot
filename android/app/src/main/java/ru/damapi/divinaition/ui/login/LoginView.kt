package ru.damapi.divinaition.ui.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import org.koin.compose.koinInject
import ru.damapi.divinaition.ui.Screen
import ru.damapi.divinaition.ui.divine_composables.DivineButton
import ru.damapi.divinaition.ui.divine_composables.DivineLoadingScreen
import ru.damapi.divinaition.ui.divine_composables.DivinePasswordField
import ru.damapi.divinaition.ui.divine_composables.DivineTextButton
import ru.damapi.divinaition.ui.divine_composables.DivineTextField
import ru.damapi.divinaition.ui.divine_composables.DivineTitle
import ru.damapi.divinaition.ui.vectors.backgrounds.Star

@Composable
fun LoginView(
    navController: NavController,
    viewModel: LoginViewModel = koinInject()
) {
    val viewState = viewModel.viewState.collectAsState()
    val viewAction = viewModel.viewAcion.collectAsState()

    when (viewAction.value) {
        is LoginAction.NavigateToSignup -> {
            viewModel.obtainEvent(LoginEvent.ClearAction)
            navController.navigate(Screen.SignupScreen.route) {
                launchSingleTop = true
                restoreState = true
            }
        }

        is LoginAction.NavigateToHome -> {
            viewModel.obtainEvent(LoginEvent.ClearAction)
            navController.navigate(Screen.HomeScreen.route) {
                popUpTo(Screen.LoginScreen.route) { inclusive = true }
            }
        }

        null -> {}
    }

    when (val state = viewState.value) {
        is LoginState.Main -> {
            MainState(
                state,
                onLoginClicked = { email, password -> viewModel.obtainEvent(LoginEvent.ProceedClicked(email, password)) },
                onSignupClicked = { email, password -> viewModel.obtainEvent(LoginEvent.SignupClicked(email, password)) },
                onEmailChanged = { email -> viewModel.obtainEvent(LoginEvent.EmailChanged(email)) },
                onPasswordChanged = { password ->
                    viewModel.obtainEvent(
                        LoginEvent.PasswordChanged(
                            password
                        )
                    )
                }
            )
        }

        is LoginState.Loading -> {
            DivineLoadingScreen()
        }
    }


}

@Composable
fun MainState(
    state: LoginState.Main,
    onLoginClicked: (String, String) -> Unit,
    onSignupClicked: (String, String) -> Unit,
    onEmailChanged: (String) -> Unit,
    onPasswordChanged: (String) -> Unit,
) {
    val email = remember { mutableStateOf(state.email) }
    val password = remember { mutableStateOf(state.password) }
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
                    text = "Вход"
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
            DivinePasswordField(
                label = "Пароль",
                input = password.value,
                onValueChanged = { password.value = it },
                onFocusChanged = { onPasswordChanged(it) },
                errorMessage = state.passwordError
            )
            DivineButton(
                text = "Войти",
                onClick = { onLoginClicked(email.value, password.value) },
            )
        }
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            DivineTextButton(
                text = "Еще нет аккаунта? Зарегистрируйтесь!",
                onClick = { onSignupClicked(email.value, password.value) },
            )
        }
    }
}


@Composable
@Preview(showSystemUi = true)
fun LoginPreview() {
    MainState(
        state = LoginState.Main(
            email = "",
            password = "12345",
            emailError = "Упс неправильная почта",
            passwordError = null
        ),
        onEmailChanged = {},
        onPasswordChanged = {},
        onLoginClicked = {_, _ -> },
        onSignupClicked = {_, _ -> }
    )
}