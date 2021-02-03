package com.example.hw3x2b

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentTwo : Fragment(R.layout.fragment_two) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val s: String
        arguments.let {
            s = it?.getString(ARG).toString()
        }

        view.findViewById<Button>(R.id.show_messages).setOnClickListener() {
            Toast.makeText(view.context, "Text from FragmentOne: $s", Toast.LENGTH_SHORT).show()
        }
    }
}