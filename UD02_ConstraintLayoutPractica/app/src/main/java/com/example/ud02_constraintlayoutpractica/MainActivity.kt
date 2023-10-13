package com.example.ud02_constraintlayoutpractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton= findViewById<Button>(R.id.button)
        var textOculto= findViewById<TextView>(R.id.aparece)

        var usuario= findViewById<TextView>(R.id.textView1)
        var contraseña= findViewById<TextView>(R.id.textView2)

        boton.setOnClickListener{
            textOculto.setText("Usuario "+ usuario.text +"Contraseña "+contraseña.text)
        }
    }
}