package com.example.bridginglibrarydemo

public class Counter {
    var count = 0

    fun countIncrease():Int{
       return count++
    }

    fun countDecrease():Int{
       return count--
    }
}