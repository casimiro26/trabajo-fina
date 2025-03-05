package com.example.entregable

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class Almacen2 : AppCompatActivity() {

    private var stockResaltador = 11
    private var stockPortaminas = 11
    private var stockPapelA4 = 11
    private var stockMarcadores = 11
    private var stockLibretas = 11
    private var stockLapices = 11
    private var stockCuadernos = 11
    private var stockBolígrafos = 11
    private var stockGrapas = 11

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.almacen2)

        // Inicializar botones y textos
        val buttonResaltador = findViewById<Button>(R.id.button10)
        val textResaltador = findViewById<TextView>(R.id.textView2)

        val buttonPortaminas = findViewById<Button>(R.id.button2)
        val textPortaminas = findViewById<TextView>(R.id.textView4)

        val buttonPapelA4 = findViewById<Button>(R.id.button4)
        val textPapelA4 = findViewById<TextView>(R.id.textView5)

        val buttonMarcadores = findViewById<Button>(R.id.button3)
        val textMarcadores = findViewById<TextView>(R.id.textView7)

        val buttonLibretas = findViewById<Button>(R.id.button5)
        val textLibretas = findViewById<TextView>(R.id.textView8)

        val buttonLapices = findViewById<Button>(R.id.button7)
        val textLapices = findViewById<TextView>(R.id.textView9)

        val buttonCuadernos = findViewById<Button>(R.id.button6)
        val textCuadernos = findViewById<TextView>(R.id.textView6)

        val buttonBoligrafos = findViewById<Button>(R.id.button9)
        val textBoligrafos = findViewById<TextView>(R.id.textView12)

        val buttonGrapas = findViewById<Button>(R.id.button8)
        val textGrapas = findViewById<TextView>(R.id.textView11)

        // Función para actualizar stock
        fun actualizarStock(button: Button, stockVar: Int, textView: TextView) {
            button.setOnClickListener {
                if (stockVar > 0) {
                    val nuevoStock = stockVar - 1
                    textView.text = "Stock: $nuevoStock"
                }
            }
        }

        // Asignar eventos a los botones
        actualizarStock(buttonResaltador, stockResaltador, textResaltador)
        actualizarStock(buttonPortaminas, stockPortaminas, textPortaminas)
        actualizarStock(buttonPapelA4, stockPapelA4, textPapelA4)
        actualizarStock(buttonMarcadores, stockMarcadores, textMarcadores)
        actualizarStock(buttonLibretas, stockLibretas, textLibretas)
        actualizarStock(buttonLapices, stockLapices, textLapices)
        actualizarStock(buttonCuadernos, stockCuadernos, textCuadernos)
        actualizarStock(buttonBoligrafos, stockBolígrafos, textBoligrafos)
        actualizarStock(buttonGrapas, stockGrapas, textGrapas)
    }
}
