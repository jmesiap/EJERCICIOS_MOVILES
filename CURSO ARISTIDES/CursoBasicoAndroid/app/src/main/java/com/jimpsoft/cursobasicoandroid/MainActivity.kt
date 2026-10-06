package com.jimpsoft.cursobasicoandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.jimpsoft.cursobasicoandroid.composables.ButtonExample
import com.jimpsoft.cursobasicoandroid.composables.CounterScreen
import com.jimpsoft.cursobasicoandroid.composables.ImageExample
import com.jimpsoft.cursobasicoandroid.composables.ListExample
import com.jimpsoft.cursobasicoandroid.composables.TextExample
import com.jimpsoft.cursobasicoandroid.composables.TextFieldExample
import com.jimpsoft.cursobasicoandroid.ejercicios.Ejercicio1
import com.jimpsoft.cursobasicoandroid.ui.theme.CursoBasicoAndroidTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CursoBasicoAndroidTheme {
                CounterScreen(Modifier.fillMaxSize())
            }
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun Ejemplo(){
    Text(text = "JimpSoft S.A.", fontSize = 40.sp)
}


@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!"
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CursoBasicoAndroidTheme {
        Greeting("Android")
    }
}

*/
