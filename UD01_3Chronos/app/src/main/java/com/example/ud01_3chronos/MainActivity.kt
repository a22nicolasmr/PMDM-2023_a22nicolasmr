package com.example.ud01_3chronos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {

    lateinit var cronometro: Chronometer
    var running = false
    var offset = 0L
    val RUNNING_KEY = "running"
    val OFFSET_KEY = "offset"
    val BASE_KEY= "base"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cronometro = findViewById(R.id.chrono)
        val start = findViewById<Button>(R.id.btn_start)
        val pause = findViewById<Button>(R.id.btn_pause)
        val reboot = findViewById<Button>(R.id.btn_restart)
        if(savedInstanceState!=null){
            offset = savedInstanceState.getLong(OFFSET_KEY)
            running = savedInstanceState.getBoolean(RUNNING_KEY)
            if (running) {
                cronometro.base = savedInstanceState.getLong(BASE_KEY)
                cronometro.start()
            }
            if (!running) {
                cronometro.base = SystemClock.elapsedRealtime()-savedInstanceState.getLong(OFFSET_KEY)
            }
        }
        start.setOnClickListener {
            if (!running) {
                cronometro.base = SystemClock.elapsedRealtime()-offset
                cronometro.start()
                running = true
            }
        }
        pause.setOnClickListener {
            if (running) {
                offset = SystemClock.elapsedRealtime() - cronometro.base
                cronometro.stop()
                running = false
            }
        }
        reboot.setOnClickListener {
            if (!running) {
                offset = 0L
                cronometro.base = SystemClock.elapsedRealtime()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putBoolean(RUNNING_KEY,running)
        outState.putLong(OFFSET_KEY,offset)
        outState.putLong(BASE_KEY,cronometro.base)
        super.onSaveInstanceState(outState)
    }

    override fun onStop() {
        stopChrono()
        super.onStop()
    }

    override fun onRestart() {
        stopChrono()
        super.onRestart()
    }

    override fun onPause() {
        startChrono()
        super.onPause()
    }

    override fun onResume() {
        startChrono()
        super.onResume()
    }
    fun startChrono(){
        if (running) {
            cronometro.base = SystemClock.elapsedRealtime()-offset
            cronometro.start()

        }
    }
    fun stopChrono(){
        if (running) {
            offset = SystemClock.elapsedRealtime() - cronometro.base
            cronometro.stop()

        }
    }
}