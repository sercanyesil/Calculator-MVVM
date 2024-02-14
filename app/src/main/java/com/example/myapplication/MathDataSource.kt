package com.example.myapplication

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MathDataSource {
    suspend fun doSum(receivedNumber1:String, receivedNumber2:String) : String =
        withContext(Dispatchers.IO) {
            val number1 = receivedNumber1.toDouble()
            val number2 = receivedNumber2.toDouble()
            val sum = number1 + number2

            return@withContext sum.toString()
        }

    suspend fun doMultiply(receivedNumber1:String, receivedNumber2:String) : String =
        withContext(Dispatchers.IO) {
            val number1 = receivedNumber1.toDouble()
            val number2 = receivedNumber2.toDouble()
            val multiplication = number1 * number2

            return@withContext multiplication.toString()
        }

    suspend fun doSubtract(receivedNumber1: String, receivedNumber2: String) : String =
        withContext(Dispatchers.IO) {
            val number1 = receivedNumber1.toDouble()
            val number2 = receivedNumber2.toDouble()
            val subtraction = number1 - number2

            return@withContext subtraction.toString()
        }

    suspend fun doDivide(receivedNumber1: String, receivedNumber2: String) : String =
        withContext(Dispatchers.IO) {
            val number1 = receivedNumber1.toDouble()
            val number2 = receivedNumber2.toDouble()

            if (number2 == 0.0) {
                // Handle division by zero
                return@withContext "Cannot divide by zero"
            } else {
                val division = number1 / number2
                return@withContext division.toString()
            }
        }
}