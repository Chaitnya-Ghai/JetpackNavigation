package com.example.jetpacknavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SecondScreen( name:String , navigateToThirdScreen:() -> Unit ){
    Column (
        modifier = Modifier.padding(16.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Text(text=" Welcome $name ")
        Spacer(modifier = Modifier.padding(8.dp))
        Button(
            onClick = { navigateToThirdScreen() },
            modifier = Modifier.padding(8.dp)
        ) { Text(text="Done") }
    }
}