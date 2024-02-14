package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel:MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.mainActivityObject = this

        viewModel.result.observe(this) {
            binding.resultOfCalculation = it
        }
    }
    fun buttonSumClick(receivedNumber1:String, receivedNumber2:String) {
        viewModel.doSum(receivedNumber1, receivedNumber2)
    }

    fun buttonSubtractClick(receivedNumber1:String, receivedNumber2:String) {
        viewModel.doSubtract(receivedNumber1, receivedNumber2)
    }

    fun buttonMultiplyClick(receivedNumber1:String, receivedNumber2:String) {
        viewModel.doMultiply(receivedNumber1, receivedNumber2)
    }

    fun buttonDivideClick(receivedNumber1:String, receivedNumber2:String) {
        viewModel.doDivide(receivedNumber1, receivedNumber2)
    }
}