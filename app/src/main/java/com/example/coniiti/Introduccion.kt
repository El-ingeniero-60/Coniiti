package com.example.coniiti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Introduccion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduccion)

        //Boton volver al menu
        val btnMenu = findViewById<Button>(R.id.btn_menu)
        btnMenu.setOnClickListener {
            val pasarMenu = Intent(this, Menu::class.java)
            startActivity(pasarMenu)

        }
    }
}