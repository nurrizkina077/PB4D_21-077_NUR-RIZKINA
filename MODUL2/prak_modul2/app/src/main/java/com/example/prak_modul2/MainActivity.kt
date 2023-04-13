package com.example.prak_modul2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btn_intent)

        btnIntent.setOnClickListener(this)
    }
    override fun onClick(v:View) {
        when(v.id){
            R.id.btn_intent ->{
                val intentBiasa = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}