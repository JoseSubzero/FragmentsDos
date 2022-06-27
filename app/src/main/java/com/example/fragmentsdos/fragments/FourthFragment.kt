package com.example.fragmentsdos.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsdos.R
import com.example.fragmentsdos.databinding.FragmentFourthBinding
import com.example.fragmentsdos.databinding.FragmentThirdBinding


class FourthFragment : Fragment() {
    private var _binding: FragmentFourthBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFourthBinding.inflate(inflater, container, false)


        FragmentFourthBinding.inflate(inflater, container, false)
        return _binding!!.root

    }
}