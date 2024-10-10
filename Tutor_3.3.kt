package com.example.app_v2.MOBILE_Android_v1

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextModifierApp() {
    var text by remember { mutableStateOf("Entrez votre texte ici") }
    var updatedText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = updatedText,
            onValueChange = { updatedText = it },
            label = { Text("Modifier le texte") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { text = updatedText }) {
            Text("Mettre à jour le texte")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
fun TextModifierAppPreview() {
    TextModifierApp()
}
