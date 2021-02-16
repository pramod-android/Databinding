package com.marathideveloper.databindingkotlinexample

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MainActivityViewModel : ViewModel() {

    var textData: MutableLiveData<String> = MutableLiveData()
    var btntext: MutableLiveData<String> = MutableLiveData()
    var edtText: MutableLiveData<String> = MutableLiveData()
    var error: MutableLiveData<String> = MutableLiveData()
    var emailText: MutableLiveData<String> = MutableLiveData()

    init {
        textData.value = "Pramod Patil"
        btntext.value = "Ok"
    }


    fun onButtonClick() {
        textData.value= "Santosh"
        btntext.value= "Done"

    }

/*    var emailTextWatcher :TextWatcher = object :TextWatcher{
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
          //  TODO("Not yet implemented")
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
          //  TODO("Not yet implemented")
        }

        override fun afterTextChanged(p0: Editable?) {
          //  TODO("Not yet implemented")
            Log.e("TAG", "afterTextChanged: "+p0 )
        }

    }*/

}