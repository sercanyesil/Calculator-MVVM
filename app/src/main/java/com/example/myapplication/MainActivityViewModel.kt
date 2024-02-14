package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {
    var result = MutableLiveData("0")
    var mathRepo = MathRepository()

    fun doSum(receivedNumber1:String, receivedNumber2: String) {
        CoroutineScope(Dispatchers.Main).launch {
            result.value = mathRepo.doSum(receivedNumber1, receivedNumber2)
        }
    }

    fun doMultiply(receivedNumber1:String, receivedNumber2: String) {
        CoroutineScope(Dispatchers.Main).launch {
            result.value = mathRepo.doMultiply(receivedNumber1, receivedNumber2)
        }
    }

    fun doSubtract(receivedNumber1:String, receivedNumber2: String) {
        CoroutineScope(Dispatchers.Main).launch {
            result.value = mathRepo.doSubtract(receivedNumber1, receivedNumber2)
        }
    }

    fun doDivide(receivedNumber1:String, receivedNumber2: String) {
        CoroutineScope(Dispatchers.Main).launch {
            result.value = mathRepo.doDivide(receivedNumber1, receivedNumber2)
        }
    }
}