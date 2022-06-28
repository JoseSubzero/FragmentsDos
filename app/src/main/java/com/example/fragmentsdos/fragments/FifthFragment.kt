package com.example.fragmentsdos.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentsdos.R
import com.example.fragmentsdos.databinding.FragmentFifthBinding
import com.example.fragmentsdos.databinding.FragmentThirdBinding
import com.google.android.material.snackbar.Snackbar


class FifthFragment : Fragment() {
    private var _binding: FragmentFifthBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.fragment_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when(item.itemId){
            R.id.opCopy -> Snackbar.make(binding.root, "Copy clicked", Snackbar.LENGTH_SHORT).setBackgroundTint(
                Color.BLUE).show()
            R.id.opPaste -> Snackbar.make(binding.root, "Paste clicked", Snackbar.LENGTH_SHORT).show()
            R.id.opCut -> Snackbar.make(binding.root, "Cut clicked", Snackbar.LENGTH_SHORT).show()
        }
        return true
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFifthBinding.inflate(inflater, container, false)


        FragmentFifthBinding.inflate(inflater, container, false)
        return _binding!!.root

    }
}