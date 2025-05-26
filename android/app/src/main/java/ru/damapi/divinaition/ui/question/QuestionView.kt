package ru.damapi.divinaition.ui.question

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import org.koin.androidx.compose.koinViewModel
import ru.damapi.divinaition.ui.Screen
import ru.damapi.divinaition.ui.divine_composables.DivineLoadingScreen
import ru.damapi.divinaition.ui.divine_composables.DivineSmallText
import ru.damapi.divinaition.ui.divine_composables.QuestionTextField
import ru.damapi.divinaition.ui.vectors.icons.Back

@Composable
fun QuestionView(
    navController: NavController,
    viewModel: QuestionViewModel = koinViewModel()
) {
    val viewState = viewModel.viewState.collectAsState()
    val viewAction = viewModel.viewAction.collectAsState()
    when (val action = viewAction.value) {
        is QuestionAction.NavigateToReading -> {
            viewModel.obtainEvent(QuestionEvent.ClearAction)
            navController.navigate(Screen.QuestionReadingScreen.createRoute(action.question)) {
                launchSingleTop = true
                restoreState = true
            }
            viewModel.obtainEvent(QuestionEvent.ClearAction)
        }

        null -> {}
    }

    when (val state = viewState.value) {
        is QuestionState.MainState -> {
            MainState(
                state,
                onQuestionChanged = { question ->
                    viewModel.obtainEvent(
                        QuestionEvent.QuestionChanged(
                            question
                        )
                    )
                },
                onAskClicked = { viewModel.obtainEvent(QuestionEvent.AskClicked) }
            )
        }

        QuestionState.Loading -> {
            DivineLoadingScreen()
        }
    }

}

@Composable
fun MainState(
    state: QuestionState.MainState,
    onQuestionChanged: (String) -> Unit,
    onAskClicked: () -> Unit
) {
    val question = remember { mutableStateOf(state.question) }
    Box(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp).imePadding(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Обратимся к картам и технологиям...",
            modifier = Modifier.padding(16.dp),
            fontSize = 28.sp,
            textAlign = TextAlign.Center
        )
    }
    Box(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            QuestionTextField(
                label = "Задайте свой вопрос",
                text = question.value,
                onValueChanged = {
                    question.value = it
                },
                onFocusChanged = {
                    onQuestionChanged(question.value)
                },
                onAskClicked = onAskClicked,
            )
            DivineSmallText(
                "*Ответ генерируется при помощи искуственного интеллекта"
            )
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun QuestionPreview() {
    MainState(
        state = QuestionState.MainState(""),
        onQuestionChanged = {},
        onAskClicked = {}
    )
}