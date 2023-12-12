package dev.jay.bankingappui.model

import androidx.compose.ui.graphics.Brush
import dev.jay.bankingappui.R
import dev.jay.bankingappui.ui.theme.BlueEnd
import dev.jay.bankingappui.ui.theme.BlueStart
import dev.jay.bankingappui.ui.theme.GreenEnd
import dev.jay.bankingappui.ui.theme.GreenStart
import dev.jay.bankingappui.ui.theme.OrangeEnd
import dev.jay.bankingappui.ui.theme.OrangeStart
import dev.jay.bankingappui.ui.theme.PurpleEnd
import dev.jay.bankingappui.ui.theme.PurpleStart
import dev.jay.bankingappui.ui.theme.YellowEnd
import dev.jay.bankingappui.ui.theme.YellowStart
import dev.jay.bankingappui.utils.getGradient

data class Card(
    val cardType: Int,
    val cardNumber: String,
    val cardName: String,
    val cardBalance: Long,
    val cardColor: Brush
)

val cardItems = listOf(
    Card(
        cardType = R.string.rupay,
        cardNumber = "4032 0366 5351 0592",
        cardName = "Still There",
        cardBalance = 97,
        cardColor = getGradient(GreenStart, GreenEnd)
    ),
    Card(
        cardType = R.string.mastercard,
        cardNumber = "5110 9240 2713 5984",
        cardName = "Is Hope",
        cardBalance = 37,
        cardColor = getGradient(YellowStart, YellowEnd)
    ),
    Card(
        cardType = R.string.rupay,
        cardNumber = "4032 0349 9624 5588",
        cardName = "In Me",
        cardBalance = 16,
        cardColor = getGradient(OrangeStart, OrangeEnd)
    ),
    Card(
        cardType = R.string.mastercard,
        cardNumber = "5110 9260 0280 5333",
        cardName = "Will Always",
        cardBalance = 92,
        cardColor = getGradient(PurpleStart, PurpleEnd)
    ),
    Card(
        cardType = R.string.rupay,
        cardNumber = "4032 0354 0266 9667",
        cardName = "Wait ...",
        cardBalance = 64,
        cardColor = getGradient(BlueStart, BlueEnd)
    )
)