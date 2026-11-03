# Sudoku (maqueta) 🧩

Maqueta de un juego de Sudoku para Android, hecha con Kotlin y Jetpack Compose. Es un trabajo de clase de 2º de DAM: solo se ha hecho el diseño de la pantalla, no tiene lógica de juego (los botones no hacen nada).

## Qué se ve en la pantalla

- Título y una cabecera con tres chips de colores: dificultad, tiempo y errores.
- Tablero 9x9 con sombra, esquinas redondeadas, líneas gruesas entre los bloques de 3x3 y bloques en dos tonos.
- Números iniciales (las pistas) en negrita y números del jugador en verde azulado.
- Una celda seleccionada en amarillo, con su fila, columna y bloque resaltados.
- Cuatro botones de acción de colores: Deshacer, Borrar, Notas y Pista.
- Teclado del 1 al 9 y botón de Nueva partida.
- Fondo con degradado de lavanda a azul claro.

## Tecnologías

- Kotlin
- Jetpack Compose
- Material 3
- Android Studio
- Git y GitHub

## Cómo abrirlo

1. Clona el repositorio o descárgalo como zip y descomprímelo.
2. En Android Studio ve a File > Open y elige la carpeta del proyecto.
3. Espera a que termine la sincronización de Gradle.
4. Pulsa Run en un emulador o en un móvil con Android 7.0 (API 24) o superior.

Si solo quieres ver el diseño, abre PantallaSudoku.kt y activa la vista Split: la previsualización aparece sin necesidad de emulador.

## Estructura del proyecto

- MainActivity.kt: punto de entrada de la app. Solo llama a PantallaSudoku.
- composables/PantallaSudoku.kt: la pantalla completa, que junta todas las piezas.
- composables/Cabecera.kt: los chips de dificultad, tiempo y errores.
- composables/Tablero.kt: el tablero 9x9 y los datos del sudoku de ejemplo.
- composables/Celda.kt: una casilla del tablero.
- composables/Acciones.kt: los botones Deshacer, Borrar, Notas y Pista.
- composables/Teclado.kt: el teclado numérico del 1 al 9.
- ui/theme/Color.kt: la paleta de colores de la app.
- ui/theme/Theme.kt y Type.kt: tema generado por Android Studio.

## Cómo está hecho

- Cada parte de la pantalla es una función @Composable en su propio archivo, y PantallaSudoku las llama como si fuera un índice.
- El tablero se construye con dos bucles for anidados (9 filas por 9 columnas).
- El sudoku de ejemplo se guarda como un texto de 81 caracteres, donde 0 significa casilla vacía.
- Los números que "ha escrito el jugador" están en un mapa de (fila, columna) a valor.
- Las líneas gruesas se hacen con un Spacer cada 3 filas y cada 3 columnas, sobre un fondo oscuro.
- Todos los colores están en un único archivo para poder cambiar la paleta fácilmente.

## Posibles mejoras

- Seleccionar una celda al tocarla.
- Escribir números con el teclado.
- Comprobar errores y poner un cronómetro de verdad.
- Varios niveles de dificultad.
- Una pantalla de inicio con menú.

## Autor

Alejandro Pacheco - 2º de DAM