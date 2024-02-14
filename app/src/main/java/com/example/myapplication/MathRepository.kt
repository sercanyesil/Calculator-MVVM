package com.example.myapplication

class MathRepository {
    var mds = MathDataSource()

    suspend fun doSum(receivedNumber1:String, receivedNumber2:String) : String = mds.doSum(receivedNumber1, receivedNumber2)

    suspend fun doMultiply(receivedNumber1:String, receivedNumber2:String) : String = mds.doMultiply(receivedNumber1, receivedNumber2)

    suspend fun doSubtract(receivedNumber1:String, receivedNumber2:String) : String = mds.doSubtract(receivedNumber1, receivedNumber2)

    suspend fun doDivide(receivedNumber1:String, receivedNumber2:String) : String = mds.doDivide(receivedNumber1, receivedNumber2)

}