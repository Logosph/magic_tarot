package ru.damapi.divinaition.ui.vectors.icons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EyeClosed: ImageVector
    get() {
        if (_EyeClosed != null) {
            return _EyeClosed!!
        }
        _EyeClosed = ImageVector.Builder(
            name = "EyeClosed",
            defaultWidth = 16.dp,
            defaultHeight = 10.dp,
            viewportWidth = 16f,
            viewportHeight = 10f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1f
            ) {
                moveTo(1f, 5f)
                curveTo(1f, 5f, 4.851f, 9f, 8f, 9f)
                curveTo(11.149f, 9f, 15f, 5f, 15f, 5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 2.969f)
                curveTo(6.668f, 2.969f, 8.021f, 1.64f, 8.021f, 0f)
                curveTo(8.021f, 1.64f, 9.374f, 2.969f, 11.042f, 2.969f)
                verticalLineTo(2.969f)
                curveTo(9.374f, 2.969f, 8.021f, 4.298f, 8.021f, 5.938f)
                curveTo(8.021f, 4.298f, 6.668f, 2.969f, 5f, 2.969f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(5f, 2.969f)
                    curveTo(6.668f, 2.969f, 8.021f, 1.64f, 8.021f, 0f)
                    curveTo(8.021f, 1.64f, 9.374f, 2.969f, 11.042f, 2.969f)
                    verticalLineTo(2.969f)
                    curveTo(9.374f, 2.969f, 8.021f, 4.298f, 8.021f, 5.938f)
                    curveTo(8.021f, 4.298f, 6.668f, 2.969f, 5f, 2.969f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(11.042f, 2.969f)
                    horizontalLineTo(11.542f)
                    verticalLineTo(2.469f)
                    horizontalLineTo(11.042f)
                    verticalLineTo(2.969f)
                    close()
                    moveTo(11.042f, 2.969f)
                    verticalLineTo(3.469f)
                    horizontalLineTo(11.542f)
                    verticalLineTo(2.969f)
                    horizontalLineTo(11.042f)
                    close()
                    moveTo(7.521f, 0f)
                    curveTo(7.521f, 1.355f, 6.401f, 2.469f, 5f, 2.469f)
                    verticalLineTo(3.469f)
                    curveTo(6.936f, 3.469f, 8.521f, 1.924f, 8.521f, 0f)
                    horizontalLineTo(7.521f)
                    close()
                    moveTo(11.042f, 2.469f)
                    curveTo(9.641f, 2.469f, 8.521f, 1.355f, 8.521f, 0f)
                    lineTo(7.521f, -0f)
                    curveTo(7.521f, 1.924f, 9.106f, 3.469f, 11.042f, 3.469f)
                    verticalLineTo(2.469f)
                    close()
                    moveTo(11.542f, 2.969f)
                    verticalLineTo(2.969f)
                    horizontalLineTo(10.542f)
                    verticalLineTo(2.969f)
                    horizontalLineTo(11.542f)
                    close()
                    moveTo(8.521f, 5.938f)
                    curveTo(8.521f, 4.582f, 9.641f, 3.469f, 11.042f, 3.469f)
                    verticalLineTo(2.469f)
                    curveTo(9.106f, 2.469f, 7.521f, 4.014f, 7.521f, 5.938f)
                    lineTo(8.521f, 5.938f)
                    close()
                    moveTo(5f, 3.469f)
                    curveTo(6.401f, 3.469f, 7.521f, 4.582f, 7.521f, 5.938f)
                    horizontalLineTo(8.521f)
                    curveTo(8.521f, 4.014f, 6.936f, 2.469f, 5f, 2.469f)
                    lineTo(5f, 3.469f)
                    close()
                }
            }
        }.build()

        return _EyeClosed!!
    }

@Suppress("ObjectPropertyName")
private var _EyeClosed: ImageVector? = null
