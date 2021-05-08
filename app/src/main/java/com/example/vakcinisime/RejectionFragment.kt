package com.example.vakcinisime

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.vakcinisime.databinding.FragmentRejectionBinding


class RejectionFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentRejectionBinding>(layoutInflater, R.layout.fragment_rejection, container, false)

        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_rejectionFragment_to_startFragment)
        }

        return binding.root
    }

}