package com.pacheco.sudoku.composables

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pacheco.sudoku.ui.theme.Azul
import com.pacheco.sudoku.ui.theme.Naranja
import com.pacheco.sudoku.ui.theme.Rojo
import com.pacheco.sudoku.ui.theme.Verde

@Composable
fun Acciones() {
    val acciones = listOf("Deshacer", "Borrar", "Notas", "Pista")
    val colores = listOf(Azul, Rojo, Verde, Naranja)

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        for (i in acciones.indices) {
            Button(
                onClick = { },
                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colores[i]),
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(text = acciones[i], fontSize = 12.sp, fontWeight = FontWeight.Bold, maxLines = 1)
            }
        }
    }
}