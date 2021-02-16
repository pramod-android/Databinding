package com.marathideveloper.databindingkotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marathideveloper.databindingkotlinexample.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val user=User("Pramod","Patil",25,true)
        binding.user=user


    }
}