package br.edu.fatecpg.temperatura

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtTemp = findViewById<EditText>(R.id.edtTemp)
        val btnCalc = findViewById<Button>(R.id.btnCalc)
        val txvTemp = findViewById<TextView>(R.id.txvTemp)

        btnCalc.setOnClickListener{
            val temp = edtTemp.text.toString().toDouble()
            val fahrenheit = temp * 1.8 + 32

            txvTemp.text = "A temperatura em fahrenheit é: ${fahrenheit.toString()}"
        }
    }
}