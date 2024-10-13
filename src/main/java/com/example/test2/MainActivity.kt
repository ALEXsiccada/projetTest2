package com.example.Test2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test2.R
import com.example.test2.ui.theme.Test2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    gappy(
                        stringResource(R.string.ok1),
                        stringResource(R.string.ok2),
                    )
                }
            }
        }
    }
}
@Composable
fun gappy(ok1 : String, ok2 :String, modifier: Modifier = Modifier) {
    Column( modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = "hand"
        )
        Text(
            text = ok1,
            fontWeight = FontWeight.Bold,// Texte en gras
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = ok2,
            fontSize = 16.sp,
            modifier = modifier.padding()
        )
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Test2Theme {
        gappy(
            stringResource(R.string.ok1),
            stringResource(R.string.ok2),
        )
    }
}