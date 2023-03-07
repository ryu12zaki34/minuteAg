package com.example.myminute

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var minute: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dateButton: Button = findViewById(R.id.start1)
        val date: TextView =findViewById(R.id.text1)
        minute=findViewById(R.id.text2)
        dateButton.setOnClickListener {
            openCalendar()

        }
    }
    fun openCalendar ()
    {
        minute?.text="11.11.2002"
        Toast.makeText(this, "this button works slay", Toast.LENGTH_SHORT).show()
    }
}