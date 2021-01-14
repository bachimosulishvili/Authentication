package com.example.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }


    private fun init() {
        logInButton.setOnClickListener {logIn()}
    }


    private fun logIn() {
        val email = emailEditText.text.toString()
        val password = passwordEditText.text.toString()

        if (email.isNotEmpty() && password.isNotEmpty()) {
            logInButton.setOnClickListener {
                val intent = Intent(this, ProfilePage::class.java)
                startActivity(intent)
            }
        }

        else{Toast.makeText(this, "გთხოვთ შეავსოთ ყველა ველი.", Toast.LENGTH_SHORT).show()}
    }
}


