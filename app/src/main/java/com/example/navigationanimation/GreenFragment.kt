package com.example.navigationanimation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationanimation.databinding.FragmentGreenBinding

class GreenFragment : Fragment(R.layout.fragment_green) {

    private lateinit var binding: FragmentGreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentGreenBinding.bind(view)
        binding.btnAction.setOnClickListener {
            val action = GreenFragmentDirections.actionGreenFragmentToBlueFragment()
            findNavController().navigate(action)
        }
    }
}