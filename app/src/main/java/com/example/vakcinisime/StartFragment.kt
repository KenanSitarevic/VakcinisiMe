package com.example.vakcinisime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.vakcinisime.databinding.FragmentStartBinding


class StartFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentStartBinding>(layoutInflater, R.layout.fragment_start, container, false)
        return binding.root
    }


}