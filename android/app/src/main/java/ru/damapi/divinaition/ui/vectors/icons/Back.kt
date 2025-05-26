package ru.damapi.divinaition.ui.vectors.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Back: ImageVector
    get() {
        if (_Back != null) {
            return _Back!!
        }
        _Back = ImageVector.Builder(
            name = "Back",
            defaultWidth = 32.dp,
            defaultHeight = 30.dp,
            viewportWidth = 32f,
            viewportHeight = 30f
        ).apply {
            path(fill = SolidColor(Color(0xFF1F1F1F))) {
                moveTo(6f, 30f)
                verticalLineTo(26f)
                horizontalLineTo(20.2f)
                curveTo(22.3f, 26f, 24.125f, 25.333f, 25.675f, 24f)
                curveTo(27.225f, 22.667f, 28f, 21f, 28f, 19f)
                curveTo(28f, 17f, 27.225f, 15.333f, 25.675f, 14f)
                curveTo(24.125f, 12.667f, 22.3f, 12f, 20.2f, 12f)
                horizontalLineTo(7.6f)
                lineTo(12.8f, 17.2f)
                lineTo(10f, 20f)
                lineTo(0f, 10f)
                lineTo(10f, 0f)
                lineTo(12.8f, 2.8f)
                lineTo(7.6f, 8f)
                horizontalLineTo(20.2f)
                curveTo(23.433f, 8f, 26.208f, 9.05f, 28.525f, 11.15f)
                curveTo(30.842f, 13.25f, 32f, 15.867f, 32f, 19f)
                curveTo(32f, 22.133f, 30.842f, 24.75f, 28.525f, 26.85f)
                curveTo(26.208f, 28.95f, 23.433f, 30f, 20.2f, 30f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _Back!!
    }

@Suppress("ObjectPropertyName")
private var _Back: ImageVector? = null
