package ru.damapi.divinaition.ui.vectors.backgrounds

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Star: ImageVector
    get() {
        if (_Star != null) {
            return _Star!!
        }
        _Star = ImageVector.Builder(
            name = "Star",
            defaultWidth = 16.dp,
            defaultHeight = 20.dp,
            viewportWidth = 16f,
            viewportHeight = 20f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 0f)
                lineTo(8.15f, 2.463f)
                curveTo(8.389f, 6.395f, 11.456f, 9.568f, 15.378f, 9.941f)
                lineTo(16f, 10f)
                lineTo(15.378f, 10.059f)
                curveTo(11.456f, 10.432f, 8.389f, 13.605f, 8.15f, 17.537f)
                lineTo(8f, 20f)
                lineTo(7.85f, 17.537f)
                curveTo(7.611f, 13.605f, 4.544f, 10.432f, 0.622f, 10.059f)
                lineTo(0f, 10f)
                lineTo(0.622f, 9.941f)
                curveTo(4.544f, 9.568f, 7.611f, 6.395f, 7.85f, 2.463f)
                lineTo(8f, 0f)
                close()
            }
        }.build()

        return _Star!!
    }

@Suppress("ObjectPropertyName")
private var _Star: ImageVector? = null
