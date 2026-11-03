package com.pacheco.sudoku.composables

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pacheco.sudoku.ui.theme.FondoAbajo
import com.pacheco.sudoku.ui.theme.FondoArriba
import com.pacheco.sudoku.ui.theme.IndigoOscuro
import com.pacheco.sudoku.ui.theme.Morado

@Composable
fun PantallaSudoku() {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.verticalGradient(listOf(FondoArriba, FondoAbajo)))
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "SUDOKU",
                fontSize = 36.sp,
                fontWeight = FontWeight.ExtraBold,
                letterSpacing = 6.sp,
                color = IndigoOscuro
            )
            Cabecera()
            Tablero()
            Acciones()
            Teclado()
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Morado)
            ) {
                Text(text = "Nueva partida", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaSudokuPreview() {
    MaterialTheme {
        PantallaSudoku()
    }
}