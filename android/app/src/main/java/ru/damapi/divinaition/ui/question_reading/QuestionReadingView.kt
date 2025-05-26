package ru.damapi.divinaition.ui.question_reading

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import org.koin.androidx.compose.koinViewModel
import ru.damapi.divinaition.ui.divine_composables.DivineCardCarousel
import ru.damapi.divinaition.ui.divine_composables.DivineLoadingScreen
import ru.damapi.divinaition.ui.divine_composables.DivineProgressBar
import ru.damapi.divinaition.ui.divine_composables.DivineTitle
import ru.damapi.domain.models.CardModel

@Composable
fun QuestionReadingView(
    navController: NavController,
    question: String,
    viewModel: QuestionReadingViewModel = koinViewModel()
) {
    val viewState = viewModel.viewState.collectAsState()

    when (val state = viewState.value) {
        is QuestionReadingState.MainState -> {
            MainState(
                state
            )
        }

        QuestionReadingState.Loading -> {
            DivineLoadingScreen()
            viewModel.obtainEvent(QuestionReadingEvent.LoadCards(question))
        }

        QuestionReadingState.Error -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Ошибка загрузки",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun MainState(
    state: QuestionReadingState.MainState
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            DivineTitle(
                text = state.question
            )
        }

        DivineCardCarousel(
            cards = state.cards,
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {


            if (state.isReadingLoading) {
                DivineProgressBar(
                    text = "Ожидание интерпретации"
                )
            } else {
                Text(
                    modifier = Modifier.padding(vertical = 16.dp),
                    text = "Ответ ИИ:",
                    fontSize = 20.sp,
                )
                Text(
                    text = state.reading ?: "",
                    fontSize = 14.sp,
                )
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun QuestionReadingPreview() {
    MainState(
        state = QuestionReadingState.MainState(
            question = "Как пройдет защита нашего проекта?",
            cards = listOf(
                CardModel(
                    1,
                    "СМЕРТЬ",
                    "Означает трансформацию, окончание старого, возрождение и прощание. Несмотря на название, это редко означает физическую смерть, скорее завершение одного этапа и начало нового, часто болезненное, но необходимое для роста.",
                    null,
                    ""
                ),
            ),
            reading = "Этот расклад указывает на то, что ваш проект находится на пороге важного завершения или трансформации, что потребует избавиться от устаревших методов или идей, чтобы перейти к новому этапу развития. В процессе защиты может возникнуть внутреннее противоречие или чувство разочарования, связанное с тем, что не все идет так гладко, как хотелось бы, однако это временные трудности, которые помогут вам переосмыслить свои цели и подходы. Важной частью этого периода станет поиск баланса и гармонии, что поможет сгладить острые углы и добиться более объективной оценки. Возможно, защита пройдет не так идеально, как ожидалось, но итоговая оценка будет взвешенной и справедливой, учитывающей как достижения, так и недостатки. В целом, ситуация требует терпения, мудрости и умения слушать друг друга, чтобы успешно завершить этот цикл и подготовиться к новым возможностям. Главное — сохранять спокойствие и не торопиться с выводами, ведь всё идет по плану трансформации и обновления.",
            isReadingLoading = false
        )
    )
}