package com.jimpsoft.cursobasicoandroid.ejercicios

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Ejercicio2() {
Row(modifier = Modifier.background(Color.White).padding(10.dp)) {
    Column(modifier = Modifier.fillMaxHeight().weight(1f).background(Color.Yellow)
    ) { }

    Column(
        modifier = Modifier.fillMaxHeight().weight(9f)
    ) {

        Row(modifier = Modifier.fillMaxWidth().weight(1f)){
            Box(modifier = Modifier.fillMaxSize().weight(1f)
                .background(color = Color.Green),
                //  contentAlignment = Alignment.Center
            ){}
            Box(modifier = Modifier.fillMaxSize().weight(2f)
                .background(color = Color.Magenta),
                //  contentAlignment = Alignment.Center
            ){}
        }


        Box(modifier = Modifier
            .fillMaxWidth().weight(1f)
            .background(color = Color.Blue)){}




    }
}


}