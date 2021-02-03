package com.example.hw3x2b

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentOne : Fragment(R.layout.fragment_one) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnNavigate = view.findViewById<Button>(R.id.btn_navigates)
        val edText = view.findViewById<EditText>(R.id.NameField)
        btnNavigate.setOnClickListener() {
            if (edText.text.isNullOrEmpty()) {
                Toast.makeText(view.context, "Text is empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val activity = view.context as AppCompatActivity
            activity.supportFragmentManager.beginTransaction().apply {
                findNavController().navigate(R.id.action_fragmentOne_to_fragmentTwo, bundleOf(Pair(ARG, edText.text.toString())))
            }
        }
    }
}