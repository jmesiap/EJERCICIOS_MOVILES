package com.jimpsoft.cursobasicoandroid.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp




@Composable
fun CounterScreen(modifier: Modifier){
    // Las variables asi no actualizan en estados
    //var counter = 0
    var counter1 by rememberSaveable{(mutableStateOf(0)) }
    var counter2 by rememberSaveable{(mutableStateOf(0)) }
    var name by rememberSaveable {mutableStateOf("") }
    Column(modifier) {
        Counter(counter = counter1, onIncrement = {counter1++})
        Counter(counter = counter2, onIncrement = {counter2++})
        TextFieldCounter(name = name, onValueChange = {myText -> name=myText} )
    }

}

@Composable
fun Counter(
    modifier: Modifier= Modifier,
    counter: Int,
    onIncrement: ()-> Unit
){
    Column(modifier
        .padding(top = 60.dp)) {
        Text("Contador: $counter")

        Button(onClick = {onIncrement()}) {
            Text("Incrementar")
        }
    }
}

@Composable
fun TextFieldCounter(modifier:
                     Modifier= Modifier,
                     name: String,
                     onValueChange:(String)->Unit){
    TextField(
        value = name,
        onValueChange = {onValueChange(it)},
        label = {Text("Ejemplo")}
    )
}