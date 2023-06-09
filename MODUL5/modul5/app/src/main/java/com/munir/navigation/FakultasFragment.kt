package com.munir.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.munir.navigation.databinding.FragmentFakultasBinding

/**
 * A simple [Fragment] subclass.
 */
class FakultasFragment : Fragment() {

    lateinit var binding : FragmentFakultasBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFakultasBinding.inflate(inflater)


        return(binding.root)
    }

}
