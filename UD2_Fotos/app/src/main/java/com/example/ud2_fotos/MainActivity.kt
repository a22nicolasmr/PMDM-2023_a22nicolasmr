package com.example.ud2_fotos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textoSantiago = findViewById<TextView>(R.id.textoSantiago)
        val textoOurense = findViewById<TextView>(R.id.textoOrense)
        val imagenSantiago = findViewById<ImageView>(R.id.imagenSantiago)
        val imagenOurense = findViewById<ImageView>(R.id.imagenOrense)

        imagenSantiago.setOnClickListener{
            textoSantiago.setVisibility(View.VISIBLE)
        }
        imagenOurense.setOnClickListener{
            textoSantiago.setVisibility(View.VISIBLE)
        }

    }



}
