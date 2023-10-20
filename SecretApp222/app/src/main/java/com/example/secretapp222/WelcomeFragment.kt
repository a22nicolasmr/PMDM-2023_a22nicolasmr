package com.example.secretapp222

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.navigation.findNavController


class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_welcome, container, false)
        val buttonStart=view.findViewById<Button>(R.id.buton_start)
        buttonStart.setOnClickListener{
            view.findNavController().navigate(R.id.action_welcomeFragment2_to_messageFragment2)
        }
        return  view
    }

}