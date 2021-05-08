package com.example.vakcinisime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.vakcinisime.databinding.FragmentVaccineBinding


class VaccineFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentVaccineBinding>(layoutInflater, R.layout.fragment_vaccine, container, false)

        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_vaccineFragment_to_summaryFragment)
        }

        return binding.root
    }



}