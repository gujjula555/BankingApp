package dev.jay.bankingappui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dev.jay.bankingappui.model.bottomNavigationItems

@Composable
fun BottomNavigationBar() {
    NavigationBar {
        Row(modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)) {
            val rootNavController = rememberNavController()
            val navBackStackEntry by rootNavController.currentBackStackEntryAsState()
            bottomNavigationItems.forEach { item ->
                val isSelected = stringResource(id = item.title).lowercase() == navBackStackEntry?.destination?.route
                NavigationBarItem(
                    selected = isSelected,
                    onClick = {},
                    icon = {
                        Icon(
                            imageVector = if (isSelected) item.selectedIcon else item.unselectedIcon,
                            contentDescription = stringResource(id = item.title),
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    label = {
                        Text(
                            text = stringResource(id = item.title),
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                )
            }
        }
    }
}