package ru.damapi.divinaition.ui.divine_composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import ru.damapi.divinaition.R

@Composable
fun AuthBackground() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(R.drawable.falling_stars),
            contentDescription = "Falling Stars",
            contentScale = ContentScale.FillWidth,
        )
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.cloud),
            contentDescription = "Cloud",
            contentScale = ContentScale.FillWidth,
        )
    }
}

@Composable
fun HomeBackground() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = Modifier.fillMaxWidth().graphicsLayer(
                scaleY = -1f
            ),
            painter = painterResource(id = R.drawable.cloud),
            contentDescription = "Cloud",
            contentScale = ContentScale.FillWidth,
        )
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.cloud),
            contentDescription = "Cloud",
            contentScale = ContentScale.FillWidth,
        )
    }
}

@Composable
fun MainBackground() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            modifier = Modifier.fillMaxWidth().graphicsLayer(
                scaleY = -1f
            ),
            painter = painterResource(id = R.drawable.cloud),
            contentDescription = "Cloud",
            contentScale = ContentScale.FillWidth,
        )
    }
}

@Composable
fun DivineLoadingScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        CircularProgressIndicator()
    }
}

@Composable
@Preview(showSystemUi = true)
fun BackPreview() {
    AuthBackground()
}