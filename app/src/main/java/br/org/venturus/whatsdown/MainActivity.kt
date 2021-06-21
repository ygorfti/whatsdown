package br.org.venturus.whatsdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtHello = findViewById<TextView>(R.id.txtHello)
        txtHello.text = "Que legal! Funcionou."
    }
}