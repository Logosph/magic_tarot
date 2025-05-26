package ru.damapi.divinaition.ui.vectors.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CardBack: ImageVector
    get() {
        if (_CardBack != null) {
            return _CardBack!!
        }
        _CardBack = ImageVector.Builder(
            name = "CardBack",
            defaultWidth = 10.dp,
            defaultHeight = 17.dp,
            viewportWidth = 10f,
            viewportHeight = 17f
        ).apply {
            path(fill = SolidColor(Color(0xFF353535))) {
                moveTo(1f, 0f)
                lineTo(9f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 1f)
                lineTo(10f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 17f)
                lineTo(1f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(0f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD9D9D9))) {
                moveTo(2f, 1f)
                lineTo(8f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                lineTo(9f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 16f)
                lineTo(2f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 15f)
                lineTo(1f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 1f)
                close()
            }
        }.build()

        return _CardBack!!
    }

@Suppress("ObjectPropertyName")
private var _CardBack: ImageVector? = null
