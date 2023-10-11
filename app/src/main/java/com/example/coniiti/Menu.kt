package com.example.coniiti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //BOTON PONENCIA 1
        val btn_pone1= findViewById<Button>(R.id.btn_pon1)
        btn_pone1.setOnClickListener {
            val pone1 = Intent(this, Ponencia1::class.java)
            startActivity(pone1)
        }
        //BOTON PONENCIA 2
        val btn_pone2= findViewById<Button>(R.id.btn_pon2)
        btn_pone2.setOnClickListener {
            val pone2 = Intent(this, Ponencia2::class.java)
            startActivity(pone2)
        }
        //BOTON PONENCIA 3
        val btn_pone3= findViewById<Button>(R.id.btn_pon3)
        btn_pone3.setOnClickListener {
            val pone3 = Intent(this, Ponencia3::class.java)
            startActivity(pone3)
        }
        //BOTON CREDITOS
        val btn_credi= findViewById<Button>(R.id.btn_cred)
        btn_credi.setOnClickListener {
            val credi = Intent(this, Creditos::class.java)
            startActivity(credi)
        }
        //BOTON PONENCIA 1
        val btn_salir= findViewById<Button>(R.id.btn_salir)
        btn_salir.setOnClickListener {
            finishAffinity()

        }
    }
}
