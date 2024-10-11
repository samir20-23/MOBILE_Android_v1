package com.example.jebha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.graphicsLayer
import com.example.jebha.ui.theme.JebhaTheme
import androidx.compose.ui.unit.sp
//text center
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.geometry.Offset



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JebhaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun img(msg: String, modifier: Modifier = Modifier) {
    val img = painterResource(R.drawable.jebha)

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = img,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer {
                    alpha = 0.5f
                },
            contentScale = ContentScale.Crop
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = img,
                contentDescription = null,
                modifier = Modifier
                    .size(250.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .shadow(4.dp, RoundedCornerShape(16.dp))
                    .padding(4.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = msg,style = MaterialTheme.typography.bodyMedium.copy(fontSize = 30.sp,textAlign = TextAlign.Center , color = Color.Black,  shadow = Shadow( color = Color.Black, offset = Offset(1f, 1f),  blurRadius = 4f)),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(50.dp))

            Text(
                text = "El Jebha is a beautiful coastal city located in northern Morocco, known for its stunning landscapes and serene beaches.",
                style = MaterialTheme.typography.bodyMedium.copy(fontSize = 20.sp,textAlign = TextAlign.Center , color = Color.White,  shadow = Shadow( color = Color.Black, offset = Offset(4f, 4f),  blurRadius = 1f)),
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )


        }
    }
}

@Preview(showBackground = true)
@Composable
fun App(modifier: Modifier = Modifier) {
    img(msg = "El Jebha")
}