package com.jimpsoft.cursobasicoandroid.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true, showBackground = true )
@Composable
fun SpaceExample(){
    Column() {
        Box(modifier = Modifier.fillMaxWidth().weight(2f).background(color = Color.Red)) { }
        Box(modifier = Modifier.fillMaxWidth().weight(1f).background(color = Color.Blue)) { }
        Box(modifier = Modifier.fillMaxWidth().weight(1f).background(color = Color.Yellow)) { }
    }

}