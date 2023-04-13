package com.example.list_film

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.makanankhasjawa.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val filmList = listOf<film>(
            film(
                R.drawable.rumah,
                "Ku Kira Kau Rumah",
                "Lorem ipsum lorem lorem ipsum"
            ),
            film(
                R.drawable.glen,
                "12 Cerita Glen Anggara",
                "lorem lorem ipsum"
            ),
            film(
                R.drawable.laskar,
                "Laskar Pelangi",
                "Lorem ipsum lorem lorem ipsum"
            ),
            film(
                R.drawable.layangan,
                "Layangan Putus",
                "Lorem ipsum lorem lorem ipsum"
            ),
            film(
                R.drawable.roy,
                "Balada Si Roy",
                "Lorem ipsum lorem lorem ipsum"
            ),
            film(
                R.drawable.sayap,
                "Sayap-Sayap Patah",
                "Lorem ipsum lorem lorem ipsum"
            ),
            film(
                R.drawable.sri,
                "Sri Asih",
                "Lorem ipsum lorem lorem ipsum"
            ),
            film(
                R.drawable.surga,
                "Atas Nama Surga",
                "Lorem ipsum lorem lorem ipsum"

            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.daftar_makanan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = filmAdapter(this,filmList){

        }
    }
}