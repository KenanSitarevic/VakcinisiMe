package com.example.vakcinisime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.vakcinisime.databinding.FragmentEndBinding


class EndFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentEndBinding>(layoutInflater, R.layout.fragment_end, container, false)

        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_endFragment_to_startFragment)
        }

        return binding.root
    }



}