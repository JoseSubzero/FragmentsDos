package com.example.fragmentsdos.fragments

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.fragmentsdos.R
import com.google.android.material.tabs.TabLayout


class DialogFragment : DialogFragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        dialog!!.setTitle("Dialog Fragment")
        val view = inflater.inflate(R.layout.fragment_dialog, container, false)
        return view
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(context)
            .setMessage(R.string.dialogo_confirmar_borrado)
            .setPositiveButton(R.string.Aceptar){dialog, id ->
                Toast.makeText(this.context, "Has confirmado el borrado", Toast.LENGTH_SHORT).show()

            }
            .setNegativeButton(R.string.Cancelar){ dialog, id ->
                Toast.makeText(this.context, "Has cancelado el borrado", Toast.LENGTH_SHORT).show()

            }
            .create()
    }
    companion object{
        const val TAG = "PurchaseConfirmationDialog"
    }




}