package dev.jay.bankingappui.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Wallet
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Wallet
import androidx.compose.ui.graphics.vector.ImageVector
import dev.jay.bankingappui.R

data class BottomNavigationItem(
    val title: Int, val unselectedIcon: ImageVector, val selectedIcon: ImageVector
)

val bottomNavigationItems = listOf(
    BottomNavigationItem(
        title = R.string.home,
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home
    ),
    BottomNavigationItem(
        title = R.string.wallet,
        selectedIcon = Icons.Filled.Wallet,
        unselectedIcon = Icons.Outlined.Wallet
    ),
    BottomNavigationItem(
        title = R.string.notifications,
        selectedIcon = Icons.Filled.Notifications,
        unselectedIcon = Icons.Outlined.Notifications
    ),
    BottomNavigationItem(
        title = R.string.account,
        selectedIcon = Icons.Filled.AccountCircle,
        unselectedIcon = Icons.Outlined.AccountCircle
    )
)