package com.example.secretapp222

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class EncryptFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var mensaje =EncryptFragmentArgs.fromBundle(requireArguments()).mensaje
        mensaje.uppercase()
        val chararray = mensaje.toCharArray()
        val iterator= chararray.iterator()
        var cifrado=""

        while (iterator.hasNext()){

            cifrado+=(iterator.nextChar().code+3).toChar()
        }

        var view= inflater.inflate(R.layout.fragment_encrypt, container, false)
        view.findViewById<TextView>(R.id.encrypt_text).text= cifrado
        return  view
    }
    fun cifrado( mensaje:String)=mensaje.map{
        if(it.isLetter()){
            it.uppercaseChar().code.minus('A'.code).plus(3).mod(26).plus('A'.code).toChar()
        }else{

        }
    }.joinToString ()

}