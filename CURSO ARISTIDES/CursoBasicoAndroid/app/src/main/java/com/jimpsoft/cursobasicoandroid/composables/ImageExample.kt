package com.jimpsoft.cursobasicoandroid.composables

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.jimpsoft.cursobasicoandroid.R

@Preview
@Composable
fun ImageExample(){
    Image(painter = painterResource(R.drawable.gomu),
        contentDescription = "Icono Principal"
        )
}