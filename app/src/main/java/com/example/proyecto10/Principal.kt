package com.example.proyecto10

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class Principal : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Trabajo de Jorge Mañas Garcia

        val boton = findViewById<Button>(R.id.button)
        val editSueldo = findViewById<EditText>(R.id.sueldo)
        val resultado = findViewById<TextView>(R.id.textoResultado)

        boton.setOnClickListener {
            val sueldo = editSueldo.text.toString().toDouble()

            if(sueldo > 3000){
                resultado.setText("Debe pagar impuestos")
            }
            else{
                resultado.setText("")
            }

        }
    }
}