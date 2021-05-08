package com.example.vakcinisime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.vakcinisime.databinding.FragmentImpedimentsBinding


class ImpedimentsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentImpedimentsBinding>(layoutInflater, R.layout.fragment_impediments, container, false)

        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_impedimentsFragment_to_priorityFragment)
        }

        return binding.root
    }

}