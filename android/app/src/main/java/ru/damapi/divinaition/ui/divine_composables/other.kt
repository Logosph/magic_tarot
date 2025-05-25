package ru.damapi.divinaition.ui.divine_composables

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.lerp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import coil.compose.AsyncImage
import kotlinx.coroutines.delay
import ru.damapi.divinaition.ui.vectors.icons.Card
import ru.damapi.divinaition.ui.vectors.icons.CardBack
import ru.damapi.domain.models.CardModel
import kotlin.math.absoluteValue


@Composable
fun DivineCard(card: CardModel) {
    //будет возможность перевернуть карту и посмотреть значение
    Box(modifier = Modifier.fillMaxWidth()) {
        //either card image vector if url is null or image from url by async image painter
        if (card.imageUrl != null) {
            AsyncImage(
                model = card.imageUrl,
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
        } else {
            Image(
                imageVector = Card,
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )
        }
    }
}

@Composable
fun CardDialog(card: CardModel, onDismissRequest: () -> Unit) {
    Dialog(onDismissRequest = { onDismissRequest() }) {
        Card(
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                DivineTitle(card.name)
                DivineCard(card = card)
                DivineText(card.interpretationOfTheDay)
            }
        }
    }
}

@Composable
fun DivineProgressBar(text: String) {
    var dotsCount by remember { mutableStateOf(0) }

    LaunchedEffect(Unit) {
        while (true) {
            delay(500)
            dotsCount = (dotsCount + 1) % 4
        }
    }

    Text(
        modifier = Modifier.padding(vertical = 16.dp),
        text = text + ".".repeat(dotsCount),
        fontSize = 20.sp,
        textAlign = TextAlign.Center
    )
}

@Composable
fun DivineCardCarousel(
    cards: List<CardModel>
) {
    val pagerState = rememberPagerState { cards.size }

    HorizontalPager(
        state = pagerState,
        modifier = Modifier.fillMaxWidth(),
        pageSpacing = 24.dp,
        contentPadding = PaddingValues(horizontal = 64.dp)
    ) { page ->
        val imageModifier = Modifier
            .fillMaxWidth()
            .graphicsLayer {
                val pageOffset =
                    (pagerState.currentPage - page + pagerState.currentPageOffsetFraction).absoluteValue
                lerp(
                    start = 75.dp,
                    stop = 100.dp,
                    fraction = 1f - pageOffset.coerceIn(0f, 1f)
                ).also { scale ->
                    scaleY = scale / 100.dp
                }
            }
        Column(
            modifier = imageModifier,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            DivineTitle(
                text = cards[page].name,
            )

            val imageUrl = cards[page].imageUrl
            if (imageUrl == null) {
                Image(
                    imageVector = Card,
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            } else {
                AsyncImage(
                    model = imageUrl,
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}

@Composable
fun FlipCard(
    front: @Composable () -> Unit,
    back: @Composable () -> Unit
) {

    var rotated by remember { mutableStateOf(false) }

    val rotation by animateFloatAsState(
        targetValue = if (rotated) 180f else 0f,
        animationSpec = tween(500)
    )

    val animateFront by animateFloatAsState(
        targetValue = if (!rotated) 1f else 0f,
        animationSpec = tween(500)
    )

    val animateBack by animateFloatAsState(
        targetValue = if (rotated) 1f else 0f,
        animationSpec = tween(500)
    )

    Box(
        Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .graphicsLayer {
                    rotationY = rotation
                    cameraDistance = 8 * density
                }
                .clickable(
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() }
                ) {
                    rotated = !rotated
                },
        )
        {
            Column(
                Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .height(480.dp)
                        .fillMaxWidth()
                        .graphicsLayer {
                            alpha = if (rotated) animateBack else animateFront
                            rotationY = rotation
                        },
                    contentAlignment = Alignment.Center
                ) {
                    if (!rotated) {
                        front()
                    } else {
                        back()
                    }
                }
            }
        }
    }
}


@Composable
@Preview(showSystemUi = true)
fun CardDialogPreview() {
    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            FlipCard(
                front = {
                    Image(
                        imageVector = Card,
                        contentDescription = null,
                        modifier = Modifier.fillMaxWidth(),
                        contentScale = ContentScale.FillHeight
                    )
                },
                back = {
                    Box() {
                        Text(
                            "Просто какой-то\nтекст\nна обратной стороне",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(16.dp)
                        )
                        Image(
                            imageVector = CardBack,
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.FillHeight
                        )
                    }
                }
            )

        }
    }
}