package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class LoginPAge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)


        var btnlogin = findViewById(R.id.btnclick) as AppCompatButton
        var phone = findViewById(R.id.phoneno) as EditText
        var forget = findViewById(R.id.forget1password) as TextView

        btnlogin.setOnClickListener {
            authorization()
        }

        forget.setOnClickListener {
            forgetpassword()
        }
    }

    private fun forgetpassword() {
        val counter = (1..10).random()
        val forget = findViewById(R.id.forget1password) as TextView
        forget.text = "click Forget PassWord ${counter} times"
        Toast.makeText(this, "Click ${counter.toString()} times to confirm", Toast.LENGTH_SHORT)
            .show()
    }

    private fun authorization(){
        var phone = findViewById(R.id.phoneno) as EditText

        var PHonenumber=""
        PHonenumber = phone.text.toString()

        if (PHonenumber == "9656335898") {
            startActivity(Intent(this@LoginPAge, DashBoard::class.java))
            finish()
        } else {
            Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()
        }
    }
}