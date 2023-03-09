package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class DashBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        val backbtn : ImageButton = findViewById(R.id.backB)
        val logoutbtn : ImageButton = findViewById(R.id.logOutB)

        backbtn.setOnClickListener{
            goback()
        }

        logoutbtn.setOnClickListener{
            goback()
        }
    }
    private fun goback(){
        startActivity(Intent(this@DashBoard,LoginPAge::class.java))
        finish()
    }
}