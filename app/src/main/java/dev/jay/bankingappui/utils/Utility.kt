package dev.jay.bankingappui.utils

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

fun getGradient(begin: Color, finish: Color): Brush {
    return Brush.horizontalGradient(colors = listOf(begin, finish))
}