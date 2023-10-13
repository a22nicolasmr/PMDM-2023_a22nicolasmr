package com.example.ud02_3layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button=findViewById<Button>(R.id.button )
        var nombre=findViewById<TextView>(R.id.button)
        var salida=findViewById<TextView>(R.id.salida)

        button.setOnClickListener{salida.text="llamando a"+nombre.text}
    }

}