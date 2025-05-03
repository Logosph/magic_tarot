package ru.damapi.divinaition.ui.vectors.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Meaning: ImageVector
    get() {
        if (_Meaning != null) {
            return _Meaning!!
        }
        _Meaning = ImageVector.Builder(
            name = "Meaning",
            defaultWidth = 17.dp,
            defaultHeight = 19.dp,
            viewportWidth = 17f,
            viewportHeight = 19f
        ).apply {
            path(fill = SolidColor(Color(0xFF353535))) {
                moveTo(0.866f, 5.667f)
                lineTo(6.351f, 2.5f)
                arcTo(1f, 1f, 101.981f, isMoreThanHalf = false, isPositiveArc = true, 7.717f, 2.866f)
                lineTo(13.8f, 13.402f)
                arcTo(1f, 1f, 68.199f, isMoreThanHalf = false, isPositiveArc = true, 13.434f, 14.768f)
                lineTo(7.949f, 17.935f)
                arcTo(1f, 1f, 103.283f, isMoreThanHalf = false, isPositiveArc = true, 6.583f, 17.569f)
                lineTo(0.5f, 7.033f)
                arcTo(1f, 1f, 97.973f, isMoreThanHalf = false, isPositiveArc = true, 0.866f, 5.667f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD9D9D9))) {
                moveTo(2.004f, 5.972f)
                lineTo(6.046f, 3.638f)
                arcTo(1f, 1f, 87.667f, isMoreThanHalf = false, isPositiveArc = true, 7.412f, 4.004f)
                lineTo(12.662f, 13.097f)
                arcTo(1f, 1f, 86.898f, isMoreThanHalf = false, isPositiveArc = true, 12.296f, 14.463f)
                lineTo(8.254f, 16.797f)
                arcTo(1f, 1f, 87.515f, isMoreThanHalf = false, isPositiveArc = true, 6.888f, 16.431f)
                lineTo(1.638f, 7.338f)
                arcTo(1f, 1f, 106.236f, isMoreThanHalf = false, isPositiveArc = true, 2.004f, 5.972f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.708f, 7.685f)
                curveTo(6.389f, 8.868f, 5.967f, 10.389f, 4.764f, 11.084f)
                lineTo(4.764f, 11.084f)
                lineTo(4.764f, 11.084f)
                curveTo(5.968f, 10.389f, 7.497f, 10.784f, 8.18f, 11.967f)
                curveTo(7.498f, 10.784f, 7.92f, 9.262f, 9.124f, 8.567f)
                lineTo(9.124f, 8.567f)
                curveTo(7.921f, 9.261f, 6.392f, 8.867f, 5.708f, 7.685f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(5.708f, 7.685f)
                    curveTo(6.389f, 8.868f, 5.967f, 10.389f, 4.764f, 11.084f)
                    lineTo(4.764f, 11.084f)
                    lineTo(4.764f, 11.084f)
                    curveTo(5.968f, 10.389f, 7.497f, 10.784f, 8.18f, 11.967f)
                    curveTo(7.498f, 10.784f, 7.92f, 9.262f, 9.124f, 8.567f)
                    lineTo(9.124f, 8.567f)
                    curveTo(7.921f, 9.261f, 6.392f, 8.867f, 5.708f, 7.685f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(5.012f, 11.056f)
                    lineTo(5.012f, 11.056f)
                    lineTo(4.515f, 11.113f)
                    lineTo(4.515f, 11.113f)
                    lineTo(5.012f, 11.056f)
                    close()
                    moveTo(5.708f, 7.685f)
                    lineTo(6.141f, 7.435f)
                    lineTo(5.275f, 7.935f)
                    lineTo(5.708f, 7.685f)
                    close()
                    moveTo(4.764f, 11.084f)
                    lineTo(4.514f, 10.651f)
                    lineTo(3.946f, 10.979f)
                    lineTo(4.412f, 11.44f)
                    lineTo(4.764f, 11.084f)
                    close()
                    moveTo(4.764f, 11.084f)
                    lineTo(4.412f, 11.44f)
                    lineTo(4.683f, 11.708f)
                    lineTo(5.014f, 11.517f)
                    lineTo(4.764f, 11.084f)
                    close()
                    moveTo(8.18f, 11.967f)
                    lineTo(7.747f, 12.217f)
                    lineTo(8.614f, 11.717f)
                    lineTo(8.18f, 11.967f)
                    close()
                    moveTo(9.124f, 8.567f)
                    lineTo(9.374f, 9f)
                    lineTo(9.709f, 8.806f)
                    lineTo(9.606f, 8.434f)
                    lineTo(9.124f, 8.567f)
                    close()
                    moveTo(9.124f, 8.567f)
                    lineTo(9.606f, 8.434f)
                    lineTo(9.434f, 7.81f)
                    lineTo(8.874f, 8.134f)
                    lineTo(9.124f, 8.567f)
                    close()
                    moveTo(5.014f, 11.517f)
                    curveTo(6.449f, 10.689f, 6.964f, 8.865f, 6.142f, 7.436f)
                    lineTo(5.275f, 7.935f)
                    curveTo(5.814f, 8.872f, 5.485f, 10.09f, 4.514f, 10.651f)
                    lineTo(5.014f, 11.517f)
                    close()
                    moveTo(5.014f, 11.517f)
                    lineTo(5.014f, 11.517f)
                    lineTo(4.514f, 10.651f)
                    lineTo(4.514f, 10.651f)
                    lineTo(5.014f, 11.517f)
                    close()
                    moveTo(5.115f, 10.729f)
                    lineTo(5.115f, 10.729f)
                    lineTo(4.412f, 11.44f)
                    lineTo(4.412f, 11.44f)
                    lineTo(5.115f, 10.729f)
                    close()
                    moveTo(8.613f, 11.717f)
                    curveTo(7.788f, 10.288f, 5.949f, 9.822f, 4.514f, 10.651f)
                    lineTo(5.014f, 11.517f)
                    curveTo(5.986f, 10.956f, 7.206f, 11.281f, 7.747f, 12.217f)
                    lineTo(8.613f, 11.717f)
                    close()
                    moveTo(8.614f, 11.717f)
                    curveTo(8.073f, 10.781f, 8.402f, 9.561f, 9.374f, 9f)
                    lineTo(8.874f, 8.134f)
                    curveTo(7.438f, 8.963f, 6.923f, 10.788f, 7.747f, 12.217f)
                    lineTo(8.614f, 11.717f)
                    close()
                    moveTo(8.642f, 8.699f)
                    lineTo(8.642f, 8.699f)
                    lineTo(9.606f, 8.434f)
                    lineTo(9.606f, 8.434f)
                    lineTo(8.642f, 8.699f)
                    close()
                    moveTo(5.275f, 7.936f)
                    curveTo(6.102f, 9.363f, 7.939f, 9.828f, 9.374f, 9f)
                    lineTo(8.874f, 8.134f)
                    curveTo(7.903f, 8.694f, 6.682f, 8.37f, 6.141f, 7.435f)
                    lineTo(5.275f, 7.936f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF353535))) {
                    moveTo(8f, 0f)
                    lineTo(16f, 0f)
                    arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 1f)
                    lineTo(17f, 16f)
                    arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 17f)
                    lineTo(8f, 17f)
                    arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 16f)
                    lineTo(7f, 1f)
                    arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD9D9D9))) {
                    moveTo(9f, 1f)
                    lineTo(15f, 1f)
                    arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 2f)
                    lineTo(16f, 15f)
                    arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 16f)
                    lineTo(9f, 16f)
                    arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 15f)
                    lineTo(8f, 2f)
                    arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 1f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(9f, 7.969f)
                    curveTo(10.668f, 7.969f, 12.021f, 6.64f, 12.021f, 5f)
                    curveTo(12.021f, 6.64f, 13.374f, 7.969f, 15.042f, 7.969f)
                    verticalLineTo(7.969f)
                    curveTo(13.374f, 7.969f, 12.022f, 9.297f, 12.021f, 10.936f)
                    curveTo(12.02f, 9.297f, 10.668f, 7.969f, 9f, 7.969f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(9f, 7.969f)
                    curveTo(10.668f, 7.969f, 12.021f, 6.64f, 12.021f, 5f)
                    curveTo(12.021f, 6.64f, 13.374f, 7.969f, 15.042f, 7.969f)
                    verticalLineTo(7.969f)
                    curveTo(13.374f, 7.969f, 12.022f, 9.297f, 12.021f, 10.936f)
                    curveTo(12.02f, 9.297f, 10.668f, 7.969f, 9f, 7.969f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(15.042f, 7.969f)
                    horizontalLineTo(15.542f)
                    verticalLineTo(7.469f)
                    horizontalLineTo(15.042f)
                    verticalLineTo(7.969f)
                    close()
                    moveTo(15.042f, 7.969f)
                    verticalLineTo(8.469f)
                    horizontalLineTo(15.542f)
                    verticalLineTo(7.969f)
                    horizontalLineTo(15.042f)
                    close()
                    moveTo(12.021f, 10.936f)
                    lineTo(11.521f, 10.936f)
                    lineTo(12.521f, 10.936f)
                    lineTo(12.021f, 10.936f)
                    close()
                    moveTo(11.521f, 5f)
                    curveTo(11.521f, 6.355f, 10.401f, 7.469f, 9f, 7.469f)
                    verticalLineTo(8.469f)
                    curveTo(10.936f, 8.469f, 12.521f, 6.924f, 12.521f, 5f)
                    horizontalLineTo(11.521f)
                    close()
                    moveTo(15.042f, 7.469f)
                    curveTo(13.642f, 7.469f, 12.521f, 6.355f, 12.521f, 5f)
                    lineTo(11.521f, 5f)
                    curveTo(11.521f, 6.924f, 13.106f, 8.469f, 15.042f, 8.469f)
                    verticalLineTo(7.469f)
                    close()
                    moveTo(15.542f, 7.969f)
                    verticalLineTo(7.969f)
                    horizontalLineTo(14.542f)
                    verticalLineTo(7.969f)
                    horizontalLineTo(15.542f)
                    close()
                    moveTo(12.521f, 10.936f)
                    curveTo(12.522f, 9.581f, 13.642f, 8.469f, 15.042f, 8.469f)
                    verticalLineTo(7.469f)
                    curveTo(13.106f, 7.469f, 11.522f, 9.013f, 11.521f, 10.936f)
                    lineTo(12.521f, 10.936f)
                    close()
                    moveTo(9f, 8.469f)
                    curveTo(10.4f, 8.469f, 11.52f, 9.581f, 11.521f, 10.936f)
                    lineTo(12.521f, 10.936f)
                    curveTo(12.52f, 9.013f, 10.936f, 7.469f, 9f, 7.469f)
                    lineTo(9f, 8.469f)
                    close()
                }
            }
        }.build()

        return _Meaning!!
    }

@Suppress("ObjectPropertyName")
private var _Meaning: ImageVector? = null
