package com.example.fragmentsdos.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsdos.R
import com.example.fragmentsdos.databinding.FragmentFifthBinding
import com.example.fragmentsdos.databinding.FragmentThirdBinding


class FifthFragment : Fragment() {
    private var _binding: FragmentFifthBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFifthBinding.inflate(inflater, container, false)


        FragmentFifthBinding.inflate(inflater, container, false)
        return _binding!!.root

    }
}