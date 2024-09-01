package com.comunidadedevspace.imc

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)
        val tv_classificacao = result.toString()
        val tvResult  =  findViewById<TextView>(R.id.tv_resultado)
        val tvClassificaçao = findViewById<TextView>(R.id.tv_classificaçao)




      var (classificaçao: String, color:Int)= when {
          result <= 18.5 ->{
            "MAGREZA" to R.color.vermelho
          }
          result > 18.5f && result <= 29.9f ->{
              "NORMAL" to R.color.verde
          }
          result > 18.5f && result <= 29.9f ->{
              "SOBREPESO I" to R.color.laranja
          }
          result > 18.5f && result <= 29.9f ->{
              "SOBREPESO II" to R.color.laranja_avemelhado
          }
          else -> {
              "OBESIDADE GRAVE" to R.color.laranja_avemelhado
          }
      }

        tvClassificaçao.setTextColor(ContextCompat.getColor(this,color))
        tvClassificaçao.text= classificaçao


    }
}

