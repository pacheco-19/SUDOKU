package com.pacheco.sudoku.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Tablero() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF37474F))
            .padding(3.dp)
    ) {
        for (fila in 0 until 9) {
            Row(modifier = Modifier.fillMaxWidth()) {
                for (columna in 0 until 9) {
                    Celda(texto = "", modifier = Modifier.weight(1f))
                }
            }
        }
    }
}