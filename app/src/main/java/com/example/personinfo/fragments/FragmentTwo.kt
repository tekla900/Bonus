package com.example.personinfo.fragments

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.personinfo.R

class FragmentTwo : Fragment(R.layout.fragment_two){

    private lateinit var textView: TextView
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView
    private lateinit var imageView: ImageView

    private lateinit var sharedPref : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        textView = view.findViewById(R.id.textView)
        textView2 = view.findViewById(R.id.textView2)
        textView3 = view.findViewById(R.id.textView3)
        imageView = view.findViewById(R.id.imageView)

        val url: String = " "

        textView.text = sharedPref.getString("name", " ")
        textView2.text = sharedPref.getString("lastName", " ")
        textView3.text = sharedPref.getString("age", " ")
        url.text= sharedPref.getString("url", " ")

        Glide.with(imageView.context)
            .load(url)
            .placeholder(R.drawable.ic_launcher_foreground)
            .centerCrop()
            .into(imageView)


    }

}