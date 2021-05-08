package com.example.vakcinisime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.vakcinisime.databinding.FragmentAboutBinding
import com.example.vakcinisime.databinding.FragmentStartBinding


class AboutFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentAboutBinding>(layoutInflater, R.layout.fragment_about, container, false)
        return binding.root
    }



}