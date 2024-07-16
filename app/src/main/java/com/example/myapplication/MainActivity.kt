package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var flag : String = "English"

        val btStart: Button =findViewById(R.id.btStart)

        val spinner : Spinner = findViewById(R.id.spSubject)
        var option = arrayOf("Select Subject","English","History")
        spinner.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,option)

        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                p0: AdapterView<*>?,
                p1: View?,
                p2: Int,
                p3: Long
            ) {
                flag = option.get(p2)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }

        btStart.setOnClickListener{

            if (flag=="English") {
                val intent = Intent(this,English::class.java)
                startActivity(intent)

            }
            else if(flag=="History"){
                val intent = Intent (this,History::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Please select a subject", Toast.LENGTH_LONG).show()
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


}