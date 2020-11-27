 package com.angelo.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    //We can save values or states using ViewModel
    var number = 0
    fun addNumber(){
        number++
    }

}