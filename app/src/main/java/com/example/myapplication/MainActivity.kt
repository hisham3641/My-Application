package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var B  = findViewById(R.id.btnclick) as Button
         B.setOnClickListener {
            Toast.makeText(this,"hi",Toast.LENGTH_LONG).show()
        }
    }
}