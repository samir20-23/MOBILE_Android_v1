package com.example.app_v2.MOBILE_Android_v1

import androidx.compose.animation.core.tween
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@Composable

fun MovingButton() {
    var moveRight by remember { mutableStateOf(false) }

    val padding by animateDpAsState(
        targetValue = if (moveRight) 200.dp else 0.dp,
        animationSpec = tween(durationMillis = 1000)
    )

    Box(contentAlignment = Alignment.Center) {
        Button(
            onClick = { moveRight = !moveRight },
            modifier = Modifier
                .padding(start = padding)
                .size(100.dp)
        ) {
            Text("HELLO , CLICK ME")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MovingButtonPreview() {
    MovingButton()
}
