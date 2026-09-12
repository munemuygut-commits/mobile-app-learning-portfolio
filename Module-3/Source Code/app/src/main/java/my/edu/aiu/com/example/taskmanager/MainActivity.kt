package my.edu.aiu.com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BusinessCard()
        }
    }
}

@Composable
fun BusinessCard() {
    androidx.compose.foundation.layout.Box(
        modifier = Modifier.fillMaxSize()
    ) {

        // Purple background
        Image(
            painter = painterResource(R.drawable.purple_background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Business card content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Munawa Abudujilili",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Text(
                text = "Android Developer",
                fontSize = 18.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(40.dp))

            ContactInformation()
        }
    }
}

@Composable
fun ContactInformation() {
    Column {

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "☎",
                fontSize = 20.sp,
                color = Color.White
            )

            Text(
                text = "+60 12 345 6789",
                modifier = Modifier.padding(start = 16.dp),
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "✉",
                fontSize = 20.sp,
                color = Color.White
            )

            Text(
                text = "mmuunnaawwaa@email.com",
                modifier = Modifier.padding(start = 16.dp),
                color = Color.White
            )
        }
    }
}