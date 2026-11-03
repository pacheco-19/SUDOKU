package com.pacheco.sudoku.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Acciones() {
    val acciones = listOf("Deshacer", "Borrar", "Notas", "Pista")

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        for (accion in acciones) {
            OutlinedButton(
                onClick = { },
                modifier = Modifier.weight(1f),
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(text = accion, fontSize = 12.sp, maxLines = 1)
            }
        }
    }
}