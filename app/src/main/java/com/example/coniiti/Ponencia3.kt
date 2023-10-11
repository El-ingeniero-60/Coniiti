package com.example.coniiti

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ponencia3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ponencia3)
        //BOTON VOLVER AL MENU
        val btnVoMenu2 = findViewById<Button>(R.id.btn_pon3_vm)
        btnVoMenu2.setOnClickListener {
            val p1M = Intent(this, Menu::class.java)
            startActivity(p1M)

        }
    }
}