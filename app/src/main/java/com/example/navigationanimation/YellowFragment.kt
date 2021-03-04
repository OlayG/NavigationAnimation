package com.example.navigationanimation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationanimation.databinding.FragmentYellowBinding

class YellowFragment : Fragment(R.layout.fragment_yellow) {
    private lateinit var binding: FragmentYellowBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentYellowBinding.bind(view)
        binding.btnAction.setOnClickListener {
            val action = YellowFragmentDirections.actionYellowFragmentToGreenFragment()
            findNavController().navigate(action)
        }
    }
}