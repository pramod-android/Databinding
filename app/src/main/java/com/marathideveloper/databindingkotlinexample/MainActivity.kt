
package com.marathideveloper.databindingkotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.marathideveloper.databindingkotlinexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.viewmodel = viewModel
        binding.lifecycleOwner = this


        viewModel.emailText.observe(this, Observer {


            Log.e("TAG", "onCreate: "+it)
            viewModel.error.value = "error"
        })
      //  binding.textViewId.text ="pramod"
    }
}