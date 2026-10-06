package com.jimpsoft.cursobasicoandroid.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jimpsoft.cursobasicoandroid.R

@Preview(showSystemUi = true)
@Composable
fun ProfileScript(){
    Box(

        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()

    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF28BEE8))
                .padding(vertical = 8.dp),

            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround

            //.padding(horizontal = 22.dp, vertical = 40.dp)

        ) {
            Image(painter = painterResource(R.drawable.gomu),
                contentDescription = "Logo Jimpsoft",
                Modifier.size(75.dp))
            Column(modifier = Modifier) {
                Text("José Ivan", color = Color.White)
                Text("Mobile Developer", color = Color.White)
            }
            Button(onClick = {}) {
                Text(text = "Click")
            }
        }

    }


}