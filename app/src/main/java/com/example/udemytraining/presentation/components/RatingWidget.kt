package com.example.udemytraining.presentation.components

import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.vector.PathParser
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.udemytraining.R
import com.example.udemytraining.ui.theme.StarColor

@Composable
fun RatingWidget(
    modifier: Modifier,
    rating: Double,
    scaleFactor: Float = 3f,
    spaceBeetwen: Dp = 6.dp
) {
    val result = calculateStars(rating = rating)
    val starPathString = stringResource(id = R.string.star_icon)
    val starPath = remember {
        PathParser().parsePathString(pathData = starPathString).toPath()
    }
    val startPathBounds = remember {
        starPath.getBounds()
    }

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(spaceBeetwen)
    ) {
        result["filledStars"]?.let {
            repeat(it) {
                FilledStar(
                    starPath = starPath,
                    pathBounds = startPathBounds,
                    scaleFactor = scaleFactor
                )
            }
        }
        result["halfStarts"]?.let {
            repeat(it) {
                HalfFilledStar(
                    starPath = starPath,
                    pathBounds = startPathBounds,
                    scaleFactor = scaleFactor
                )
            }
        }
        result["emptyStars"]?.let {
            repeat(it) {
                EmptyStar(
                    starPath = starPath,
                    pathBounds = startPathBounds,
                    scaleFactor = scaleFactor
                )
            }
        }
    }
}

@Composable
fun FilledStar(
    starPath: Path,
    pathBounds: Rect,
    scaleFactor: Float
) {
    Canvas(modifier = Modifier.size(24.dp)) {
        val canvasSize = size
        scale(scale = scaleFactor) {
            val pathWidth = pathBounds.width
            val pathHeight = pathBounds.height
            val left = (canvasSize.width / 2) - (pathWidth / 1.7f)
            val top = (canvasSize.height / 2) - (pathHeight / 1.7f)

            translate(left = left, top = top) {
                drawPath(
                    path = starPath,
                    color = StarColor
                )
            }
        }
    }
}


@Composable
fun HalfFilledStar(
    starPath: Path,
    pathBounds: Rect,
    scaleFactor: Float
) {
    Canvas(modifier = Modifier.size(24.dp)) {
        val canvasSize = size
        scale(scale = scaleFactor) {
            val pathWidth = pathBounds.width
            val pathHeight = pathBounds.height
            val left = (canvasSize.width / 2) - (pathWidth / 1.7f)
            val top = (canvasSize.height / 2) - (pathHeight / 1.7f)

            translate(left = left, top = top) {
                drawPath(
                    path = starPath,
                    color = LightGray.copy(alpha = .5f)
                )
                clipPath(path = starPath) {
                    drawRect(
                        color = StarColor,
                        size = Size(
                            width = pathBounds.maxDimension / 1.7f,
                            height = pathBounds.maxDimension * scaleFactor
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun EmptyStar(
    starPath: Path,
    pathBounds: Rect,
    scaleFactor: Float
) {
    Canvas(modifier = Modifier.size(24.dp)) {
        val canvasSize = size
        scale(scale = scaleFactor) {
            val pathWidth = pathBounds.width
            val pathHeight = pathBounds.height
            val left = (canvasSize.width / 2) - (pathWidth / 1.7f)
            val top = (canvasSize.height / 2) - (pathHeight / 1.7f)

            translate(left = left, top = top) {
                drawPath(
                    path = starPath,
                    color = LightGray.copy(alpha = .5f)
                )
            }
        }
    }
}

@Composable
fun calculateStars(rating: Double): Map<String, Int> {
    val maxStars by remember { mutableStateOf(5) }
    var filledStars by remember { mutableStateOf(0) }
    var halfFilledStars by remember { mutableStateOf(0) }
    var emptyStars by remember { mutableStateOf(0) }

    LaunchedEffect(key1 = rating) {
        val (firstNumber, lastNumber) = rating.toString()
            .split(".")
            .map { it.toInt() }
        if (firstNumber in 0..5 && lastNumber in 0..9) {
            filledStars = firstNumber
            if (lastNumber in 1..5){
                halfFilledStars++}
            if (lastNumber in 6..9){
                filledStars++}
            if (firstNumber == 5 && lastNumber > 0) {
                emptyStars = 5
                filledStars = 0
                halfFilledStars = 0
            }
        } else {
            Log.d("RatingWidget", "Invalid")
        }
    }
    emptyStars = maxStars - (filledStars + halfFilledStars)
    return mapOf(
        "filledStars" to filledStars,
        "halfStarts" to halfFilledStars,
        "emptyStars" to emptyStars
    )
}


@Composable
@Preview(showBackground = true)
fun FilledStarPreview() {
    val starPathString = stringResource(id = R.string.star_icon)
    val starPath = remember {
        PathParser().parsePathString(pathData = starPathString).toPath()
    }
    val startPathBounds = remember {
        starPath.getBounds()
    }
    FilledStar(starPath = starPath, pathBounds = startPathBounds, scaleFactor = 3f)
}

@Composable
@Preview(showBackground = true)
fun HalfFilledStarPreview() {
    val starPathString = stringResource(id = R.string.star_icon)
    val starPath = remember {
        PathParser().parsePathString(pathData = starPathString).toPath()
    }
    val startPathBounds = remember {
        starPath.getBounds()
    }
    HalfFilledStar(starPath = starPath, pathBounds = startPathBounds, scaleFactor = 3f)
}

@Composable
@Preview(showBackground = true)
fun EmotyStarPreview() {
    val starPathString = stringResource(id = R.string.star_icon)
    val starPath = remember {
        PathParser().parsePathString(pathData = starPathString).toPath()
    }
    val startPathBounds = remember {
        starPath.getBounds()
    }
    EmptyStar(starPath = starPath, pathBounds = startPathBounds, scaleFactor = 3f)
}
