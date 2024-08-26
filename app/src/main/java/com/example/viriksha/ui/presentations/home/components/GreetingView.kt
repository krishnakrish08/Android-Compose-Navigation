package com.example.viriksha.ui.presentations.home.components

import android.icu.util.Calendar
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GreetingSection() {
    val calendar: Calendar = Calendar.getInstance()
    val timeOfTheDay: Int = calendar.get(Calendar.HOUR_OF_DAY)

    Column(modifier = Modifier.padding(16.dp, 0.dp)) {
        Text(
            text = when (timeOfTheDay) {
                in 0..11 -> {
                    "Good Morning"
                }

                in 12..17 -> {
                    "Good Afternoon"
                }

                else -> {
                    "Good Evening"
                }
            },
            fontSize = 28.sp,
            fontWeight = FontWeight.W500
        )
        Text(
            text = "Bengaluru",
            fontSize = 24.sp,
            fontWeight = FontWeight.Light,
        )
    }
}