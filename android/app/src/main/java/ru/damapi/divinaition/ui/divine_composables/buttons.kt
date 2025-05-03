package ru.damapi.divinaition.ui.divine_composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.damapi.divinaition.R
import ru.damapi.divinaition.ui.vectors.icons.Question
import ru.damapi.divinaition.ui.vectors.icons.Template


@Composable
fun DivineButton(
    text: String,
    onClick: () -> Unit,
) {
    ElevatedButton(
        modifier = Modifier
            .padding(16.dp),
        onClick = onClick,
    ) {
        Text(
            text = text,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
fun DivineTextButton(
    text: String,
    onClick: () -> Unit,
) {
    TextButton(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        onClick = onClick,
    ) {
        Text(
            text = text,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
fun DivineReadingButton(
    text: String,
    icon: ImageVector,
    isInverted: Boolean,
    onClick: () -> Unit
) {
    val readingPadding =
        if (isInverted) PaddingValues(start = 32.dp, bottom = 48.dp) else PaddingValues(
            end = 32.dp,
            bottom = 48.dp
        )
    Column(
        modifier = Modifier.width(164.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DivineBigText(text = text)
        Box(
            modifier = Modifier.clickable { onClick() },
            contentAlignment = Alignment.BottomCenter
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(readingPadding),
                imageVector = icon,
                contentDescription = "Type of reading"
            )
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .graphicsLayer(scaleX = if (isInverted) -1f else 1f),
                painter = painterResource(R.drawable.hand),
                contentDescription = "Hand"
            )
        }
    }
}

@Composable
fun DivineIconButton(
    imageVector: ImageVector,
    onClick: () -> Unit
) {
    IconButton(
        onClick = onClick,
        modifier = Modifier
            .size(64.dp)
            .padding(8.dp)
    ) {
        Image(
            imageVector = imageVector,
            contentDescription = "Icon",
            modifier = Modifier
                .fillMaxSize()
        )
    }
}

@Composable
fun DivineIconButton(
    imageId: Int,
    onClick: () -> Unit
) {
    Image(
        modifier = Modifier
            .size(80.dp)
            .padding(8.dp)
            .clickable { onClick() },
        painter = painterResource(imageId),
        contentDescription = "Icon",
    )
}

@Composable
@Preview(showSystemUi = true)
fun ButtonPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row() {
            DivineReadingButton(
                text = "Шаблоны",
                isInverted = true,
                icon = Template
            ) { }
            DivineReadingButton(
                text = "Вопрос",
                isInverted = false,
                icon = Question
            ) { }
        }
        DivineIconButton(
            imageId = R.drawable.person
        ) { }
    }
}