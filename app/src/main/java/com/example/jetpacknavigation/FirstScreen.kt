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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FirstScreen( modifier: Modifier ,navigateToSecondScreen:(String) -> Unit ){
    var name by remember { mutableStateOf("") }
    Column (
        modifier = Modifier.padding(16.dp).fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        OutlinedTextField(
            modifier = Modifier.padding(16.dp),
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") }
        )
        Spacer(modifier = Modifier.padding(8.dp))
        Button(
            onClick = { navigateToSecondScreen(name) },
            modifier = Modifier.padding(8.dp)
        ) { Text(text="Done") }
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text=" Hii Im the First Screen ")
    }
}