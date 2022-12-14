package com.example.udemytraining.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val Orange = Color(0xFFE76A24)

val LightGrey = Color(0xFFD8D8D8)
val DarkGrey = Color(0xFF2A2A2A)

val StarColor = Color(0xFFFFC94D)

val Colors.welcomeScreenBackgroundColor
    @Composable
    get() = if (isLight) Color.White else Color.Black

val Colors.titleColor
    @Composable
    get() = if (isLight) DarkGrey else LightGrey

val Colors.descriptionColor
    @Composable
    get() = if (isLight) DarkGrey.copy(alpha = .5f) else LightGrey.copy(alpha = .5f)
