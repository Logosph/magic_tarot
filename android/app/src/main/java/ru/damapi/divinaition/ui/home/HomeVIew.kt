package ru.damapi.divinaition.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import org.koin.androidx.compose.koinViewModel
import ru.damapi.divinaition.R
import ru.damapi.divinaition.ui.Screen
import ru.damapi.divinaition.ui.divine_composables.CardDialog
import ru.damapi.divinaition.ui.divine_composables.DivineBigText
import ru.damapi.divinaition.ui.divine_composables.DivineIconButton
import ru.damapi.divinaition.ui.divine_composables.DivineLoadingScreen
import ru.damapi.divinaition.ui.divine_composables.DivineReadingButton
import ru.damapi.divinaition.ui.vectors.icons.Question
import ru.damapi.divinaition.ui.vectors.icons.Template
import ru.damapi.domain.models.CardModel

@Composable
fun HomeView(
    navController: NavController,
    viewModel: HomeViewModel = koinViewModel()
) {
    val viewState = viewModel.viewState.collectAsState()
    val viewAction = viewModel.viewAction.collectAsState()

    when (viewAction.value) {
        HomeAction.NavigateToProfile -> {
            navController.navigate(Screen.ProfileScreen.route) {
                launchSingleTop = true
                restoreState = true
            }
            viewModel.obtainEvent(HomeEvent.ClearAction)
        }
        HomeAction.NavigateToQuestion -> {
            navController.navigate(Screen.QuestionScreen.route) {
                launchSingleTop = true
                restoreState = true
            }
            viewModel.obtainEvent(HomeEvent.ClearAction)
        }
        HomeAction.NavigateToTemplates -> {}
        null -> {}
    }

    when (val state = viewState.value) {
        is HomeState.Main -> MainState(
            state,
            onProfileClicked = { viewModel.obtainEvent(HomeEvent.ProfileClicked) },
            onTemplatesClicked = { viewModel.obtainEvent(HomeEvent.TemplatesClicked) },
            onQuestionClicked = { viewModel.obtainEvent(HomeEvent.QuestionClicked) },
            onCardOfTheDayClicked = { viewModel.obtainEvent(HomeEvent.ShowCardOfTheDay) },
            onCardOfTheDayDismissed = { viewModel.obtainEvent(HomeEvent.HideCardOfTheDay) },
        )

        is HomeState.Loading -> DivineLoadingScreen()
    }
}

@Composable
fun MainState(
    state: HomeState.Main,
    onProfileClicked: () -> Unit,
    onTemplatesClicked: () -> Unit,
    onQuestionClicked: () -> Unit,
    onCardOfTheDayClicked: () -> Unit,
    onCardOfTheDayDismissed: () -> Unit,
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                DivineIconButton(
                    imageId = R.drawable.person
                ) {onProfileClicked() }

            }
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                DivineBigText(text = "Выберите способ гадания")
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    DivineReadingButton(
                        text = "Шаблоны",
                        isInverted = true,
                        icon = Template
                    ) { onTemplatesClicked() }
                    DivineReadingButton(
                        text = "Вопрос",
                        isInverted = false,
                        icon = Question
                    ) { onQuestionClicked() }
                }
            }
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier
                        .size(128.dp)
                        .clickable { onCardOfTheDayClicked() },
                    painter = painterResource(R.drawable.meaning),
                    contentDescription = "Icon",
                )
                DivineBigText(text = "Карта дня")
            }
        }
        if (state.showCardOfTheDay && state.cardOfTheDay != null) {
            CardDialog(
                card = state.cardOfTheDay,
                onDismissRequest = { onCardOfTheDayDismissed() }
            )
        }
        if (state.isLoading) DivineLoadingScreen()
    }
}


@Composable
@Preview(showSystemUi = true)
fun HomePreview() {
    Scaffold { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            MainState(
                state = HomeState.Main(
                    isLoading = false,
                    showCardOfTheDay = true,
                    cardOfTheDay = CardModel(
                        id = 0,
                        name = "Карта дня",
                        meaning = "Значение карты дня",
                        imageUrl = null,
                        interpretationOfTheDay = "Толкование карты дня"
                    )
                ),
                onProfileClicked = {},
                onTemplatesClicked = {},
                onQuestionClicked = {},
                onCardOfTheDayClicked = {},
                onCardOfTheDayDismissed = {},
            )
        }
    }
}