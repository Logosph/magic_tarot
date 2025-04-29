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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import org.koin.androidx.compose.koinViewModel
import ru.damapi.divinaition.ui.AuthBackground
import ru.damapi.divinaition.ui.DivineButton
import ru.damapi.divinaition.ui.DivineLoadingScreen
import ru.damapi.divinaition.ui.DivinePasswordField
import ru.damapi.divinaition.ui.DivineTextButton
import ru.damapi.divinaition.ui.DivineTextField
import ru.damapi.divinaition.ui.DivineTitle
import ru.damapi.divinaition.ui.Screen
import ru.damapi.divinaition.ui.vectors.backgrounds.Star

@Composable
fun LoginView(
    navController: NavController,
    viewModel: LoginViewModel = koinViewModel()
) {
    val viewState = viewModel.viewState.collectAsState()
    val viewAction = viewModel.viewAcion.collectAsState()

    when (viewAction.value) {
        is LoginAction.NavigateToSignup -> {
            viewModel.obtainEvent(LoginEvent.ClearAction)
            navController.navigate(Screen.SignupScreen.route)
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
                onEmailChanged = { viewModel.obtainEvent(LoginEvent.EmailChanged(it)) },
                onPasswordChanged = { viewModel.obtainEvent(LoginEvent.PasswordChanged(it)) },
                onLoginClicked = { viewModel.obtainEvent(LoginEvent.ProceedClicked) },
                onSignupClicked = { viewModel.obtainEvent(LoginEvent.SignupClicked) }
            )
        }

        is LoginState.Loading -> {
            DivineLoadingScreen()
        }

        is LoginState.Initialization -> {
            viewModel.obtainEvent(LoginEvent.LoadData)
        }
    }


}

@Composable
fun MainState(
    state: LoginState.Main,
    onEmailChanged: (String) -> Unit,
    onPasswordChanged: (String) -> Unit,
    onLoginClicked: () -> Unit,
    onSignupClicked: () -> Unit,
) {
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
                value = state.email,
                onValueChange = onEmailChanged,
                errorMessage = state.emailError
            )
            DivinePasswordField(
                label = "Пароль",
                value = state.password,
                onValueChange = onPasswordChanged,
                errorMessage = state.passwordError
            )
            DivineButton(
                text = "Войти",
                onClick = onLoginClicked,
            )
        }
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {
            DivineTextButton(
                text = "Еще нет аккаунта? Зарегистрируйтесь!",
                onClick = onSignupClicked,
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
        onLoginClicked = {},
        onSignupClicked = {}
    )
}