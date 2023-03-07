package com.example.myminute

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dateButton: Button = findViewById(R.id.start1)
        val date: TextView =findViewById(R.id.text1)
        val minute: TextView = findViewById(R.id.text2)
    }

}