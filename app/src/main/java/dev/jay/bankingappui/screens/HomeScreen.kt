@file:OptIn(ExperimentalMaterial3Api::class)

package dev.jay.bankingappui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.jay.bankingappui.components.BottomNavigationBar
import dev.jay.bankingappui.components.CardsComponent
import dev.jay.bankingappui.components.CurrenciesComponent
import dev.jay.bankingappui.components.FinanceComponent
import dev.jay.bankingappui.components.TopBar

@Composable
fun HomeScreen() {
    Scaffold(bottomBar = {
        BottomNavigationBar()
    }) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            TopBar()
            CardsComponent()
            Spacer(modifier = Modifier.height(16.dp))
            FinanceComponent()
            CurrenciesComponent()
        }
    }
}