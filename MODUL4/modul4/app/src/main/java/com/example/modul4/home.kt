package com.example.modul4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController

class home : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnSubmit = view.findViewById<Button>(R.id.submitButton)

        btnSubmit.setOnClickListener {
            val contentNama = view.findViewById<EditText>(R.id.inputnama).text.toString()
            val contentJudul = view.findViewById<EditText>(R.id.inputjudul).text.toString()
            val contenthari = view.findViewById<EditText>(R.id.inputhari).text.toString()

            if (contentNama.equals("") || contentJudul.equals("") || contenthari.equals("")) {
                Toast.makeText(context, "Mohon isi data terlebih dahulu",Toast.LENGTH_SHORT).show()
            }else{
                val bundle = Bundle()
                bundle.putString("keyNama",contentNama)
                bundle.putString("keyJudul",contentJudul)
                bundle.putString("keyHari",contenthari)

                Toast.makeText(context, "Submit Berhasil",Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_home2_to_info2, bundle)
            }
        }
    }
}