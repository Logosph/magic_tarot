package ru.damapi.divinaition.ui.vectors.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QuestionMark: ImageVector
    get() {
        if (_QuestionMark != null) {
            return _QuestionMark!!
        }
        _QuestionMark = ImageVector.Builder(
            name = "QuestionMark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(fill = SolidColor(Color(0xFFE3E3E3))) {
                moveTo(438.62f, 630.77f)
                quadToRelative(0f, -67.92f, 15.65f, -104f)
                reflectiveQuadToRelative(65.35f, -80f)
                quadToRelative(38.69f, -34.46f, 58.65f, -62.5f)
                reflectiveQuadToRelative(19.96f, -63.58f)
                quadToRelative(0f, -47.15f, -32.11f, -78.38f)
                quadToRelative(-32.12f, -31.23f, -88.43f, -31.23f)
                quadToRelative(-51.38f, 0f, -80f, 27.53f)
                quadToRelative(-28.61f, 27.54f, -43.46f, 61.47f)
                lineToRelative(-73f, -32.08f)
                quadToRelative(23.31f, -57.46f, 72.77f, -95.81f)
                quadToRelative(49.46f, -38.34f, 123.69f, -38.34f)
                quadToRelative(96.92f, 0f, 149.19f, 54.65f)
                quadToRelative(52.27f, 54.65f, 52.27f, 129.73f)
                quadToRelative(0f, 46.92f, -20.34f, 82.81f)
                quadToRelative(-20.35f, 35.88f, -61.73f, 74.73f)
                quadToRelative(-52.08f, 47.77f, -64.5f, 75.34f)
                quadToRelative(-12.43f, 27.58f, -12.43f, 79.66f)
                horizontalLineToRelative(-81.53f)
                close()
                moveTo(477.69f, 860f)
                quadToRelative(-24.54f, 0f, -42.27f, -17.73f)
                quadToRelative(-17.73f, -17.73f, -17.73f, -42.27f)
                quadToRelative(0f, -24.54f, 17.73f, -42.27f)
                quadTo(453.15f, 740f, 477.69f, 740f)
                quadToRelative(24.54f, 0f, 42.27f, 17.73f)
                quadToRelative(17.73f, 17.73f, 17.73f, 42.27f)
                quadToRelative(0f, 24.54f, -17.73f, 42.27f)
                quadTo(502.23f, 860f, 477.69f, 860f)
                close()
            }
        }.build()

        return _QuestionMark!!
    }

@Suppress("ObjectPropertyName")
private var _QuestionMark: ImageVector? = null
