package ru.damapi.divinaition.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextDirection.Companion.Content
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.damapi.divinaition.ui.vectors.backgrounds.Cloud
import ru.damapi.divinaition.ui.vectors.backgrounds.FallingStars
import ru.damapi.divinaition.ui.vectors.backgrounds.VisibilityOff
import ru.damapi.divinaition.ui.vectors.icons.VisibilityOn

@Composable
fun DivineLoadingScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        CircularProgressIndicator()
    }
}

@Composable
fun AuthBackground() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = Modifier.fillMaxWidth(),
            imageVector = FallingStars,
            contentDescription = "Falling Stars",
            contentScale = ContentScale.FillWidth,
        )
        Image(
            modifier = Modifier.fillMaxWidth(),
            imageVector = Cloud,
            contentDescription = "Cloud",
            contentScale = ContentScale.FillWidth,
        )
    }
}

@Composable
fun DivineTextField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    errorMessage: String? = null
) {
    TextField(
        modifier = Modifier.padding(8.dp),
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        isError = errorMessage != null,
        supportingText = {
            if (errorMessage != null) {
                Text(errorMessage)
            }
        }
    )
}

@Composable
fun DivinePasswordField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    errorMessage: String? = null
) {
    val isVisible = remember { mutableStateOf(false) }
    TextField(
        modifier = Modifier.padding(8.dp),
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        isError = errorMessage != null,
        supportingText = {
            if (errorMessage != null) {
                Text(errorMessage)
            }
        },
        visualTransformation = if (isVisible.value) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        },
        trailingIcon = {
            Icon(
                modifier = Modifier.clickable {
                    isVisible.value = !isVisible.value
                },
                imageVector = if (isVisible.value) VisibilityOff else VisibilityOn,
                contentDescription = "Visibility Icon"
            )
        }
    )
}

@Composable
fun DivineTitle(
    text: String,
) {
    Text(
        text = text,
        modifier = Modifier.padding(vertical = 16.dp, horizontal = 24.dp),
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
    )
}

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