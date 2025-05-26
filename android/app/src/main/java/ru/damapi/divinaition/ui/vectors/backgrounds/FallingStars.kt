package ru.damapi.divinaition.ui.vectors.backgrounds

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FallingStars: ImageVector
    get() {
        if (_FallingStars != null) {
            return _FallingStars!!
        }
        _FallingStars = ImageVector.Builder(
            name = "FallingStars",
            defaultWidth = 654.dp,
            defaultHeight = 496.dp,
            viewportWidth = 654f,
            viewportHeight = 496f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF919191)),
                strokeLineWidth = 1f
            ) {
                moveTo(145.5f, -9f)
                lineTo(145.5f, 198f)
            }
            path(
                stroke = SolidColor(Color(0xFF919191)),
                strokeLineWidth = 1f
            ) {
                moveTo(36.5f, -9f)
                lineTo(36.5f, 338f)
            }
            path(
                stroke = SolidColor(Color(0xFF919191)),
                strokeLineWidth = 1f
            ) {
                moveTo(9.5f, -19f)
                lineTo(9.5f, 151f)
            }
            path(
                stroke = SolidColor(Color(0xFF919191)),
                strokeLineWidth = 1f
            ) {
                moveTo(268.5f, -27f)
                lineTo(268.5f, 253f)
            }
            path(
                stroke = SolidColor(Color(0xFF919191)),
                strokeLineWidth = 1f
            ) {
                moveTo(335.5f, -9f)
                lineTo(335.5f, 334f)
            }
            path(
                stroke = SolidColor(Color(0xFF919191)),
                strokeLineWidth = 1f
            ) {
                moveTo(388.5f, -9f)
                lineTo(388.5f, 434f)
            }
            path(
                stroke = SolidColor(Color(0xFF919191)),
                strokeLineWidth = 1f
            ) {
                moveTo(477.5f, -19f)
                lineTo(477.5f, 186f)
            }
            path(
                stroke = SolidColor(Color(0xFF919191)),
                strokeLineWidth = 1f
            ) {
                moveTo(555.5f, -9f)
                lineTo(555.5f, 218f)
            }
            path(
                stroke = SolidColor(Color(0xFF919191)),
                strokeLineWidth = 1f
            ) {
                moveTo(582.5f, -9f)
                lineTo(582.5f, 286f)
            }
            path(
                fill = SolidColor(Color(0xFF919191)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(35.99f, 342f)
                curveTo(35.98f, 351.1f, 30.62f, 358.48f, 24f, 358.5f)
                curveTo(30.62f, 358.52f, 35.98f, 365.9f, 35.99f, 375f)
                curveTo(35.99f, 365.9f, 41.35f, 358.52f, 47.97f, 358.5f)
                curveTo(41.35f, 358.48f, 35.99f, 351.1f, 35.99f, 342f)
                close()
            }
            group(
                clipPathData = PathData {
                    moveTo(35.99f, 342f)
                    curveTo(35.98f, 351.1f, 30.62f, 358.48f, 24f, 358.5f)
                    curveTo(30.62f, 358.52f, 35.98f, 365.9f, 35.99f, 375f)
                    curveTo(35.99f, 365.9f, 41.35f, 358.52f, 47.97f, 358.5f)
                    curveTo(41.35f, 358.48f, 35.99f, 351.1f, 35.99f, 342f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF919191))) {
                    moveTo(24f, 358.5f)
                    lineTo(24f, 357.5f)
                    lineTo(24f, 359.5f)
                    lineTo(24f, 358.5f)
                    close()
                    moveTo(35.99f, 342f)
                    lineTo(36.99f, 342f)
                    lineTo(34.99f, 342f)
                    lineTo(35.99f, 342f)
                    close()
                    moveTo(35.99f, 375f)
                    lineTo(34.99f, 375f)
                    horizontalLineTo(36.99f)
                    lineTo(35.99f, 375f)
                    close()
                    moveTo(47.97f, 358.5f)
                    lineTo(47.97f, 359.5f)
                    lineTo(47.97f, 357.5f)
                    lineTo(47.97f, 358.5f)
                    close()
                    moveTo(24f, 359.5f)
                    curveTo(27.71f, 359.49f, 30.98f, 357.41f, 33.28f, 354.24f)
                    curveTo(35.58f, 351.07f, 36.98f, 346.74f, 36.99f, 342f)
                    lineTo(34.99f, 342f)
                    curveTo(34.98f, 346.36f, 33.69f, 350.27f, 31.66f, 353.07f)
                    curveTo(29.63f, 355.86f, 26.91f, 357.49f, 24f, 357.5f)
                    lineTo(24f, 359.5f)
                    close()
                    moveTo(36.99f, 375f)
                    curveTo(36.98f, 370.26f, 35.58f, 365.93f, 33.28f, 362.76f)
                    curveTo(30.98f, 359.59f, 27.71f, 357.51f, 24f, 357.5f)
                    lineTo(24f, 359.5f)
                    curveTo(26.91f, 359.51f, 29.63f, 361.14f, 31.66f, 363.93f)
                    curveTo(33.69f, 366.73f, 34.98f, 370.64f, 34.99f, 375f)
                    lineTo(36.99f, 375f)
                    close()
                    moveTo(36.99f, 375f)
                    curveTo(36.99f, 370.64f, 38.28f, 366.73f, 40.31f, 363.93f)
                    curveTo(42.34f, 361.14f, 45.06f, 359.51f, 47.97f, 359.5f)
                    lineTo(47.97f, 357.5f)
                    curveTo(44.26f, 357.51f, 41f, 359.59f, 38.69f, 362.76f)
                    curveTo(36.39f, 365.93f, 34.99f, 370.26f, 34.99f, 375f)
                    lineTo(36.99f, 375f)
                    close()
                    moveTo(34.99f, 342f)
                    curveTo(34.99f, 346.74f, 36.39f, 351.07f, 38.69f, 354.24f)
                    curveTo(40.99f, 357.41f, 44.26f, 359.49f, 47.97f, 359.5f)
                    lineTo(47.97f, 357.5f)
                    curveTo(45.06f, 357.49f, 42.34f, 355.86f, 40.31f, 353.07f)
                    curveTo(38.28f, 350.27f, 36.99f, 346.36f, 36.99f, 342f)
                    lineTo(34.99f, 342f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF919191)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(554.72f, 222f)
                    curveTo(554.71f, 228.61f, 550.81f, 233.97f, 546f, 233.99f)
                    curveTo(550.81f, 234.01f, 554.71f, 239.37f, 554.72f, 245.98f)
                    curveTo(554.73f, 239.37f, 558.62f, 234.01f, 563.43f, 233.99f)
                    curveTo(558.63f, 233.97f, 554.73f, 228.61f, 554.72f, 222f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(554.72f, 222f)
                    curveTo(554.71f, 228.61f, 550.81f, 233.97f, 546f, 233.99f)
                    curveTo(550.81f, 234.01f, 554.71f, 239.37f, 554.72f, 245.98f)
                    curveTo(554.73f, 239.37f, 558.62f, 234.01f, 563.43f, 233.99f)
                    curveTo(558.63f, 233.97f, 554.73f, 228.61f, 554.72f, 222f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF919191))) {
                    moveTo(546f, 233.99f)
                    lineTo(546f, 232.99f)
                    lineTo(546f, 234.99f)
                    lineTo(546f, 233.99f)
                    close()
                    moveTo(554.72f, 222f)
                    lineTo(555.72f, 222f)
                    lineTo(553.72f, 222f)
                    lineTo(554.72f, 222f)
                    close()
                    moveTo(554.72f, 245.98f)
                    lineTo(553.72f, 245.98f)
                    horizontalLineTo(555.72f)
                    lineTo(554.72f, 245.98f)
                    close()
                    moveTo(563.43f, 233.99f)
                    lineTo(563.44f, 234.99f)
                    lineTo(563.44f, 232.99f)
                    lineTo(563.43f, 233.99f)
                    close()
                    moveTo(546f, 234.99f)
                    curveTo(548.8f, 234.98f, 551.25f, 233.41f, 552.97f, 231.06f)
                    curveTo(554.68f, 228.7f, 555.71f, 225.5f, 555.72f, 222f)
                    lineTo(553.72f, 222f)
                    curveTo(553.71f, 225.12f, 552.79f, 227.9f, 551.35f, 229.88f)
                    curveTo(549.91f, 231.86f, 548f, 232.98f, 546f, 232.99f)
                    lineTo(546f, 234.99f)
                    close()
                    moveTo(555.72f, 245.98f)
                    curveTo(555.71f, 242.49f, 554.68f, 239.28f, 552.97f, 236.92f)
                    curveTo(551.26f, 234.57f, 548.81f, 233f, 546f, 232.99f)
                    lineTo(546f, 234.99f)
                    curveTo(548f, 235f, 549.91f, 236.12f, 551.35f, 238.1f)
                    curveTo(552.79f, 240.08f, 553.71f, 242.86f, 553.72f, 245.98f)
                    lineTo(555.72f, 245.98f)
                    close()
                    moveTo(555.72f, 245.98f)
                    curveTo(555.72f, 242.86f, 556.64f, 240.08f, 558.08f, 238.1f)
                    curveTo(559.53f, 236.12f, 561.43f, 235f, 563.44f, 234.99f)
                    lineTo(563.43f, 232.99f)
                    curveTo(560.63f, 233f, 558.18f, 234.57f, 556.47f, 236.92f)
                    curveTo(554.75f, 239.28f, 553.72f, 242.48f, 553.72f, 245.98f)
                    lineTo(555.72f, 245.98f)
                    close()
                    moveTo(553.72f, 222f)
                    curveTo(553.72f, 225.5f, 554.75f, 228.7f, 556.47f, 231.06f)
                    curveTo(558.18f, 233.41f, 560.63f, 234.98f, 563.43f, 234.99f)
                    lineTo(563.44f, 232.99f)
                    curveTo(561.43f, 232.98f, 559.53f, 231.86f, 558.09f, 229.88f)
                    curveTo(556.65f, 227.9f, 555.72f, 225.12f, 555.72f, 222f)
                    lineTo(553.72f, 222f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF919191)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(476.98f, 196f)
                    curveTo(476.98f, 205.1f, 471.62f, 212.48f, 465f, 212.5f)
                    curveTo(471.62f, 212.52f, 476.98f, 219.9f, 476.98f, 229f)
                    curveTo(476.99f, 219.9f, 482.35f, 212.52f, 488.97f, 212.5f)
                    curveTo(482.35f, 212.48f, 476.99f, 205.1f, 476.98f, 196f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(476.98f, 196f)
                    curveTo(476.98f, 205.1f, 471.62f, 212.48f, 465f, 212.5f)
                    curveTo(471.62f, 212.52f, 476.98f, 219.9f, 476.98f, 229f)
                    curveTo(476.99f, 219.9f, 482.35f, 212.52f, 488.97f, 212.5f)
                    curveTo(482.35f, 212.48f, 476.99f, 205.1f, 476.98f, 196f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF919191))) {
                    moveTo(465f, 212.5f)
                    lineTo(465f, 211.5f)
                    lineTo(465f, 213.5f)
                    lineTo(465f, 212.5f)
                    close()
                    moveTo(476.98f, 196f)
                    lineTo(477.98f, 196f)
                    lineTo(475.98f, 196f)
                    lineTo(476.98f, 196f)
                    close()
                    moveTo(476.98f, 229f)
                    lineTo(475.98f, 229f)
                    horizontalLineTo(477.98f)
                    lineTo(476.98f, 229f)
                    close()
                    moveTo(488.97f, 212.5f)
                    lineTo(488.97f, 213.5f)
                    lineTo(488.97f, 211.5f)
                    lineTo(488.97f, 212.5f)
                    close()
                    moveTo(465f, 213.5f)
                    curveTo(468.71f, 213.49f, 471.98f, 211.41f, 474.28f, 208.24f)
                    curveTo(476.58f, 205.07f, 477.98f, 200.74f, 477.98f, 196f)
                    lineTo(475.98f, 196f)
                    curveTo(475.98f, 200.36f, 474.69f, 204.27f, 472.66f, 207.07f)
                    curveTo(470.63f, 209.86f, 467.91f, 211.49f, 465f, 211.5f)
                    lineTo(465f, 213.5f)
                    close()
                    moveTo(477.98f, 229f)
                    curveTo(477.98f, 224.26f, 476.58f, 219.93f, 474.28f, 216.76f)
                    curveTo(471.98f, 213.59f, 468.71f, 211.51f, 465f, 211.5f)
                    lineTo(465f, 213.5f)
                    curveTo(467.91f, 213.51f, 470.63f, 215.14f, 472.66f, 217.93f)
                    curveTo(474.69f, 220.73f, 475.98f, 224.64f, 475.98f, 229f)
                    lineTo(477.98f, 229f)
                    close()
                    moveTo(477.98f, 229f)
                    curveTo(477.99f, 224.64f, 479.28f, 220.73f, 481.31f, 217.93f)
                    curveTo(483.34f, 215.14f, 486.06f, 213.51f, 488.97f, 213.5f)
                    lineTo(488.97f, 211.5f)
                    curveTo(485.26f, 211.51f, 481.99f, 213.59f, 479.69f, 216.76f)
                    curveTo(477.39f, 219.93f, 475.99f, 224.26f, 475.98f, 229f)
                    lineTo(477.98f, 229f)
                    close()
                    moveTo(475.98f, 196f)
                    curveTo(475.99f, 200.74f, 477.39f, 205.07f, 479.69f, 208.24f)
                    curveTo(481.99f, 211.41f, 485.26f, 213.49f, 488.97f, 213.5f)
                    lineTo(488.97f, 211.5f)
                    curveTo(486.06f, 211.49f, 483.34f, 209.86f, 481.31f, 207.07f)
                    curveTo(479.28f, 204.27f, 477.99f, 200.36f, 477.98f, 196f)
                    lineTo(475.98f, 196f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF919191)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(581.98f, 287f)
                    curveTo(581.98f, 296.1f, 576.62f, 303.48f, 570f, 303.5f)
                    curveTo(576.62f, 303.52f, 581.98f, 310.9f, 581.98f, 320f)
                    curveTo(581.99f, 310.9f, 587.35f, 303.52f, 593.97f, 303.5f)
                    curveTo(587.35f, 303.48f, 581.99f, 296.1f, 581.98f, 287f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(581.98f, 287f)
                    curveTo(581.98f, 296.1f, 576.62f, 303.48f, 570f, 303.5f)
                    curveTo(576.62f, 303.52f, 581.98f, 310.9f, 581.98f, 320f)
                    curveTo(581.99f, 310.9f, 587.35f, 303.52f, 593.97f, 303.5f)
                    curveTo(587.35f, 303.48f, 581.99f, 296.1f, 581.98f, 287f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF919191))) {
                    moveTo(570f, 303.5f)
                    lineTo(570f, 302.5f)
                    lineTo(570f, 304.5f)
                    lineTo(570f, 303.5f)
                    close()
                    moveTo(581.98f, 287f)
                    lineTo(582.98f, 287f)
                    lineTo(580.98f, 287f)
                    lineTo(581.98f, 287f)
                    close()
                    moveTo(581.98f, 320f)
                    lineTo(580.98f, 320f)
                    horizontalLineTo(582.98f)
                    lineTo(581.98f, 320f)
                    close()
                    moveTo(593.97f, 303.5f)
                    lineTo(593.97f, 304.5f)
                    lineTo(593.97f, 302.5f)
                    lineTo(593.97f, 303.5f)
                    close()
                    moveTo(570f, 304.5f)
                    curveTo(573.71f, 304.49f, 576.98f, 302.41f, 579.28f, 299.24f)
                    curveTo(581.58f, 296.07f, 582.98f, 291.74f, 582.98f, 287f)
                    lineTo(580.98f, 287f)
                    curveTo(580.98f, 291.36f, 579.69f, 295.27f, 577.66f, 298.07f)
                    curveTo(575.63f, 300.86f, 572.91f, 302.49f, 570f, 302.5f)
                    lineTo(570f, 304.5f)
                    close()
                    moveTo(582.98f, 320f)
                    curveTo(582.98f, 315.26f, 581.58f, 310.93f, 579.28f, 307.76f)
                    curveTo(576.97f, 304.59f, 573.71f, 302.51f, 570f, 302.5f)
                    lineTo(570f, 304.5f)
                    curveTo(572.91f, 304.51f, 575.63f, 306.14f, 577.66f, 308.93f)
                    curveTo(579.69f, 311.73f, 580.98f, 315.64f, 580.98f, 320f)
                    lineTo(582.98f, 320f)
                    close()
                    moveTo(582.98f, 320f)
                    curveTo(582.99f, 315.64f, 584.28f, 311.73f, 586.31f, 308.93f)
                    curveTo(588.34f, 306.14f, 591.06f, 304.51f, 593.97f, 304.5f)
                    lineTo(593.97f, 302.5f)
                    curveTo(590.26f, 302.51f, 586.99f, 304.59f, 584.69f, 307.76f)
                    curveTo(582.39f, 310.93f, 580.99f, 315.26f, 580.98f, 320f)
                    lineTo(582.98f, 320f)
                    close()
                    moveTo(580.98f, 287f)
                    curveTo(580.99f, 291.74f, 582.39f, 296.07f, 584.69f, 299.24f)
                    curveTo(586.99f, 302.41f, 590.26f, 304.49f, 593.97f, 304.5f)
                    lineTo(593.97f, 302.5f)
                    curveTo(591.06f, 302.49f, 588.34f, 300.86f, 586.31f, 298.07f)
                    curveTo(584.28f, 295.27f, 582.99f, 291.36f, 582.98f, 287f)
                    lineTo(580.98f, 287f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF919191)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(334.98f, 338f)
                    curveTo(334.98f, 347.1f, 329.62f, 354.48f, 323f, 354.5f)
                    curveTo(329.62f, 354.52f, 334.98f, 361.9f, 334.98f, 371f)
                    curveTo(334.99f, 361.9f, 340.35f, 354.52f, 346.97f, 354.5f)
                    curveTo(340.35f, 354.48f, 334.99f, 347.1f, 334.98f, 338f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(334.98f, 338f)
                    curveTo(334.98f, 347.1f, 329.62f, 354.48f, 323f, 354.5f)
                    curveTo(329.62f, 354.52f, 334.98f, 361.9f, 334.98f, 371f)
                    curveTo(334.99f, 361.9f, 340.35f, 354.52f, 346.97f, 354.5f)
                    curveTo(340.35f, 354.48f, 334.99f, 347.1f, 334.98f, 338f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF919191))) {
                    moveTo(323f, 354.5f)
                    lineTo(323f, 353.5f)
                    lineTo(323f, 355.5f)
                    lineTo(323f, 354.5f)
                    close()
                    moveTo(334.98f, 338f)
                    lineTo(335.98f, 338f)
                    lineTo(333.98f, 338f)
                    lineTo(334.98f, 338f)
                    close()
                    moveTo(334.98f, 371f)
                    lineTo(333.98f, 371f)
                    horizontalLineTo(335.98f)
                    lineTo(334.98f, 371f)
                    close()
                    moveTo(346.97f, 354.5f)
                    lineTo(346.97f, 355.5f)
                    lineTo(346.97f, 353.5f)
                    lineTo(346.97f, 354.5f)
                    close()
                    moveTo(323f, 355.5f)
                    curveTo(326.71f, 355.49f, 329.98f, 353.41f, 332.28f, 350.24f)
                    curveTo(334.58f, 347.07f, 335.98f, 342.74f, 335.98f, 338f)
                    lineTo(333.98f, 338f)
                    curveTo(333.98f, 342.36f, 332.69f, 346.27f, 330.66f, 349.07f)
                    curveTo(328.63f, 351.86f, 325.91f, 353.49f, 323f, 353.5f)
                    lineTo(323f, 355.5f)
                    close()
                    moveTo(335.98f, 371f)
                    curveTo(335.98f, 366.26f, 334.58f, 361.93f, 332.28f, 358.76f)
                    curveTo(329.98f, 355.59f, 326.71f, 353.51f, 323f, 353.5f)
                    lineTo(323f, 355.5f)
                    curveTo(325.91f, 355.51f, 328.63f, 357.14f, 330.66f, 359.93f)
                    curveTo(332.69f, 362.73f, 333.98f, 366.64f, 333.98f, 371f)
                    lineTo(335.98f, 371f)
                    close()
                    moveTo(335.98f, 371f)
                    curveTo(335.99f, 366.64f, 337.28f, 362.73f, 339.31f, 359.93f)
                    curveTo(341.34f, 357.14f, 344.06f, 355.51f, 346.97f, 355.5f)
                    lineTo(346.97f, 353.5f)
                    curveTo(343.26f, 353.51f, 339.99f, 355.59f, 337.69f, 358.76f)
                    curveTo(335.39f, 361.93f, 333.99f, 366.26f, 333.98f, 371f)
                    lineTo(335.98f, 371f)
                    close()
                    moveTo(333.98f, 338f)
                    curveTo(333.99f, 342.74f, 335.39f, 347.07f, 337.69f, 350.24f)
                    curveTo(339.99f, 353.41f, 343.26f, 355.49f, 346.97f, 355.5f)
                    lineTo(346.97f, 353.5f)
                    curveTo(344.06f, 353.49f, 341.34f, 351.86f, 339.31f, 349.07f)
                    curveTo(337.28f, 346.27f, 335.99f, 342.36f, 335.98f, 338f)
                    lineTo(333.98f, 338f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF919191)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(387.53f, 465.99f)
                    curveTo(387.54f, 458f, 392.25f, 451.51f, 398.06f, 451.49f)
                    curveTo(392.25f, 451.47f, 387.54f, 444.99f, 387.53f, 437f)
                    curveTo(387.52f, 444.99f, 382.81f, 451.47f, 377f, 451.49f)
                    curveTo(382.81f, 451.51f, 387.52f, 458f, 387.53f, 465.99f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(387.53f, 465.99f)
                    curveTo(387.54f, 458f, 392.25f, 451.51f, 398.06f, 451.49f)
                    curveTo(392.25f, 451.47f, 387.54f, 444.99f, 387.53f, 437f)
                    curveTo(387.52f, 444.99f, 382.81f, 451.47f, 377f, 451.49f)
                    curveTo(382.81f, 451.51f, 387.52f, 458f, 387.53f, 465.99f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF919191))) {
                    moveTo(387.53f, 465.99f)
                    lineTo(386.53f, 466f)
                    lineTo(388.53f, 466f)
                    lineTo(387.53f, 465.99f)
                    close()
                    moveTo(398.06f, 451.49f)
                    lineTo(398.07f, 452.49f)
                    lineTo(398.07f, 450.49f)
                    lineTo(398.06f, 451.49f)
                    close()
                    moveTo(387.53f, 437f)
                    lineTo(388.53f, 437f)
                    lineTo(386.53f, 437f)
                    lineTo(387.53f, 437f)
                    close()
                    moveTo(377f, 451.49f)
                    lineTo(377f, 450.49f)
                    lineTo(377f, 452.49f)
                    lineTo(377f, 451.49f)
                    close()
                    moveTo(388.53f, 466f)
                    curveTo(388.53f, 462.18f, 389.66f, 458.77f, 391.43f, 456.34f)
                    curveTo(393.2f, 453.9f, 395.56f, 452.5f, 398.07f, 452.49f)
                    lineTo(398.06f, 450.49f)
                    curveTo(394.75f, 450.5f, 391.85f, 452.35f, 389.81f, 455.17f)
                    curveTo(387.77f, 457.98f, 386.53f, 461.81f, 386.53f, 465.99f)
                    lineTo(388.53f, 466f)
                    close()
                    moveTo(398.07f, 450.49f)
                    curveTo(395.56f, 450.48f, 393.2f, 449.08f, 391.43f, 446.65f)
                    curveTo(389.66f, 444.21f, 388.54f, 440.81f, 388.53f, 437f)
                    lineTo(386.53f, 437f)
                    curveTo(386.54f, 441.19f, 387.77f, 445.01f, 389.81f, 447.82f)
                    curveTo(391.85f, 450.63f, 394.76f, 452.48f, 398.06f, 452.49f)
                    lineTo(398.07f, 450.49f)
                    close()
                    moveTo(386.53f, 437f)
                    curveTo(386.52f, 440.81f, 385.4f, 444.21f, 383.63f, 446.65f)
                    curveTo(381.86f, 449.08f, 379.51f, 450.48f, 377f, 450.49f)
                    lineTo(377f, 452.49f)
                    curveTo(380.31f, 452.48f, 383.21f, 450.63f, 385.25f, 447.82f)
                    curveTo(387.29f, 445.01f, 388.52f, 441.19f, 388.53f, 437f)
                    lineTo(386.53f, 437f)
                    close()
                    moveTo(377f, 452.49f)
                    curveTo(379.51f, 452.5f, 381.86f, 453.9f, 383.63f, 456.34f)
                    curveTo(385.4f, 458.77f, 386.53f, 462.18f, 386.53f, 466f)
                    lineTo(388.53f, 465.99f)
                    curveTo(388.53f, 461.81f, 387.29f, 457.98f, 385.25f, 455.17f)
                    curveTo(383.21f, 452.36f, 380.31f, 450.51f, 377f, 450.49f)
                    lineTo(377f, 452.49f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF919191)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(277f, 269.49f)
                    curveTo(272.03f, 269.47f, 268.01f, 263.89f, 268f, 257f)
                    curveTo(267.99f, 263.89f, 263.97f, 269.47f, 259f, 269.49f)
                    curveTo(263.97f, 269.51f, 268f, 275.1f, 268f, 281.99f)
                    curveTo(268f, 275.1f, 272.03f, 269.51f, 277f, 269.49f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(277f, 269.49f)
                    curveTo(272.03f, 269.47f, 268.01f, 263.89f, 268f, 257f)
                    curveTo(267.99f, 263.89f, 263.97f, 269.47f, 259f, 269.49f)
                    curveTo(263.97f, 269.51f, 268f, 275.1f, 268f, 281.99f)
                    curveTo(268f, 275.1f, 272.03f, 269.51f, 277f, 269.49f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF919191))) {
                    moveTo(277f, 269.49f)
                    lineTo(277f, 270.49f)
                    lineTo(277f, 268.49f)
                    lineTo(277f, 269.49f)
                    close()
                    moveTo(268f, 257f)
                    lineTo(269f, 257f)
                    lineTo(267f, 257f)
                    lineTo(268f, 257f)
                    close()
                    moveTo(259f, 269.49f)
                    lineTo(259f, 268.49f)
                    lineTo(259f, 270.49f)
                    lineTo(259f, 269.49f)
                    close()
                    moveTo(268f, 281.99f)
                    lineTo(267f, 281.99f)
                    lineTo(269f, 281.99f)
                    lineTo(268f, 281.99f)
                    close()
                    moveTo(277f, 268.49f)
                    curveTo(274.92f, 268.48f, 272.95f, 267.31f, 271.45f, 265.24f)
                    curveTo(269.96f, 263.17f, 269f, 260.26f, 269f, 257f)
                    lineTo(267f, 257f)
                    curveTo(267.01f, 260.63f, 268.07f, 263.96f, 269.83f, 266.41f)
                    curveTo(271.59f, 268.85f, 274.11f, 270.48f, 277f, 270.49f)
                    lineTo(277f, 268.49f)
                    close()
                    moveTo(267f, 257f)
                    curveTo(267f, 260.26f, 266.04f, 263.17f, 264.55f, 265.24f)
                    curveTo(263.05f, 267.31f, 261.08f, 268.48f, 259f, 268.49f)
                    lineTo(259f, 270.49f)
                    curveTo(261.89f, 270.48f, 264.41f, 268.85f, 266.17f, 266.41f)
                    curveTo(267.93f, 263.96f, 268.99f, 260.63f, 269f, 257f)
                    lineTo(267f, 257f)
                    close()
                    moveTo(259f, 270.49f)
                    curveTo(261.08f, 270.5f, 263.06f, 271.67f, 264.55f, 273.75f)
                    curveTo(266.04f, 275.82f, 267f, 278.73f, 267f, 281.99f)
                    lineTo(269f, 281.99f)
                    curveTo(269f, 278.36f, 267.94f, 275.03f, 266.17f, 272.58f)
                    curveTo(264.41f, 270.13f, 261.89f, 268.5f, 259f, 268.49f)
                    lineTo(259f, 270.49f)
                    close()
                    moveTo(269f, 281.99f)
                    curveTo(269f, 278.73f, 269.96f, 275.82f, 271.45f, 273.75f)
                    curveTo(272.94f, 271.67f, 274.92f, 270.5f, 277f, 270.49f)
                    lineTo(277f, 268.49f)
                    curveTo(274.11f, 268.5f, 271.59f, 270.13f, 269.83f, 272.58f)
                    curveTo(268.06f, 275.03f, 267f, 278.36f, 267f, 281.99f)
                    lineTo(269f, 281.99f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF919191)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(144.99f, 207f)
                    curveTo(144.98f, 216.1f, 139.62f, 223.48f, 133f, 223.5f)
                    curveTo(139.62f, 223.52f, 144.98f, 230.9f, 144.99f, 240f)
                    curveTo(144.99f, 230.9f, 150.35f, 223.52f, 156.97f, 223.5f)
                    curveTo(150.35f, 223.48f, 144.99f, 216.1f, 144.99f, 207f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(144.99f, 207f)
                    curveTo(144.98f, 216.1f, 139.62f, 223.48f, 133f, 223.5f)
                    curveTo(139.62f, 223.52f, 144.98f, 230.9f, 144.99f, 240f)
                    curveTo(144.99f, 230.9f, 150.35f, 223.52f, 156.97f, 223.5f)
                    curveTo(150.35f, 223.48f, 144.99f, 216.1f, 144.99f, 207f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF919191))) {
                    moveTo(133f, 223.5f)
                    lineTo(133f, 222.5f)
                    lineTo(133f, 224.5f)
                    lineTo(133f, 223.5f)
                    close()
                    moveTo(144.99f, 207f)
                    lineTo(145.99f, 207f)
                    lineTo(143.99f, 207f)
                    lineTo(144.99f, 207f)
                    close()
                    moveTo(144.99f, 240f)
                    lineTo(143.99f, 240f)
                    horizontalLineTo(145.99f)
                    lineTo(144.99f, 240f)
                    close()
                    moveTo(156.97f, 223.5f)
                    lineTo(156.97f, 224.5f)
                    lineTo(156.97f, 222.5f)
                    lineTo(156.97f, 223.5f)
                    close()
                    moveTo(133f, 224.5f)
                    curveTo(136.71f, 224.49f, 139.98f, 222.41f, 142.28f, 219.24f)
                    curveTo(144.58f, 216.07f, 145.98f, 211.74f, 145.99f, 207f)
                    lineTo(143.99f, 207f)
                    curveTo(143.98f, 211.36f, 142.69f, 215.27f, 140.66f, 218.07f)
                    curveTo(138.63f, 220.86f, 135.91f, 222.49f, 133f, 222.5f)
                    lineTo(133f, 224.5f)
                    close()
                    moveTo(145.99f, 240f)
                    curveTo(145.98f, 235.26f, 144.58f, 230.93f, 142.28f, 227.76f)
                    curveTo(139.98f, 224.59f, 136.71f, 222.51f, 133f, 222.5f)
                    lineTo(133f, 224.5f)
                    curveTo(135.91f, 224.51f, 138.63f, 226.14f, 140.66f, 228.93f)
                    curveTo(142.69f, 231.73f, 143.98f, 235.64f, 143.99f, 240f)
                    lineTo(145.99f, 240f)
                    close()
                    moveTo(145.99f, 240f)
                    curveTo(145.99f, 235.64f, 147.28f, 231.73f, 149.31f, 228.93f)
                    curveTo(151.34f, 226.14f, 154.06f, 224.51f, 156.97f, 224.5f)
                    lineTo(156.97f, 222.5f)
                    curveTo(153.26f, 222.51f, 149.99f, 224.59f, 147.69f, 227.76f)
                    curveTo(145.39f, 230.93f, 143.99f, 235.26f, 143.99f, 240f)
                    lineTo(145.99f, 240f)
                    close()
                    moveTo(143.99f, 207f)
                    curveTo(143.99f, 211.74f, 145.39f, 216.07f, 147.69f, 219.24f)
                    curveTo(149.99f, 222.41f, 153.26f, 224.49f, 156.97f, 224.5f)
                    lineTo(156.97f, 222.5f)
                    curveTo(154.06f, 222.49f, 151.34f, 220.86f, 149.31f, 218.07f)
                    curveTo(147.28f, 215.27f, 145.99f, 211.36f, 145.99f, 207f)
                    lineTo(143.99f, 207f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF919191)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8.5f, 177.41f)
                    curveTo(8.49f, 170.95f, 4.69f, 165.72f, 0f, 165.71f)
                    curveTo(4.69f, 165.69f, 8.49f, 160.46f, 8.5f, 154f)
                    curveTo(8.51f, 160.46f, 12.31f, 165.69f, 17f, 165.71f)
                    curveTo(12.31f, 165.72f, 8.51f, 170.95f, 8.5f, 177.41f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(8.5f, 177.41f)
                    curveTo(8.49f, 170.95f, 4.69f, 165.72f, 0f, 165.71f)
                    curveTo(4.69f, 165.69f, 8.49f, 160.46f, 8.5f, 154f)
                    curveTo(8.51f, 160.46f, 12.31f, 165.69f, 17f, 165.71f)
                    curveTo(12.31f, 165.72f, 8.51f, 170.95f, 8.5f, 177.41f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF919191))) {
                    moveTo(0f, 165.71f)
                    lineTo(-0f, 164.71f)
                    lineTo(-0f, 166.71f)
                    lineTo(0f, 165.71f)
                    close()
                    moveTo(8.5f, 177.41f)
                    lineTo(7.5f, 177.41f)
                    horizontalLineTo(9.5f)
                    lineTo(8.5f, 177.41f)
                    close()
                    moveTo(8.5f, 154f)
                    lineTo(9.5f, 154f)
                    lineTo(7.5f, 154f)
                    lineTo(8.5f, 154f)
                    close()
                    moveTo(17f, 165.71f)
                    lineTo(17f, 166.71f)
                    lineTo(17f, 164.71f)
                    lineTo(17f, 165.71f)
                    close()
                    moveTo(-0f, 166.71f)
                    curveTo(1.95f, 166.71f, 3.8f, 167.8f, 5.2f, 169.73f)
                    curveTo(6.6f, 171.66f, 7.5f, 174.37f, 7.5f, 177.41f)
                    lineTo(9.5f, 177.41f)
                    curveTo(9.5f, 173.99f, 8.49f, 170.86f, 6.82f, 168.55f)
                    curveTo(5.14f, 166.25f, 2.75f, 164.71f, 0f, 164.71f)
                    lineTo(-0f, 166.71f)
                    close()
                    moveTo(7.5f, 154f)
                    curveTo(7.5f, 157.04f, 6.6f, 159.75f, 5.2f, 161.68f)
                    curveTo(3.8f, 163.61f, 1.95f, 164.7f, -0f, 164.71f)
                    lineTo(0f, 166.71f)
                    curveTo(2.75f, 166.7f, 5.14f, 165.16f, 6.82f, 162.85f)
                    curveTo(8.49f, 160.55f, 9.5f, 157.42f, 9.5f, 154f)
                    lineTo(7.5f, 154f)
                    close()
                    moveTo(17f, 164.71f)
                    curveTo(15.06f, 164.7f, 13.2f, 163.61f, 11.8f, 161.68f)
                    curveTo(10.4f, 159.75f, 9.5f, 157.04f, 9.5f, 154f)
                    lineTo(7.5f, 154f)
                    curveTo(7.5f, 157.42f, 8.51f, 160.55f, 10.18f, 162.85f)
                    curveTo(11.86f, 165.16f, 14.25f, 166.7f, 17f, 166.71f)
                    lineTo(17f, 164.71f)
                    close()
                    moveTo(9.5f, 177.41f)
                    curveTo(9.5f, 174.37f, 10.4f, 171.66f, 11.8f, 169.73f)
                    curveTo(13.2f, 167.8f, 15.06f, 166.71f, 17f, 166.71f)
                    lineTo(17f, 164.71f)
                    curveTo(14.25f, 164.71f, 11.86f, 166.25f, 10.18f, 168.55f)
                    curveTo(8.51f, 170.86f, 7.5f, 173.99f, 7.5f, 177.41f)
                    lineTo(9.5f, 177.41f)
                    close()
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 3f,
                    strokeLineCap = StrokeCap.Round
                ) {
                    moveTo(60.5f, -9.5f)
                    lineTo(60.5f, 282.5f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 3f,
                    strokeLineCap = StrokeCap.Round
                ) {
                    moveTo(110.5f, -9.5f)
                    lineTo(110.5f, 185.5f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 3f,
                    strokeLineCap = StrokeCap.Round
                ) {
                    moveTo(256.5f, 1.5f)
                    lineTo(256.5f, 363.5f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 3f,
                    strokeLineCap = StrokeCap.Round
                ) {
                    moveTo(362.5f, 1.5f)
                    lineTo(362.5f, 152.5f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 3f,
                    strokeLineCap = StrokeCap.Round
                ) {
                    moveTo(456.5f, -9.5f)
                    lineTo(456.5f, 269.5f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 3f,
                    strokeLineCap = StrokeCap.Round
                ) {
                    moveTo(515.5f, -16.5f)
                    lineTo(515.5f, 356.5f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 3f,
                    strokeLineCap = StrokeCap.Round
                ) {
                    moveTo(535.5f, -16.5f)
                    lineTo(535.5f, 180.5f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 3f,
                    strokeLineCap = StrokeCap.Round
                ) {
                    moveTo(631.5f, -16.5f)
                    lineTo(631.5f, 180.5f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 3f,
                    strokeLineCap = StrokeCap.Round
                ) {
                    moveTo(212.5f, -4.5f)
                    lineTo(212.5f, 215.5f)
                }
                path(
                    stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 3f,
                    strokeLineCap = StrokeCap.Round
                ) {
                    moveTo(312.5f, 1.5f)
                    lineTo(312.5f, 422.5f)
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(61.25f, 346f)
                    curveTo(61.24f, 331.39f, 52.63f, 319.54f, 42f, 319.5f)
                    curveTo(52.63f, 319.47f, 61.24f, 307.62f, 61.25f, 293f)
                    curveTo(61.26f, 307.62f, 69.88f, 319.47f, 80.5f, 319.5f)
                    curveTo(69.88f, 319.54f, 61.27f, 331.39f, 61.25f, 346f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(61.25f, 346f)
                    curveTo(61.24f, 331.39f, 52.63f, 319.54f, 42f, 319.5f)
                    curveTo(52.63f, 319.47f, 61.24f, 307.62f, 61.25f, 293f)
                    curveTo(61.26f, 307.62f, 69.88f, 319.47f, 80.5f, 319.5f)
                    curveTo(69.88f, 319.54f, 61.27f, 331.39f, 61.25f, 346f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(42f, 319.5f)
                    lineTo(42f, 319f)
                    lineTo(42f, 320f)
                    lineTo(42f, 319.5f)
                    close()
                    moveTo(61.25f, 346f)
                    lineTo(60.75f, 346f)
                    horizontalLineTo(61.75f)
                    lineTo(61.25f, 346f)
                    close()
                    moveTo(61.25f, 293f)
                    lineTo(61.75f, 293f)
                    lineTo(60.75f, 293f)
                    lineTo(61.25f, 293f)
                    close()
                    moveTo(80.5f, 319.5f)
                    lineTo(80.51f, 320f)
                    lineTo(80.51f, 319f)
                    lineTo(80.5f, 319.5f)
                    close()
                    moveTo(42f, 320f)
                    curveTo(47.11f, 320.02f, 51.79f, 322.88f, 55.2f, 327.58f)
                    curveTo(58.62f, 332.28f, 60.74f, 338.79f, 60.75f, 346f)
                    lineTo(61.75f, 346f)
                    curveTo(61.74f, 338.6f, 59.56f, 331.88f, 56.01f, 326.99f)
                    curveTo(52.46f, 322.1f, 47.51f, 319.02f, 42f, 319f)
                    lineTo(42f, 320f)
                    close()
                    moveTo(60.75f, 293f)
                    curveTo(60.75f, 300.21f, 58.62f, 306.73f, 55.2f, 311.43f)
                    curveTo(51.79f, 316.13f, 47.11f, 318.99f, 42f, 319f)
                    lineTo(42f, 320f)
                    curveTo(47.51f, 319.98f, 52.46f, 316.9f, 56.01f, 312.02f)
                    curveTo(59.56f, 307.13f, 61.75f, 300.4f, 61.75f, 293f)
                    lineTo(60.75f, 293f)
                    close()
                    moveTo(80.51f, 319f)
                    curveTo(75.39f, 318.99f, 70.72f, 316.13f, 67.3f, 311.43f)
                    curveTo(63.89f, 306.73f, 61.76f, 300.21f, 61.75f, 293f)
                    lineTo(60.75f, 293f)
                    curveTo(60.76f, 300.4f, 62.94f, 307.13f, 66.49f, 312.02f)
                    curveTo(70.04f, 316.9f, 74.99f, 319.99f, 80.5f, 320f)
                    lineTo(80.51f, 319f)
                    close()
                    moveTo(61.75f, 346f)
                    curveTo(61.76f, 338.79f, 63.89f, 332.28f, 67.3f, 327.58f)
                    curveTo(70.72f, 322.88f, 75.39f, 320.02f, 80.51f, 320f)
                    lineTo(80.5f, 319f)
                    curveTo(74.99f, 319.02f, 70.04f, 322.1f, 66.49f, 326.99f)
                    curveTo(62.94f, 331.88f, 60.76f, 338.6f, 60.75f, 346f)
                    lineTo(61.75f, 346f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(110.75f, 240.12f)
                    curveTo(110.74f, 227.4f, 103.25f, 217.09f, 94f, 217.06f)
                    curveTo(103.25f, 217.03f, 110.74f, 206.72f, 110.75f, 194f)
                    curveTo(110.76f, 206.72f, 118.25f, 217.02f, 127.5f, 217.06f)
                    curveTo(118.25f, 217.09f, 110.76f, 227.4f, 110.75f, 240.12f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(110.75f, 240.12f)
                    curveTo(110.74f, 227.4f, 103.25f, 217.09f, 94f, 217.06f)
                    curveTo(103.25f, 217.03f, 110.74f, 206.72f, 110.75f, 194f)
                    curveTo(110.76f, 206.72f, 118.25f, 217.02f, 127.5f, 217.06f)
                    curveTo(118.25f, 217.09f, 110.76f, 227.4f, 110.75f, 240.12f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(94f, 217.06f)
                    lineTo(94f, 216.56f)
                    lineTo(94f, 217.56f)
                    lineTo(94f, 217.06f)
                    close()
                    moveTo(110.75f, 240.12f)
                    lineTo(110.25f, 240.12f)
                    horizontalLineTo(111.25f)
                    lineTo(110.75f, 240.12f)
                    close()
                    moveTo(110.75f, 194f)
                    lineTo(111.25f, 194f)
                    lineTo(110.25f, 194f)
                    lineTo(110.75f, 194f)
                    close()
                    moveTo(127.5f, 217.06f)
                    lineTo(127.5f, 217.56f)
                    lineTo(127.5f, 216.56f)
                    lineTo(127.5f, 217.06f)
                    close()
                    moveTo(94f, 217.56f)
                    curveTo(98.42f, 217.58f, 102.47f, 220.05f, 105.43f, 224.13f)
                    curveTo(108.39f, 228.2f, 110.24f, 233.85f, 110.25f, 240.12f)
                    lineTo(111.25f, 240.12f)
                    curveTo(111.24f, 233.66f, 109.34f, 227.8f, 106.24f, 223.54f)
                    curveTo(103.14f, 219.27f, 98.82f, 216.58f, 94f, 216.56f)
                    lineTo(94f, 217.56f)
                    close()
                    moveTo(110.25f, 194f)
                    curveTo(110.24f, 200.26f, 108.39f, 205.92f, 105.43f, 209.99f)
                    curveTo(102.47f, 214.07f, 98.42f, 216.54f, 94f, 216.56f)
                    lineTo(94f, 217.56f)
                    curveTo(98.82f, 217.54f, 103.14f, 214.85f, 106.24f, 210.58f)
                    curveTo(109.34f, 206.32f, 111.24f, 200.45f, 111.25f, 194f)
                    lineTo(110.25f, 194f)
                    close()
                    moveTo(127.5f, 216.56f)
                    curveTo(123.07f, 216.54f, 119.03f, 214.07f, 116.06f, 209.99f)
                    curveTo(113.1f, 205.91f, 111.25f, 200.26f, 111.25f, 194f)
                    lineTo(110.25f, 194f)
                    curveTo(110.25f, 200.45f, 112.16f, 206.32f, 115.25f, 210.58f)
                    curveTo(118.35f, 214.84f, 122.67f, 217.54f, 127.49f, 217.56f)
                    lineTo(127.5f, 216.56f)
                    close()
                    moveTo(111.25f, 240.12f)
                    curveTo(111.25f, 233.85f, 113.1f, 228.2f, 116.07f, 224.13f)
                    curveTo(119.03f, 220.05f, 123.07f, 217.58f, 127.5f, 217.56f)
                    lineTo(127.49f, 216.56f)
                    curveTo(122.67f, 216.58f, 118.35f, 219.27f, 115.26f, 223.54f)
                    curveTo(112.16f, 227.8f, 110.25f, 233.66f, 110.25f, 240.12f)
                    lineTo(111.25f, 240.12f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(212.75f, 269.12f)
                    curveTo(212.74f, 256.4f, 205.25f, 246.09f, 196f, 246.06f)
                    curveTo(205.25f, 246.03f, 212.74f, 235.72f, 212.75f, 223f)
                    curveTo(212.76f, 235.72f, 220.25f, 246.02f, 229.49f, 246.06f)
                    curveTo(220.25f, 246.09f, 212.76f, 256.4f, 212.75f, 269.12f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(212.75f, 269.12f)
                    curveTo(212.74f, 256.4f, 205.25f, 246.09f, 196f, 246.06f)
                    curveTo(205.25f, 246.03f, 212.74f, 235.72f, 212.75f, 223f)
                    curveTo(212.76f, 235.72f, 220.25f, 246.02f, 229.49f, 246.06f)
                    curveTo(220.25f, 246.09f, 212.76f, 256.4f, 212.75f, 269.12f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(196f, 246.06f)
                    lineTo(196f, 245.56f)
                    lineTo(196f, 246.56f)
                    lineTo(196f, 246.06f)
                    close()
                    moveTo(212.75f, 269.12f)
                    lineTo(212.25f, 269.12f)
                    horizontalLineTo(213.25f)
                    lineTo(212.75f, 269.12f)
                    close()
                    moveTo(212.75f, 223f)
                    lineTo(213.25f, 223f)
                    lineTo(212.25f, 223f)
                    lineTo(212.75f, 223f)
                    close()
                    moveTo(229.49f, 246.06f)
                    lineTo(229.5f, 246.56f)
                    lineTo(229.5f, 245.56f)
                    lineTo(229.49f, 246.06f)
                    close()
                    moveTo(196f, 246.56f)
                    curveTo(200.42f, 246.58f, 204.47f, 249.05f, 207.43f, 253.13f)
                    curveTo(210.39f, 257.2f, 212.24f, 262.85f, 212.25f, 269.12f)
                    lineTo(213.25f, 269.12f)
                    curveTo(213.24f, 262.66f, 211.34f, 256.8f, 208.24f, 252.54f)
                    curveTo(205.14f, 248.27f, 200.82f, 245.58f, 196f, 245.56f)
                    lineTo(196f, 246.56f)
                    close()
                    moveTo(212.25f, 223f)
                    curveTo(212.24f, 229.26f, 210.39f, 234.92f, 207.43f, 238.99f)
                    curveTo(204.47f, 243.07f, 200.42f, 245.54f, 196f, 245.56f)
                    lineTo(196f, 246.56f)
                    curveTo(200.82f, 246.54f, 205.14f, 243.85f, 208.24f, 239.58f)
                    curveTo(211.34f, 235.32f, 213.24f, 229.45f, 213.25f, 223f)
                    lineTo(212.25f, 223f)
                    close()
                    moveTo(229.5f, 245.56f)
                    curveTo(225.07f, 245.54f, 221.02f, 243.07f, 218.06f, 238.99f)
                    curveTo(215.1f, 234.91f, 213.25f, 229.26f, 213.25f, 223f)
                    lineTo(212.25f, 223f)
                    curveTo(212.26f, 229.45f, 214.16f, 235.32f, 217.26f, 239.58f)
                    curveTo(220.35f, 243.84f, 224.67f, 246.54f, 229.49f, 246.56f)
                    lineTo(229.5f, 245.56f)
                    close()
                    moveTo(213.25f, 269.12f)
                    curveTo(213.26f, 262.85f, 215.1f, 257.2f, 218.07f, 253.13f)
                    curveTo(221.03f, 249.05f, 225.07f, 246.58f, 229.5f, 246.56f)
                    lineTo(229.49f, 245.56f)
                    curveTo(224.67f, 245.58f, 220.35f, 248.27f, 217.26f, 252.54f)
                    curveTo(214.16f, 256.8f, 212.26f, 262.66f, 212.25f, 269.12f)
                    lineTo(213.25f, 269.12f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(535.75f, 184f)
                    curveTo(535.74f, 196.72f, 528.25f, 207.03f, 519f, 207.06f)
                    curveTo(528.25f, 207.09f, 535.73f, 217.4f, 535.75f, 230.12f)
                    curveTo(535.76f, 217.4f, 543.25f, 207.09f, 552.49f, 207.06f)
                    curveTo(543.25f, 207.02f, 535.76f, 196.72f, 535.75f, 184f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(535.75f, 184f)
                    curveTo(535.74f, 196.72f, 528.25f, 207.03f, 519f, 207.06f)
                    curveTo(528.25f, 207.09f, 535.73f, 217.4f, 535.75f, 230.12f)
                    curveTo(535.76f, 217.4f, 543.25f, 207.09f, 552.49f, 207.06f)
                    curveTo(543.25f, 207.02f, 535.76f, 196.72f, 535.75f, 184f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(519f, 207.06f)
                    lineTo(519f, 206.56f)
                    lineTo(519f, 207.56f)
                    lineTo(519f, 207.06f)
                    close()
                    moveTo(535.75f, 184f)
                    lineTo(536.25f, 184f)
                    lineTo(535.25f, 184f)
                    lineTo(535.75f, 184f)
                    close()
                    moveTo(535.75f, 230.12f)
                    lineTo(535.25f, 230.12f)
                    horizontalLineTo(536.25f)
                    lineTo(535.75f, 230.12f)
                    close()
                    moveTo(552.49f, 207.06f)
                    lineTo(552.5f, 207.56f)
                    lineTo(552.5f, 206.56f)
                    lineTo(552.49f, 207.06f)
                    close()
                    moveTo(519f, 207.56f)
                    curveTo(523.82f, 207.54f, 528.14f, 204.85f, 531.24f, 200.58f)
                    curveTo(534.34f, 196.32f, 536.24f, 190.45f, 536.25f, 184f)
                    lineTo(535.25f, 184f)
                    curveTo(535.24f, 190.26f, 533.39f, 195.92f, 530.43f, 199.99f)
                    curveTo(527.47f, 204.07f, 523.42f, 206.54f, 519f, 206.56f)
                    lineTo(519f, 207.56f)
                    close()
                    moveTo(536.25f, 230.12f)
                    curveTo(536.24f, 223.66f, 534.34f, 217.8f, 531.24f, 213.54f)
                    curveTo(528.14f, 209.27f, 523.82f, 206.58f, 519f, 206.56f)
                    lineTo(519f, 207.56f)
                    curveTo(523.42f, 207.58f, 527.47f, 210.05f, 530.43f, 214.13f)
                    curveTo(533.39f, 218.2f, 535.24f, 223.85f, 535.25f, 230.12f)
                    lineTo(536.25f, 230.12f)
                    close()
                    moveTo(536.25f, 230.12f)
                    curveTo(536.26f, 223.85f, 538.1f, 218.2f, 541.07f, 214.13f)
                    curveTo(544.03f, 210.05f, 548.07f, 207.58f, 552.5f, 207.56f)
                    lineTo(552.49f, 206.56f)
                    curveTo(547.67f, 206.58f, 543.35f, 209.27f, 540.26f, 213.54f)
                    curveTo(537.16f, 217.8f, 535.26f, 223.66f, 535.25f, 230.12f)
                    lineTo(536.25f, 230.12f)
                    close()
                    moveTo(535.25f, 184f)
                    curveTo(535.26f, 190.45f, 537.16f, 196.32f, 540.26f, 200.58f)
                    curveTo(543.35f, 204.84f, 547.67f, 207.54f, 552.49f, 207.56f)
                    lineTo(552.5f, 206.56f)
                    curveTo(548.07f, 206.54f, 544.03f, 204.07f, 541.06f, 199.99f)
                    curveTo(538.1f, 195.91f, 536.25f, 190.26f, 536.25f, 184f)
                    lineTo(535.25f, 184f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(257.42f, 371f)
                    curveTo(257.41f, 387.27f, 247.83f, 400.46f, 236f, 400.5f)
                    curveTo(247.83f, 400.55f, 257.41f, 413.73f, 257.42f, 429.99f)
                    curveTo(257.44f, 413.73f, 267.02f, 400.55f, 278.85f, 400.5f)
                    curveTo(267.02f, 400.46f, 257.44f, 387.27f, 257.42f, 371f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(257.42f, 371f)
                    curveTo(257.41f, 387.27f, 247.83f, 400.46f, 236f, 400.5f)
                    curveTo(247.83f, 400.55f, 257.41f, 413.73f, 257.42f, 429.99f)
                    curveTo(257.44f, 413.73f, 267.02f, 400.55f, 278.85f, 400.5f)
                    curveTo(267.02f, 400.46f, 257.44f, 387.27f, 257.42f, 371f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(236f, 400.5f)
                    lineTo(236f, 400f)
                    lineTo(236f, 401f)
                    lineTo(236f, 400.5f)
                    close()
                    moveTo(257.42f, 371f)
                    lineTo(257.92f, 371f)
                    lineTo(256.92f, 371f)
                    lineTo(257.42f, 371f)
                    close()
                    moveTo(257.42f, 429.99f)
                    lineTo(256.92f, 429.99f)
                    horizontalLineTo(257.92f)
                    lineTo(257.42f, 429.99f)
                    close()
                    moveTo(278.85f, 400.5f)
                    lineTo(278.85f, 401f)
                    lineTo(278.85f, 400f)
                    lineTo(278.85f, 400.5f)
                    close()
                    moveTo(236f, 401f)
                    curveTo(242.12f, 400.98f, 247.6f, 397.56f, 251.55f, 392.13f)
                    curveTo(255.49f, 386.7f, 257.92f, 379.23f, 257.92f, 371f)
                    lineTo(256.92f, 371f)
                    curveTo(256.92f, 379.04f, 254.54f, 386.3f, 250.74f, 391.54f)
                    curveTo(246.93f, 396.78f, 241.71f, 399.98f, 236f, 400f)
                    lineTo(236f, 401f)
                    close()
                    moveTo(257.92f, 429.99f)
                    curveTo(257.92f, 421.77f, 255.49f, 414.3f, 251.54f, 408.87f)
                    curveTo(247.6f, 403.44f, 242.11f, 400.02f, 236f, 400f)
                    lineTo(236f, 401f)
                    curveTo(241.71f, 401.02f, 246.93f, 404.22f, 250.74f, 409.46f)
                    curveTo(254.54f, 414.7f, 256.92f, 421.96f, 256.92f, 429.99f)
                    lineTo(257.92f, 429.99f)
                    close()
                    moveTo(257.92f, 429.99f)
                    curveTo(257.93f, 421.96f, 260.31f, 414.7f, 264.11f, 409.46f)
                    curveTo(267.92f, 404.22f, 273.14f, 401.02f, 278.85f, 401f)
                    lineTo(278.85f, 400f)
                    curveTo(272.74f, 400.02f, 267.25f, 403.44f, 263.3f, 408.87f)
                    curveTo(259.36f, 414.3f, 256.93f, 421.77f, 256.92f, 429.99f)
                    lineTo(257.92f, 429.99f)
                    close()
                    moveTo(256.92f, 371f)
                    curveTo(256.93f, 379.23f, 259.36f, 386.7f, 263.3f, 392.13f)
                    curveTo(267.25f, 397.56f, 272.73f, 400.98f, 278.85f, 401f)
                    lineTo(278.85f, 400f)
                    curveTo(273.14f, 399.98f, 267.92f, 396.78f, 264.11f, 391.54f)
                    curveTo(260.3f, 386.3f, 257.93f, 379.04f, 257.92f, 371f)
                    lineTo(256.92f, 371f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(516.42f, 364f)
                    curveTo(516.41f, 380.27f, 506.83f, 393.46f, 495f, 393.5f)
                    curveTo(506.83f, 393.55f, 516.41f, 406.73f, 516.42f, 422.99f)
                    curveTo(516.44f, 406.73f, 526.02f, 393.55f, 537.85f, 393.5f)
                    curveTo(526.02f, 393.46f, 516.44f, 380.27f, 516.42f, 364f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(516.42f, 364f)
                    curveTo(516.41f, 380.27f, 506.83f, 393.46f, 495f, 393.5f)
                    curveTo(506.83f, 393.55f, 516.41f, 406.73f, 516.42f, 422.99f)
                    curveTo(516.44f, 406.73f, 526.02f, 393.55f, 537.85f, 393.5f)
                    curveTo(526.02f, 393.46f, 516.44f, 380.27f, 516.42f, 364f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(495f, 393.5f)
                    lineTo(495f, 393f)
                    lineTo(495f, 394f)
                    lineTo(495f, 393.5f)
                    close()
                    moveTo(516.42f, 364f)
                    lineTo(516.92f, 364f)
                    lineTo(515.92f, 364f)
                    lineTo(516.42f, 364f)
                    close()
                    moveTo(516.42f, 422.99f)
                    lineTo(515.92f, 422.99f)
                    horizontalLineTo(516.92f)
                    lineTo(516.42f, 422.99f)
                    close()
                    moveTo(537.85f, 393.5f)
                    lineTo(537.85f, 394f)
                    lineTo(537.85f, 393f)
                    lineTo(537.85f, 393.5f)
                    close()
                    moveTo(495f, 394f)
                    curveTo(501.11f, 393.98f, 506.6f, 390.56f, 510.55f, 385.13f)
                    curveTo(514.49f, 379.7f, 516.92f, 372.23f, 516.92f, 364f)
                    lineTo(515.92f, 364f)
                    curveTo(515.92f, 372.04f, 513.54f, 379.3f, 509.74f, 384.54f)
                    curveTo(505.93f, 389.78f, 500.71f, 392.98f, 495f, 393f)
                    lineTo(495f, 394f)
                    close()
                    moveTo(516.92f, 422.99f)
                    curveTo(516.91f, 414.77f, 514.49f, 407.3f, 510.55f, 401.87f)
                    curveTo(506.6f, 396.44f, 501.11f, 393.02f, 495f, 393f)
                    lineTo(495f, 394f)
                    curveTo(500.71f, 394.02f, 505.93f, 397.22f, 509.74f, 402.46f)
                    curveTo(513.54f, 407.7f, 515.92f, 414.96f, 515.92f, 422.99f)
                    lineTo(516.92f, 422.99f)
                    close()
                    moveTo(516.92f, 422.99f)
                    curveTo(516.93f, 414.96f, 519.31f, 407.7f, 523.11f, 402.46f)
                    curveTo(526.92f, 397.22f, 532.14f, 394.02f, 537.85f, 394f)
                    lineTo(537.85f, 393f)
                    curveTo(531.74f, 393.02f, 526.25f, 396.44f, 522.3f, 401.87f)
                    curveTo(518.36f, 407.3f, 515.93f, 414.77f, 515.92f, 422.99f)
                    lineTo(516.92f, 422.99f)
                    close()
                    moveTo(515.92f, 364f)
                    curveTo(515.93f, 372.23f, 518.36f, 379.7f, 522.3f, 385.13f)
                    curveTo(526.25f, 390.56f, 531.73f, 393.98f, 537.85f, 394f)
                    lineTo(537.85f, 393f)
                    curveTo(532.14f, 392.98f, 526.92f, 389.78f, 523.11f, 384.54f)
                    curveTo(519.3f, 379.3f, 516.93f, 372.04f, 516.92f, 364f)
                    lineTo(515.92f, 364f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(632.42f, 187f)
                    curveTo(632.41f, 203.27f, 622.83f, 216.46f, 611f, 216.5f)
                    curveTo(622.83f, 216.55f, 632.41f, 229.73f, 632.42f, 245.99f)
                    curveTo(632.44f, 229.73f, 642.02f, 216.55f, 653.85f, 216.5f)
                    curveTo(642.02f, 216.46f, 632.44f, 203.27f, 632.42f, 187f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(632.42f, 187f)
                    curveTo(632.41f, 203.27f, 622.83f, 216.46f, 611f, 216.5f)
                    curveTo(622.83f, 216.55f, 632.41f, 229.73f, 632.42f, 245.99f)
                    curveTo(632.44f, 229.73f, 642.02f, 216.55f, 653.85f, 216.5f)
                    curveTo(642.02f, 216.46f, 632.44f, 203.27f, 632.42f, 187f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(611f, 216.5f)
                    lineTo(611f, 216f)
                    lineTo(611f, 217f)
                    lineTo(611f, 216.5f)
                    close()
                    moveTo(632.42f, 187f)
                    lineTo(632.92f, 187f)
                    lineTo(631.92f, 187f)
                    lineTo(632.42f, 187f)
                    close()
                    moveTo(632.42f, 245.99f)
                    lineTo(631.92f, 245.99f)
                    horizontalLineTo(632.92f)
                    lineTo(632.42f, 245.99f)
                    close()
                    moveTo(653.85f, 216.5f)
                    lineTo(653.85f, 217f)
                    lineTo(653.85f, 216f)
                    lineTo(653.85f, 216.5f)
                    close()
                    moveTo(611f, 217f)
                    curveTo(617.11f, 216.98f, 622.6f, 213.56f, 626.55f, 208.13f)
                    curveTo(630.49f, 202.7f, 632.92f, 195.23f, 632.92f, 187f)
                    lineTo(631.92f, 187f)
                    curveTo(631.92f, 195.04f, 629.54f, 202.3f, 625.74f, 207.54f)
                    curveTo(621.93f, 212.78f, 616.71f, 215.98f, 611f, 216f)
                    lineTo(611f, 217f)
                    close()
                    moveTo(632.92f, 245.99f)
                    curveTo(632.91f, 237.77f, 630.49f, 230.3f, 626.54f, 224.87f)
                    curveTo(622.6f, 219.44f, 617.11f, 216.02f, 611f, 216f)
                    lineTo(611f, 217f)
                    curveTo(616.71f, 217.02f, 621.93f, 220.22f, 625.74f, 225.46f)
                    curveTo(629.54f, 230.7f, 631.92f, 237.96f, 631.92f, 245.99f)
                    lineTo(632.92f, 245.99f)
                    close()
                    moveTo(632.92f, 245.99f)
                    curveTo(632.93f, 237.96f, 635.31f, 230.7f, 639.11f, 225.46f)
                    curveTo(642.92f, 220.22f, 648.14f, 217.02f, 653.85f, 217f)
                    lineTo(653.85f, 216f)
                    curveTo(647.74f, 216.02f, 642.25f, 219.44f, 638.3f, 224.87f)
                    curveTo(634.36f, 230.3f, 631.93f, 237.77f, 631.92f, 245.99f)
                    lineTo(632.92f, 245.99f)
                    close()
                    moveTo(631.92f, 187f)
                    curveTo(631.93f, 195.23f, 634.36f, 202.7f, 638.3f, 208.13f)
                    curveTo(642.25f, 213.56f, 647.73f, 216.98f, 653.85f, 217f)
                    lineTo(653.85f, 216f)
                    curveTo(648.14f, 215.98f, 642.92f, 212.78f, 639.11f, 207.54f)
                    curveTo(635.3f, 202.3f, 632.93f, 195.04f, 632.92f, 187f)
                    lineTo(631.92f, 187f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(313.42f, 437f)
                    curveTo(313.41f, 453.27f, 303.83f, 466.46f, 292f, 466.5f)
                    curveTo(303.83f, 466.55f, 313.41f, 479.73f, 313.42f, 495.99f)
                    curveTo(313.44f, 479.73f, 323.02f, 466.55f, 334.85f, 466.5f)
                    curveTo(323.02f, 466.46f, 313.44f, 453.27f, 313.42f, 437f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(313.42f, 437f)
                    curveTo(313.41f, 453.27f, 303.83f, 466.46f, 292f, 466.5f)
                    curveTo(303.83f, 466.55f, 313.41f, 479.73f, 313.42f, 495.99f)
                    curveTo(313.44f, 479.73f, 323.02f, 466.55f, 334.85f, 466.5f)
                    curveTo(323.02f, 466.46f, 313.44f, 453.27f, 313.42f, 437f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(292f, 466.5f)
                    lineTo(292f, 466f)
                    lineTo(292f, 467f)
                    lineTo(292f, 466.5f)
                    close()
                    moveTo(313.42f, 437f)
                    lineTo(313.92f, 437f)
                    lineTo(312.92f, 437f)
                    lineTo(313.42f, 437f)
                    close()
                    moveTo(313.42f, 495.99f)
                    lineTo(312.92f, 495.99f)
                    horizontalLineTo(313.92f)
                    lineTo(313.42f, 495.99f)
                    close()
                    moveTo(334.85f, 466.5f)
                    lineTo(334.85f, 467f)
                    lineTo(334.85f, 466f)
                    lineTo(334.85f, 466.5f)
                    close()
                    moveTo(292f, 467f)
                    curveTo(298.11f, 466.98f, 303.6f, 463.56f, 307.55f, 458.13f)
                    curveTo(311.49f, 452.7f, 313.92f, 445.23f, 313.92f, 437f)
                    lineTo(312.92f, 437f)
                    curveTo(312.92f, 445.04f, 310.55f, 452.3f, 306.74f, 457.54f)
                    curveTo(302.93f, 462.78f, 297.71f, 465.98f, 292f, 466f)
                    lineTo(292f, 467f)
                    close()
                    moveTo(313.92f, 495.99f)
                    curveTo(313.92f, 487.77f, 311.49f, 480.3f, 307.55f, 474.87f)
                    curveTo(303.6f, 469.44f, 298.11f, 466.02f, 292f, 466f)
                    lineTo(292f, 467f)
                    curveTo(297.71f, 467.02f, 302.93f, 470.22f, 306.74f, 475.46f)
                    curveTo(310.54f, 480.7f, 312.92f, 487.96f, 312.92f, 495.99f)
                    lineTo(313.92f, 495.99f)
                    close()
                    moveTo(313.92f, 495.99f)
                    curveTo(313.93f, 487.96f, 316.31f, 480.7f, 320.11f, 475.46f)
                    curveTo(323.92f, 470.22f, 329.14f, 467.02f, 334.85f, 467f)
                    lineTo(334.85f, 466f)
                    curveTo(328.74f, 466.02f, 323.25f, 469.44f, 319.3f, 474.87f)
                    curveTo(315.36f, 480.3f, 312.93f, 487.77f, 312.92f, 495.99f)
                    lineTo(313.92f, 495.99f)
                    close()
                    moveTo(312.92f, 437f)
                    curveTo(312.93f, 445.23f, 315.36f, 452.7f, 319.3f, 458.13f)
                    curveTo(323.25f, 463.56f, 328.73f, 466.98f, 334.85f, 467f)
                    lineTo(334.85f, 466f)
                    curveTo(329.14f, 465.98f, 323.92f, 462.78f, 320.11f, 457.54f)
                    curveTo(316.3f, 452.3f, 313.93f, 445.04f, 313.92f, 437f)
                    lineTo(312.92f, 437f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(363f, 160f)
                    curveTo(362.98f, 172.91f, 355.38f, 183.37f, 346f, 183.4f)
                    curveTo(355.38f, 183.44f, 362.98f, 193.9f, 363f, 206.81f)
                    curveTo(363.01f, 193.9f, 370.61f, 183.44f, 380f, 183.4f)
                    curveTo(370.61f, 183.37f, 363.01f, 172.91f, 363f, 160f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(363f, 160f)
                    curveTo(362.98f, 172.91f, 355.38f, 183.37f, 346f, 183.4f)
                    curveTo(355.38f, 183.44f, 362.98f, 193.9f, 363f, 206.81f)
                    curveTo(363.01f, 193.9f, 370.61f, 183.44f, 380f, 183.4f)
                    curveTo(370.61f, 183.37f, 363.01f, 172.91f, 363f, 160f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(346f, 183.4f)
                    lineTo(346f, 182.9f)
                    lineTo(346f, 183.9f)
                    lineTo(346f, 183.4f)
                    close()
                    moveTo(363f, 160f)
                    lineTo(363.5f, 160f)
                    lineTo(362.5f, 160f)
                    lineTo(363f, 160f)
                    close()
                    moveTo(363f, 206.81f)
                    lineTo(362.5f, 206.81f)
                    horizontalLineTo(363.5f)
                    lineTo(363f, 206.81f)
                    close()
                    moveTo(380f, 183.4f)
                    lineTo(380f, 183.9f)
                    lineTo(380f, 182.9f)
                    lineTo(380f, 183.4f)
                    close()
                    moveTo(346f, 183.9f)
                    curveTo(350.89f, 183.88f, 355.27f, 181.15f, 358.42f, 176.82f)
                    curveTo(361.56f, 172.49f, 363.49f, 166.55f, 363.5f, 160f)
                    lineTo(362.5f, 160f)
                    curveTo(362.49f, 166.36f, 360.61f, 172.1f, 357.61f, 176.23f)
                    curveTo(354.6f, 180.37f, 350.49f, 182.89f, 346f, 182.9f)
                    lineTo(346f, 183.9f)
                    close()
                    moveTo(363.5f, 206.81f)
                    curveTo(363.49f, 200.26f, 361.56f, 194.31f, 358.42f, 189.99f)
                    curveTo(355.27f, 185.66f, 350.89f, 182.92f, 346f, 182.9f)
                    lineTo(346f, 183.9f)
                    curveTo(350.49f, 183.92f, 354.6f, 186.43f, 357.61f, 190.57f)
                    curveTo(360.61f, 194.71f, 362.49f, 200.45f, 362.5f, 206.81f)
                    lineTo(363.5f, 206.81f)
                    close()
                    moveTo(363.5f, 206.81f)
                    curveTo(363.51f, 200.45f, 365.38f, 194.71f, 368.39f, 190.57f)
                    curveTo(371.39f, 186.43f, 375.51f, 183.92f, 380f, 183.9f)
                    lineTo(379.99f, 182.9f)
                    curveTo(375.1f, 182.92f, 370.72f, 185.66f, 367.58f, 189.99f)
                    curveTo(364.44f, 194.31f, 362.51f, 200.26f, 362.5f, 206.81f)
                    lineTo(363.5f, 206.81f)
                    close()
                    moveTo(362.5f, 160f)
                    curveTo(362.51f, 166.55f, 364.44f, 172.49f, 367.58f, 176.82f)
                    curveTo(370.72f, 181.15f, 375.1f, 183.88f, 379.99f, 183.9f)
                    lineTo(380f, 182.9f)
                    curveTo(375.51f, 182.89f, 371.39f, 180.37f, 368.39f, 176.23f)
                    curveTo(365.38f, 172.1f, 363.51f, 166.36f, 363.5f, 160f)
                    lineTo(362.5f, 160f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(457f, 278f)
                    curveTo(456.98f, 290.91f, 449.38f, 301.37f, 440f, 301.4f)
                    curveTo(449.38f, 301.44f, 456.98f, 311.9f, 457f, 324.81f)
                    curveTo(457.01f, 311.9f, 464.61f, 301.44f, 474f, 301.4f)
                    curveTo(464.61f, 301.37f, 457.01f, 290.91f, 457f, 278f)
                    close()
                }
            }
            group(
                clipPathData = PathData {
                    moveTo(457f, 278f)
                    curveTo(456.98f, 290.91f, 449.38f, 301.37f, 440f, 301.4f)
                    curveTo(449.38f, 301.44f, 456.98f, 311.9f, 457f, 324.81f)
                    curveTo(457.01f, 311.9f, 464.61f, 301.44f, 474f, 301.4f)
                    curveTo(464.61f, 301.37f, 457.01f, 290.91f, 457f, 278f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color(0xFF000000))) {
                    moveTo(440f, 301.4f)
                    lineTo(440f, 300.9f)
                    lineTo(440f, 301.9f)
                    lineTo(440f, 301.4f)
                    close()
                    moveTo(457f, 278f)
                    lineTo(457.5f, 278f)
                    lineTo(456.5f, 278f)
                    lineTo(457f, 278f)
                    close()
                    moveTo(457f, 324.81f)
                    lineTo(456.5f, 324.81f)
                    horizontalLineTo(457.5f)
                    lineTo(457f, 324.81f)
                    close()
                    moveTo(474f, 301.4f)
                    lineTo(474f, 301.9f)
                    lineTo(474f, 300.9f)
                    lineTo(474f, 301.4f)
                    close()
                    moveTo(440f, 301.9f)
                    curveTo(444.89f, 301.89f, 449.27f, 299.15f, 452.42f, 294.82f)
                    curveTo(455.56f, 290.49f, 457.49f, 284.55f, 457.5f, 278f)
                    lineTo(456.5f, 278f)
                    curveTo(456.49f, 284.36f, 454.61f, 290.1f, 451.61f, 294.23f)
                    curveTo(448.6f, 298.37f, 444.49f, 300.89f, 440f, 300.9f)
                    lineTo(440f, 301.9f)
                    close()
                    moveTo(457.5f, 324.81f)
                    curveTo(457.49f, 318.26f, 455.56f, 312.31f, 452.42f, 307.99f)
                    curveTo(449.27f, 303.66f, 444.89f, 300.92f, 440f, 300.9f)
                    lineTo(440f, 301.9f)
                    curveTo(444.49f, 301.92f, 448.6f, 304.43f, 451.61f, 308.57f)
                    curveTo(454.61f, 312.71f, 456.49f, 318.45f, 456.5f, 324.81f)
                    lineTo(457.5f, 324.81f)
                    close()
                    moveTo(457.5f, 324.81f)
                    curveTo(457.51f, 318.45f, 459.38f, 312.71f, 462.39f, 308.57f)
                    curveTo(465.39f, 304.43f, 469.51f, 301.92f, 474f, 301.9f)
                    lineTo(473.99f, 300.9f)
                    curveTo(469.1f, 300.92f, 464.72f, 303.66f, 461.58f, 307.99f)
                    curveTo(458.44f, 312.31f, 456.51f, 318.26f, 456.5f, 324.81f)
                    lineTo(457.5f, 324.81f)
                    close()
                    moveTo(456.5f, 278f)
                    curveTo(456.51f, 284.55f, 458.44f, 290.49f, 461.58f, 294.82f)
                    curveTo(464.72f, 299.15f, 469.1f, 301.88f, 473.99f, 301.9f)
                    lineTo(474f, 300.9f)
                    curveTo(469.51f, 300.89f, 465.39f, 298.37f, 462.39f, 294.23f)
                    curveTo(459.38f, 290.1f, 457.51f, 284.36f, 457.5f, 278f)
                    lineTo(456.5f, 278f)
                    close()
                }
            }
        }.build()

        return _FallingStars!!
    }

@Suppress("ObjectPropertyName")
private var _FallingStars: ImageVector? = null
