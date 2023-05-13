package com.example.modul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class info : Fragment() {

    lateinit var contentNama: String
    lateinit var contentJudul: String
    lateinit var contenthari: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        contentNama = arguments?.getString("keyNama").toString()
        contentJudul = arguments?.getString("keyJudul").toString()
        contenthari = arguments?.getString("keyHari").toString()

        val tNama = view.findViewById<TextView>(R.id.textnama)
        val tJudul = view.findViewById<TextView>(R.id.textjudul)
        val tHari = view.findViewById<TextView>(R.id.texthari)
        val btnBack = view.findViewById<Button>(R.id.button)

        tNama.text = "$contentNama"
        tJudul.text = "$contentJudul"
        tHari.text = "$contenthari"

        btnBack.setOnClickListener {
            findNavController().navigate(R.id.action_info2_to_masuk2)
        }

    }

}