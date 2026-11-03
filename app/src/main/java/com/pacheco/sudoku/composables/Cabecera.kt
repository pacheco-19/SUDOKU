package com.pacheco.sudoku.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pacheco.sudoku.ui.theme.Azul
import com.pacheco.sudoku.ui.theme.Rojo
import com.pacheco.sudoku.ui.theme.Verde

@Composable
fun Cabecera() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Dato(texto = "Fácil", color = Verde, modifier = Modifier.weight(1f))
        Dato(texto = "05:32", color = Azul, modifier = Modifier.weight(1f))
        Dato(texto = "0/3", color = Rojo, modifier = Modifier.weight(1f))
    }
}

@Composable
fun Dato(texto: String, color: Color, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(color, RoundedCornerShape(50))
            .padding(vertical = 10.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = texto, color = Color.White, fontSize = 15.sp, fontWeight = FontWeight.Bold)
    }
}