package com.pacheco.sudoku.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

// Sudoku de ejemplo: 81 caracteres, "0" = casilla vacía
val sudoku = "530070000600195000098000060800060003400803001700020006060000280000419005000080079"

// Números "escritos por el jugador": (fila, columna) to valor
val numerosJugador = mapOf(
    (0 to 2) to 4,
    (0 to 3) to 6,
    (1 to 1) to 7,
    (1 to 2) to 2,
    (2 to 0) to 1,
    (3 to 1) to 5,
    (4 to 6) to 7
)

// Celda que aparece seleccionada
val filaSeleccionada = 4
val columnaSeleccionada = 4

// Color de fondo: la celda seleccionada, y su fila, columna y bloque
fun colorDeFondo(fila: Int, columna: Int): Color {
    val mismoBloque = fila / 3 == filaSeleccionada / 3 &&
            columna / 3 == columnaSeleccionada / 3
    return when {
        fila == filaSeleccionada && columna == columnaSeleccionada -> Color(0xFFBBDEFB)
        fila == filaSeleccionada || columna == columnaSeleccionada || mismoBloque -> Color(0xFFE3EAF5)
        else -> Color.White
    }
}

@Composable
fun Tablero() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF37474F))
            .padding(3.dp)
    ) {
        for (fila in 0 until 9) {
            if (fila % 3 == 0 && fila != 0) {
                Spacer(modifier = Modifier.height(3.dp))
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                for (columna in 0 until 9) {
                    if (columna % 3 == 0 && columna != 0) {
                        Spacer(modifier = Modifier.width(3.dp))
                    }
                    val numeroInicial = sudoku[fila * 9 + columna].digitToInt()
                    val numeroJugador = numerosJugador[fila to columna]

                    val texto = when {
                        numeroInicial != 0 -> numeroInicial.toString()
                        numeroJugador != null -> numeroJugador.toString()
                        else -> ""
                    }

                    Celda(
                        texto = texto,
                        esPista = numeroInicial != 0,
                        colorFondo = colorDeFondo(fila, columna),
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}