package com.jimpsoft.cursobasicoandroid.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun TextFieldExample(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        var myText by remember { mutableStateOf("") }

        Box(modifier = Modifier.fillMaxSize().background(Color.Gray),contentAlignment = Alignment.Center
        ){
            // Usando by, importamos set y get y eso permite omitir el value

            TextField(
                value = myText,
                onValueChange = {inText -> myText=inText},
                label = { Text("Nombre") }

            )
            // var myText = remember { mutableStateOf("") }
            //TextField(value = myText.value, onValueChange = {inText -> myText.value=inText})
        }

    }

}
