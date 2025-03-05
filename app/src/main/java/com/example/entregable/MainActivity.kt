package com.example.entregable

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var stockResaltador = 11
    private var stockPortaminas = 11
    private var stockPapelA4 = 11
    private var stockMarcadores = 11
    private var stockLibretas = 11
    private var stockLapices = 11
    private var stockCuadernos = 11
    private var stockBolígrafos = 11
    private var stockGrapas = 11

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botón para entrar a la gestión de stock
        val buttonEntrar = findViewById<Button>(R.id.buttonEntrar)
        buttonEntrar.setOnClickListener {
            val intent = Intent(this, Almacen2::class.java)
            startActivity(intent)
        }
    }
}


