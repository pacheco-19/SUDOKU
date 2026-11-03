package com.pacheco.sudoku.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pacheco.sudoku.ui.theme.IndigoClaro
import com.pacheco.sudoku.ui.theme.IndigoOscuro
import com.pacheco.sudoku.ui.theme.NumeroJugador

@Composable
fun Celda(texto: String, esPista: Boolean, colorFondo: Color, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .aspectRatio(1f)
            .background(colorFondo)
            .border(0.5.dp, IndigoClaro),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = texto,
            fontSize = 22.sp,
            fontWeight = if (esPista) FontWeight.Bold else FontWeight.SemiBold,
            color = if (esPista) IndigoOscuro else NumeroJugador
        )
    }
}