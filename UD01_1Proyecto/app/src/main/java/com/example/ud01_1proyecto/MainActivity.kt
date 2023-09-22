package com.example.ud01_1proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSearch = findViewById<Button>(R.id.button)
        buttonSearch.setOnClickListener {
            val spinnerWineTypes= findViewById<Spinner>(R.id.wineType)
            val textTypesWines =findViewById<TextView>(R.id.textTypesWines)
            textTypesWines.text=getWines(spinnerWineTypes.selectedItemId).joinToString(",")

            textTypesWines.text ="color seleccionado= ${spinnerWineTypes.selectedItem}"
        }


        }
    fun getWines(id:Long):List<String> = when(id){
        0L->listOf("Albariño","Moscato","Rosado")
        1L->listOf("Rioja","Ribera del Duero","Toro")
        2L->listOf("Cabernet","Franc","Merlot")
        else ->
            listOf()
        }
}
