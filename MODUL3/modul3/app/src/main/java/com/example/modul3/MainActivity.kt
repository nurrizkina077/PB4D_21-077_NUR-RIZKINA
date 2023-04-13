package com.example.modul3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi
        val tombol_lanjut = findViewById<Button>(R.id.tombol_lanjut1)
        //membuat listener ketika tombol diklik
        tombol_lanjut.setOnClickListener{
            Intent(this, MainActivity2::class.java).also {
                startActivity(it)
            }
        }

        val tombol_imp: Button = findViewById(R.id.tombol_lanjut2)
        tombol_imp.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.tombol_lanjut2 -> {
                val url = "https://web.facebook.com/watch/?v=219128952675665"
                val web = Intent(Intent.ACTION_VIEW)
                web.setData(Uri.parse(url))
                startActivity(web)
            }
        }
    }
}