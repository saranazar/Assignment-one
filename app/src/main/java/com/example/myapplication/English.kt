package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class English : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_english)


        val engq: TextView = findViewById(R.id.EngQ)
        val enga: TextView = findViewById(R.id.EngA)
        val engb: TextView = findViewById(R.id.EngB)
        val engc: TextView = findViewById(R.id.EngC)
        val engd: TextView = findViewById(R.id.EngD)

        fun checkAnswer(isSelected: Boolean) {
            if (isSelected) {
                enga.setBackgroundColor(ContextCompat.getColor(this, R.color.button_green))

            } else {
                enga.setBackgroundColor(ContextCompat.getColor(this, R.color.button_green))
                engb.setBackgroundColor(ContextCompat.getColor(this, R.color.button_red))
                engc.setBackgroundColor(ContextCompat.getColor(this, R.color.button_red))
                engd.setBackgroundColor(ContextCompat.getColor(this, R.color.button_red))
            }
        }

        enga.setOnClickListener(){
            checkAnswer(true)
        }

        engb.setOnClickListener(){
            checkAnswer(false)
        }

        engc.setOnClickListener(){
            checkAnswer(false)
        }

        engd.setOnClickListener(){
            checkAnswer(false)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}