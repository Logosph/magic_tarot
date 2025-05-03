package ru.damapi.divinaition.ui.divine_composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import ru.damapi.divinaition.ui.vectors.icons.EyeClosed
import ru.damapi.divinaition.ui.vectors.icons.EyeOpen

@Composable
fun DivineTextField(
    label: String,
    text: String,
    errorMessage: String? = null,
    onValueChanged: (String) -> Unit,
    onFocusChanged: (String) -> Unit
) {
    TextField(
        modifier = Modifier
            .padding(8.dp)
            .onFocusChanged {
                onFocusChanged(text)
            },
        value = text,
        onValueChange = {
            onValueChanged(it)
        },
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
    input: String,
    onValueChanged: (String) -> Unit,
    onFocusChanged: (String) -> Unit,
    errorMessage: String? = null
) {
    val isVisible = remember { mutableStateOf(false) }
    TextField(
        modifier = Modifier
            .padding(8.dp)
            .onFocusChanged {
                onFocusChanged(input)
            },
        value = input,
        onValueChange = { onValueChanged(it) },
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
                modifier = Modifier.size(24.dp).clickable {
                    isVisible.value = !isVisible.value
                },
                imageVector = if (isVisible.value) EyeOpen else EyeClosed,
                contentDescription = "Visibility Icon"
            )
        }
    )
}