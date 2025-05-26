package ru.damapi.divinaition.ui.divine_composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun DivineTitle(
    text: String
) {
    Text(
        text = text,
        modifier = Modifier.padding(vertical = 16.dp, horizontal = 24.dp),
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Composable
fun DivineBigText(
    text: String
) {
    Text(
        text = text,
        modifier = Modifier.padding(16.dp),
        fontSize = 24.sp,
    )
}

@Composable
fun DivineText(
    text: String
) {
    Text(
        text = text,
        modifier = Modifier.padding(16.dp),
        fontSize = 18.sp,
    )
}

@Composable
fun DivineSmallText(
    text: String
) {
    Text(
        text = text,
        modifier = Modifier.padding(16.dp),
        fontSize = 12.sp,
    )
}