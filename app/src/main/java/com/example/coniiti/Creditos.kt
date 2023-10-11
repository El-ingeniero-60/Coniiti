package com.example.coniiti

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Creditos : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creditos)

        //BOTON PARA VOLVER AL MENU

        val btn_cr_m = findViewById<Button>(R.id.btn_cr_menu)
        btn_cr_m.setOnClickListener {
            val vlrmenu = Intent(this, Menu::class.java)
            startActivity(vlrmenu)


        }
    }
}