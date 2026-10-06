package com.jimpsoft.cursobasicoandroid.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true) // Muesta el fondo blanco
@Composable
fun ColumnExample(){
    Column(
        modifier = Modifier.size(150.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround

    )

    {
        Text("Mateo")
        Text("Gabriel")
        Text("Mesia")
        Text("Díaz")
        Text("Mirna")
        Text("Janet")
        Text("José")
        Text("Ivan")
    }

}