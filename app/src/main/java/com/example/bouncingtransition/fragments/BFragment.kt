package com.example.bouncingtransition.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bouncingtransition.R
import com.example.bouncingtransition.databinding.FragmentABinding
import com.example.bouncingtransition.databinding.FragmentBBinding

class BFragment : Fragment() {

    lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBBinding.inflate(layoutInflater)

        binding.button.setOnClickListener{
            findNavController().navigateUp()
        }

        return binding.root
    }

}