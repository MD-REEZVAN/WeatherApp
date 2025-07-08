package com.reezvan.weatherapp.Ui.homeScreen


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun StartingHomePage(){
    Row {
        Column(modifier=Modifier.fillMaxWidth()){
            var location by remember { mutableStateOf("") }

            OutlinedTextField(value = location,
                onValueChange = {location=it},
                label = { Text(text="Search Here", fontWeight = FontWeight.W600) }
                )
        }
        Spacer(modifier = Modifier.width(8.dp))
        IconButton(onClick = {}) {
            Icon(imageVector = Icons.Default.Search,"Search")
        }
    }
}
