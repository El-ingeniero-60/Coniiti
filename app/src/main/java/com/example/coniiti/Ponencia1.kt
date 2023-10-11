package com.example.coniiti

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ponencia1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ponencia1)

        val btnVoMenu = findViewById<Button>(R.id.btn_pon1_vm)
        btnVoMenu.setOnClickListener {
            val prM = Intent(this, Menu::class.java)
            startActivity(prM)
        }
    }
}