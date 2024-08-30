package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_Peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_Altura)

        val btncalcular = findViewById<Button>(R.id.btn_calcular)

        btncalcular.setOnClickListener(){
            val peso = edtpeso.text
            val altura = edtaltura.text

            println("ação botao imc" + altura)
        }
    }
}