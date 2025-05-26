package ru.damapi.divinaition.ui.vectors.backgrounds

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hand: ImageVector
    get() {
        if (_Hand != null) {
            return _Hand!!
        }
        _Hand = ImageVector.Builder(
            name = "Hand",
            defaultWidth = 811.dp,
            defaultHeight = 313.dp,
            viewportWidth = 811f,
            viewportHeight = 313f
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFD9D9D9),
                        1f to Color(0xFFEBEBEB)
                    ),
                    start = Offset(249.5f, 190.5f),
                    end = Offset(337f, 221.5f)
                )
            ) {
                moveTo(207.5f, 111f)
                lineTo(197.5f, 166f)
                lineTo(255f, 234f)
                lineTo(391.5f, 209.5f)
                lineTo(395f, 179f)
                lineTo(347f, 192.5f)
                curveTo(347f, 192.5f, 265.5f, 204.14f, 257.5f, 199.5f)
                curveTo(249.5f, 194.86f, 234f, 175.5f, 234f, 161.5f)
                curveTo(234f, 147.5f, 231f, 117f, 231f, 117f)
                lineTo(207.5f, 111f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF818181),
                        1f to Color(0xFFC7C7C7)
                    ),
                    start = Offset(157f, 83.5f),
                    end = Offset(236f, 222.5f)
                )
            ) {
                moveTo(144.5f, 129f)
                curveTo(151f, 142.5f, 156f, 159f, 156f, 159f)
                lineTo(171f, 202.5f)
                lineTo(254f, 241f)
                lineTo(309f, 230f)
                curveTo(309f, 230f, 273f, 222f, 263f, 217.5f)
                curveTo(253f, 213f, 224.5f, 193.5f, 212f, 176f)
                curveTo(199.5f, 158.5f, 193f, 133f, 181.5f, 122f)
                curveTo(170f, 111f, 159.5f, 104f, 147.5f, 104f)
                curveTo(135.5f, 104f, 138f, 115.5f, 144.5f, 129f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF636363),
                        1f to Color(0xFFC9C9C9)
                    ),
                    start = Offset(67f, 88.5f),
                    end = Offset(265f, 295.5f)
                )
            ) {
                moveTo(62f, 119.5f)
                curveTo(75f, 137.5f, 139.5f, 226.5f, 139.5f, 226.5f)
                lineTo(167.5f, 242f)
                lineTo(287.5f, 234.5f)
                curveTo(287.5f, 234.5f, 257.5f, 226.5f, 228.5f, 216.5f)
                curveTo(199.5f, 206.5f, 164.5f, 165f, 136.5f, 134f)
                curveTo(108.5f, 103f, 99.5f, 102.5f, 88f, 99.5f)
                curveTo(76.5f, 96.5f, 49f, 101.5f, 62f, 119.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF000000),
                        1f to Color(0xFF666666)
                    ),
                    start = Offset(-33.5f, 223.5f),
                    end = Offset(655f, 133.5f)
                )
            ) {
                moveTo(38.5f, 173.5f)
                curveTo(6.5f, 172f, -2.5f, 191.5f, 1.5f, 199f)
                curveTo(5.5f, 206.5f, 52.5f, 229.5f, 69f, 240.5f)
                curveTo(85.5f, 251.5f, 90f, 256.5f, 104.5f, 265f)
                curveTo(119f, 273.5f, 219.5f, 303f, 233.5f, 311f)
                curveTo(247.5f, 319f, 400.5f, 300.5f, 421.5f, 298f)
                curveTo(442.5f, 295.5f, 571f, 249f, 609.5f, 234f)
                curveTo(648f, 219f, 833f, 205f, 833f, 205f)
                verticalLineTo(0.5f)
                curveTo(833f, 0.5f, 668f, 65.5f, 648f, 61f)
                curveTo(628f, 56.5f, 518.5f, 10f, 474f, 19f)
                curveTo(429.5f, 28f, 400.5f, 46.5f, 376.5f, 51.5f)
                curveTo(352.5f, 56.5f, 329.5f, 54f, 317f, 57.5f)
                curveTo(304.5f, 61f, 273.5f, 83f, 247.5f, 89.5f)
                curveTo(221.5f, 96f, 216.5f, 94f, 205.5f, 103f)
                curveTo(194.5f, 112f, 220f, 140f, 240f, 142.5f)
                curveTo(260f, 145f, 267.19f, 144.03f, 284.5f, 142.5f)
                curveTo(312.48f, 140.02f, 336f, 128.5f, 354.5f, 126f)
                curveTo(373f, 123.5f, 398.5f, 128f, 405.5f, 146f)
                curveTo(412.5f, 164f, 379.5f, 187.5f, 365f, 193f)
                curveTo(350.5f, 198.5f, 251f, 235.5f, 240f, 233f)
                curveTo(229f, 230.5f, 146.5f, 215f, 139.5f, 211.5f)
                curveTo(132.5f, 208f, 70.5f, 175f, 38.5f, 173.5f)
                close()
            }
        }.build()

        return _Hand!!
    }

@Suppress("ObjectPropertyName")
private var _Hand: ImageVector? = null
