package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_Peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_Altura)

        val btncalcular = findViewById<Button>(R.id.btn_calcular)

        btncalcular.setOnClickListener(){


            val pesoStr: String = edtpeso.text.toString()
            val alturaStr: String = edtaltura.text.toString()


            if (pesoStr == "" || alturaStr == ""){

                Snackbar.make(edtpeso,"preencha todas aos campos", Snackbar.LENGTH_LONG).show()

            }else {
                val peso = edtpeso.text.toString().toFloat()
                val altura = edtaltura.text.toString().toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2


                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(KEY_RESULT_IMC, resultado)
                startActivity(intent)

                println("ação botao imc  " + resultado)

            }
        }
    }
}