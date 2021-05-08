package com.example.vakcinisime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.vakcinisime.databinding.FragmentInfoBinding


class InfoFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentInfoBinding>(layoutInflater, R.layout.fragment_info, container, false)

        binding.buttonNext2.setOnClickListener {
            findNavController().navigate(R.id.action_infoFragment_to_impedimentsFragment)
        }

        return binding.root
    }


}