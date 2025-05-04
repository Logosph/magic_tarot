package ru.damapi.divinaition.ui.divine_composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import coil.compose.AsyncImage
import ru.damapi.divinaition.ui.vectors.icons.Card
import ru.damapi.domain.models.CardModel

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
                    .fillMaxWidth().padding(16.dp),
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
@Preview(showSystemUi = true)
fun CardDialogPreview() {
    Column(modifier = Modifier.fillMaxSize()) {
        CardDialog(
            card = CardModel(
                id = 0,
                name = "Карта дня",
                meaning = "Значение карты дня",
                imageUrl = null,
                interpretationOfTheDay = "Толкование карты дня"
            ),
            onDismissRequest = {}
        )
    }
}