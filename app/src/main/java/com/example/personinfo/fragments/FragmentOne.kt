package com.example.personinfo.fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.personinfo.R

class FragmentOne() : Fragment(R.layout.fragment_one) {

    private lateinit var personName : EditText
    private lateinit var personLastName : EditText
    private lateinit var personAge : EditText
    private lateinit var picUrl : EditText
    private lateinit var button: Button

    private lateinit var sharedPref : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        personName = view.findViewById(R.id.PersonName)
        personLastName = view.findViewById(R.id.PersonLastName)
        personAge = view.findViewById(R.id.PersonAge)
        picUrl = view.findViewById(R.id.PicUlr)
        button = view.findViewById(R.id.button)



        button.setOnClickListener {

            val name: String = personName.text.toString()
            val lastName: String = personLastName.text.toString()
            val age: String = personAge.text.toString()
            val url: String = picUrl.text.toString()

        }

        sharedPref.edit().putString("name", " ")
        sharedPref.edit().putString("lastName", " ")
        sharedPref.edit().putString("age", " ")
        sharedPref.edit().putString("url", " ")

    }

}