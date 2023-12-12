package dev.jay.bankingappui.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyPound
import androidx.compose.material.icons.rounded.CurrencyRupee
import androidx.compose.material.icons.rounded.CurrencyYen
import androidx.compose.material.icons.rounded.Euro
import androidx.compose.ui.graphics.vector.ImageVector
import dev.jay.bankingappui.R

data class Currency(
    val name: Int,
    val buy: Float,
    val sell: Float,
    val icon: ImageVector
)

val currencyItems = listOf(
    Currency(name = R.string.inr, buy = 99.97f, sell = 99.99f, icon = Icons.Rounded.CurrencyRupee),
    Currency(name = R.string.usd, buy = 84.19f, sell = 81.56f, icon = Icons.Rounded.AttachMoney),
    Currency(name = R.string.eur, buy = 87.68f, sell = 91.73f, icon = Icons.Rounded.Euro),
    Currency(name = R.string.gbp, buy = 102.14f, sell = 106.2f, icon = Icons.Rounded.CurrencyPound),
    Currency(name = R.string.jpy, buy = 55.80f, sell = 58.91f, icon = Icons.Rounded.CurrencyYen)
)