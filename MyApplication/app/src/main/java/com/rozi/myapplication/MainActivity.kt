package com.rozi.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnpindah: Button = findViewById(R.id.btn_pindah)
        btnpindah.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_pindah -> {
                val intentpindah = Intent(this@MainActivity, MoveAktifity::class.java)
                startActivity(intentpindah)
            }
        }
    }
}