package com.daniGelabert.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clicButton: Button = findViewById(R.id.clicButton)
        val helloWorldTextView: TextView = findViewById(R.id.helloWorldTextView)

        clicButton.setOnClickListener{
                Toast.makeText(this, "Clic!", Toast.LENGTH_SHORT).show()
        }
    }
}