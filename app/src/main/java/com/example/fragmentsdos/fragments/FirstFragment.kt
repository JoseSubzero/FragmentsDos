package com.example.fragmentsdos.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsdos.R
import com.example.fragmentsdos.databinding.FragmentFirstBinding
import kotlin.random.Random


class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)


        FragmentFirstBinding.inflate(inflater, container, false)
        return _binding!!.root

    }
    }

