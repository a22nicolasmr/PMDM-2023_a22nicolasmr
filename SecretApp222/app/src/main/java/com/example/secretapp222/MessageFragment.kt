package com.example.secretapp222

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class MessageFragment : Fragment() {




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragmen
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_message, container, false)
        val buttonStart=view.findViewById<Button>(R.id.butonNext)
        buttonStart.setOnClickListener{
            val message= view.findViewById<EditText>(R.id.introduceMensaje).text.toString()
            var actions= MessageFragmentDirections.actionMessageFragment2ToEncryptFragment2(message)
            view.findNavController().navigate(actions)
        }
        return  view
    }

    }
