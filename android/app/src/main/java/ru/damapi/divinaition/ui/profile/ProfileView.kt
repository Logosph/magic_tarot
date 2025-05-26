package ru.damapi.divinaition.ui.profile

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.koin.androidx.compose.koinViewModel
import ru.damapi.divinaition.R
import ru.damapi.divinaition.ui.divine_composables.DivineLoadingScreen
import ru.damapi.divinaition.ui.divine_composables.DivineText
import ru.damapi.divinaition.ui.divine_composables.DivineTitle
import ru.damapi.domain.models.UserModel

@Composable
fun ProfileView(
    viewModel: ProfileViewModel = koinViewModel()
) {
    val viewState = viewModel.viewState.collectAsState()

    when (val state = viewState.value) {
        is ProfileState.Main -> {
            MainState(
                state = state,
                onEditUsername = { username ->
                    viewModel.obtainEvent(
                        ProfileEvent.EditUsername(
                            username
                        )
                    )
                }
            )
        }

        ProfileState.Loading -> {
            viewModel.obtainEvent(
                ProfileEvent.LoadUser
            )
            DivineLoadingScreen()
        }

        ProfileState.Error -> {
            ErrorState()
        }
    }
}

@Composable
fun ErrorState() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        DivineTitle(
            text = "Ошибка загрузки профиля. Попробуйте еще раз"
        )
    }
}

@Composable
fun MainState(
    state: ProfileState.Main,
    onEditUsername: (String) -> Unit,
) {
    var showDialog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier
                    .size(120.dp)
                    .padding(16.dp),
                painter = painterResource(R.drawable.person),
                contentDescription = "Icon",
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            DivineText(
                text = "Имя: ${state.user.username}",
            )
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit Icon",
                modifier = Modifier
                    .size(24.dp)
                    .clickable {
                        showDialog = true
                    }
            )
        }
        DivineText(
            text = "Почта: ${state.user.email}",
        )
        DivineText(
            text = "Дата регистрации: ${state.user.dateOfRegistration}",
        )
    }

    if (showDialog) {
        EditUsernameDialog(
            currentUsername = state.user.username,
            onDismiss = { showDialog = false },
            onSave = { newUsername ->
                onEditUsername(newUsername)
                showDialog = false
            }
        )
    }
}


@Composable
fun EditUsernameDialog(
    currentUsername: String,
    onDismiss: () -> Unit,
    onSave: (String) -> Unit
) {
    var username by remember { mutableStateOf(currentUsername) }

    AlertDialog(
        onDismissRequest = { onDismiss() },
        title = { Text(text = "Редактировать имя") },
        text = {
            Column {
                OutlinedTextField(
                    value = username,
                    onValueChange = { username = it },
                    label = { Text("Имя пользователя") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        confirmButton = {
            TextButton(onClick = { onSave(username) }) {
                Text("ОК")
            }
        },
        dismissButton = {
            TextButton(onClick = { onDismiss() }) {
                Text("Отмена")
            }
        }
    )
}

@Composable
@Preview(showSystemUi = true)
fun ProfilePreview() {
    MainState(
        state = ProfileState.Main(
            user = UserModel(
                uuid = "12345",
                username = "TestUser",
                email = "example@example.com",
                dateOfRegistration = "2023-10-01",
                cardOfTheDayId = -1,
            )
        ),
        onEditUsername = {}
    )
}