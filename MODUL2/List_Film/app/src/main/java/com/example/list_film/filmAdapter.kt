package com.example.list_film

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.makanankhasjawa.R

class filmAdapter (private val context:Context, private val film: List<film>, val listener:(film) -> Unit)
    : RecyclerView.Adapter<filmAdapter.filmViewHolder>(){

    class filmViewHolder (view: View): RecyclerView.ViewHolder(view){

        val imgfilm = view.findViewById<ImageView>(R.id.img_item_photo)
        val namefilm = view.findViewById<TextView>(R.id.tv_item_name)
        val descfilm = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindview(makanankhasjawa: film, listener: (film) -> Unit){
            imgfilm.setImageResource(makanankhasjawa.imgfilm)
            namefilm.text = makanankhasjawa.namefilm
            descfilm.text = makanankhasjawa.descMfilm
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): filmViewHolder {
        return filmViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_film, parent, false)
        )
    }

    
    override fun onBindViewHolder(holder: filmViewHolder, position: Int) {
        holder.bindview(film[position], listener)
    }

    override fun getItemCount(): Int = film.size

}