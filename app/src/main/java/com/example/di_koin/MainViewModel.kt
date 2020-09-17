package com.example.di_koin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val value = MutableLiveData<String>()

    fun increase() {
        var currentVal: Int = if (value.value == null) 0 else value.value!!.toInt()
        value.value = (currentVal + 1).toString()
    }

    fun subtract() {
        var currentVal: Int = if (value.value == null) 0 else value.value!!.toInt()
        value.value = (currentVal - 1).toString()
    }
}