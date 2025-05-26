package ru.damapi.divinaition.ui.vectors.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Card: ImageVector
    get() {
        if (_Card != null) {
            return _Card!!
        }
        _Card = ImageVector.Builder(
            name = "Card",
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
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 7.969f)
                curveTo(3.668f, 7.969f, 5.021f, 6.64f, 5.021f, 5f)
                curveTo(5.021f, 6.64f, 6.374f, 7.969f, 8.042f, 7.969f)
                verticalLineTo(7.969f)
                curveTo(6.374f, 7.969f, 5.022f, 9.297f, 5.021f, 10.936f)
                curveTo(5.02f, 9.297f, 3.668f, 7.969f, 2f, 7.969f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(2f, 7.969f)
                    curveTo(3.668f, 7.969f, 5.021f, 6.64f, 5.021f, 5f)
                    curveTo(5.021f, 6.64f, 6.374f, 7.969f, 8.042f, 7.969f)
                    verticalLineTo(7.969f)
                    curveTo(6.374f, 7.969f, 5.022f, 9.297f, 5.021f, 10.936f)
                    curveTo(5.02f, 9.297f, 3.668f, 7.969f, 2f, 7.969f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(8.042f, 7.969f)
                    horizontalLineTo(8.542f)
                    verticalLineTo(7.469f)
                    horizontalLineTo(8.042f)
                    verticalLineTo(7.969f)
                    close()
                    moveTo(8.042f, 7.969f)
                    verticalLineTo(8.469f)
                    horizontalLineTo(8.542f)
                    verticalLineTo(7.969f)
                    horizontalLineTo(8.042f)
                    close()
                    moveTo(5.021f, 10.936f)
                    lineTo(4.521f, 10.936f)
                    lineTo(5.521f, 10.936f)
                    lineTo(5.021f, 10.936f)
                    close()
                    moveTo(4.521f, 5f)
                    curveTo(4.521f, 6.355f, 3.401f, 7.469f, 2f, 7.469f)
                    verticalLineTo(8.469f)
                    curveTo(3.936f, 8.469f, 5.521f, 6.924f, 5.521f, 5f)
                    horizontalLineTo(4.521f)
                    close()
                    moveTo(8.042f, 7.469f)
                    curveTo(6.641f, 7.469f, 5.521f, 6.355f, 5.521f, 5f)
                    lineTo(4.521f, 5f)
                    curveTo(4.521f, 6.924f, 6.106f, 8.469f, 8.042f, 8.469f)
                    verticalLineTo(7.469f)
                    close()
                    moveTo(8.542f, 7.969f)
                    verticalLineTo(7.969f)
                    horizontalLineTo(7.542f)
                    verticalLineTo(7.969f)
                    horizontalLineTo(8.542f)
                    close()
                    moveTo(5.521f, 10.936f)
                    curveTo(5.522f, 9.581f, 6.642f, 8.469f, 8.042f, 8.469f)
                    verticalLineTo(7.469f)
                    curveTo(6.106f, 7.469f, 4.522f, 9.013f, 4.521f, 10.936f)
                    lineTo(5.521f, 10.936f)
                    close()
                    moveTo(2f, 8.469f)
                    curveTo(3.4f, 8.469f, 4.52f, 9.581f, 4.521f, 10.936f)
                    lineTo(5.521f, 10.936f)
                    curveTo(5.52f, 9.013f, 3.936f, 7.469f, 2f, 7.469f)
                    lineTo(2f, 8.469f)
                    close()
                }
            }
        }.build()

        return _Card!!
    }

@Suppress("ObjectPropertyName")
private var _Card: ImageVector? = null
