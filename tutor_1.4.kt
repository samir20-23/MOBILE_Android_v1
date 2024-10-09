package com.example.app_v2.MOBILE_Android_v1
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "hello  $name!",
        color = Color.Red,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting("my name is samir")
}
