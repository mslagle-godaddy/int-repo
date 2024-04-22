package com.example.intapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.example.intapp.ui.theme.IntAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntAppTheme {
                // TODO: Add your app view here
                Text(text = "Hello!")
            }
        }
    }
}