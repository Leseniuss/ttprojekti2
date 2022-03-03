package com.example.ttprojekti2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class fragment3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_fragment3, container, false)

        val button=view.findViewById<Button>(R.id.frag31)
        button.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragment3_to_fragment1)
        }


        val button2=view.findViewById<Button>(R.id.frag32)
        button2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragment3_to_fragment2)
        }

        return view
    }

}