package com.malvadezas.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//AppCompatActivity()importa ou herda as funções da tela do kotlin

class PrincipalActivity : AppCompatActivity() {

    //var
    val nome_aplicativo_string: String = "Minha Calculadora"
    val valor_inteiro: Int = 20
    val valor_com_ponto: Float = 1250F
    val aprovado: Boolean = false /// true ou false somente
    val sigla_do_app: Char = 'c' //só permite uma letra, com aspas simples

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //seta = a conteudo da view como o arquivo layout principal
        setContentView(R. layout.activity_main)

        val btnCalcular: Button = findViewById(R.id.btncalcular)
        val edtNumero: EditText = findViewById(R.id.edtNumero)

        btnCalcular.setOnClickListener {
            val text = "Ola Marilene"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(this, text, duration) // in Activity
            toast.show()
        }
    }


    fun eventoClickBotaoCalcular() {

    }
}