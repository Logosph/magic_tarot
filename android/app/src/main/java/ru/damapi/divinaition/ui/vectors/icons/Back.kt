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
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f
            ) {
                moveTo(7f, 18f)
                horizontalLineTo(14f)
                curveTo(14f, 18f, 19f, 18f, 19f, 13.5f)
                curveTo(19f, 9f, 14f, 9f, 14f, 9f)
                horizontalLineTo(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f
            ) {
                moveTo(10f, 4f)
                curveTo(9.5f, 6.5f, 6f, 9f, 6f, 9f)
                curveTo(6f, 9f, 9.5f, 11.5f, 10f, 14f)
            }
        }.build()

        return _Back!!
    }

@Suppress("ObjectPropertyName")
private var _Back: ImageVector? = null
