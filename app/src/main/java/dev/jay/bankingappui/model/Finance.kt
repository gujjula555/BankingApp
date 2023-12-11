package dev.jay.bankingappui.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Analytics
import androidx.compose.material.icons.rounded.MonetizationOn
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import dev.jay.bankingappui.ui.theme.BlueStart
import dev.jay.bankingappui.ui.theme.GreenStart
import dev.jay.bankingappui.ui.theme.OrangeStart
import dev.jay.bankingappui.ui.theme.PurpleStart

data class Finance(
    val icon: ImageVector,
    val name: String,
    val background: Color
)

val financeItems = listOf(
    Finance(icon = Icons.Rounded.Star, name = "My\nCareer", background = OrangeStart),
    Finance(icon = Icons.Rounded.Wallet, name = "My\nWallet", background = BlueStart),
    Finance(icon = Icons.Rounded.Analytics, name = "Finance\nAnalytics", background = PurpleStart),
    Finance(icon = Icons.Rounded.MonetizationOn, name = "My\nTransactions", background = GreenStart)
)