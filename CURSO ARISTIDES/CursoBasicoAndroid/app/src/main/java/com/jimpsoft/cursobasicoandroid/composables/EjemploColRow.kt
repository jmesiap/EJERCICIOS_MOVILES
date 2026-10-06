package com.jimpsoft.cursobasicoandroid.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EjemploColRow(){
    // 1. COLUMN: Gobierna la estructura vertical de las 3 filas principales
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // FILA 1: Encabezado completo
        Row(modifier = Modifier.fillMaxWidth()) {
            // Usamos un BOX para dar diseño, color de fondo o bordes al contenido
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFE0E0E0), shape = RoundedCornerShape(8.dp))
                    .padding(16.dp)
            ) {
                Text("Fila 1: Encabezado del Layout", modifier = Modifier.align(Alignment.Center))
            }
        }

        // FILA 2: Dividida en dos columnas
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Columna Izquierda (Usamos BOX con peso para que se estire al 50% de la fila)
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFB2EBF2), shape = RoundedCornerShape(8.dp))
                    .padding(24.dp)
            ) {
                Text("Columna A", modifier = Modifier.align(Alignment.Center))
            }

            // Columna Derecha (Otro BOX con el mismo peso para el otro 50%)
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFE1BEE7), shape = RoundedCornerShape(8.dp))
                    .padding(24.dp)
            ) {
                Text("Columna B", modifier = Modifier.align(Alignment.Center))
            }
        }

        // FILA 3: Pie de página completo
        Row(modifier = Modifier.fillMaxWidth()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFE0E0E0), shape = RoundedCornerShape(8.dp))
                    .padding(16.dp)
            ) {
                Text("Fila 3: Pie de página", modifier = Modifier.align(Alignment.Center))
            }
        }
    }


}