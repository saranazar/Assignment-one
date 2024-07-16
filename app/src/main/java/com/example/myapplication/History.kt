package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class History : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_history)

        val histq: TextView = findViewById(R.id.HistQ)
        val hista: TextView = findViewById(R.id.HistA)
        val histb: TextView = findViewById(R.id.HistB)
        val histc: TextView = findViewById(R.id.HistC)
        val histd: TextView = findViewById(R.id.HistD)

        fun checkAnswer(isSelected: Boolean) {
            if (isSelected) {
                histc.setBackgroundColor(ContextCompat.getColor(this, R.color.button_green))
            } else {
                histc.setBackgroundColor(ContextCompat.getColor(this, R.color.button_green))
                hista.setBackgroundColor(ContextCompat.getColor(this, R.color.button_red))
                histb.setBackgroundColor(ContextCompat.getColor(this, R.color.button_red))
                histd.setBackgroundColor(ContextCompat.getColor(this, R.color.button_red))
            }
        }

        hista.setOnClickListener(){
            checkAnswer(false)
        }

        histb.setOnClickListener(){
            checkAnswer(false)
        }

        histc.setOnClickListener(){
            checkAnswer(true)
        }

        histd.setOnClickListener(){
            checkAnswer(false)
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}