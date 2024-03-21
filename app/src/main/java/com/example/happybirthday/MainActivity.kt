package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        GreetingText("Happy Birthday","Sharlene", 90.sp, 100.sp, "From Leslie")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String,
                 name: String,
                 fontSize: TextUnit,
                 lineHeight: TextUnit,
                 from: String,
                 modifier: Modifier = Modifier,
) {
    Column (
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = "$message $name!",
            modifier = modifier,
            fontSize = fontSize,
            lineHeight = lineHeight,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true,
    showSystemUi = true,
    name = "My Preview")
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        Column (
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(8.dp)
        ){
            GreetingText("Happy Birthday", "Sharlene", 90.sp, 100.sp,"From Leslie")
        }
    }
}