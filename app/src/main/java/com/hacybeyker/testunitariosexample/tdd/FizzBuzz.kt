package com.hacybeyker.testunitariosexample.tdd

/**
 * Created by Carlos Osorio on 24/04/2021
 */

class FizzBuzz {

    fun of(number: Int): String {
        var valorRetorno = ""
        if (number == 0)
            return number.toString()
        if (number % 3 == 0)
            valorRetorno += "Fizz"
        if (number % 5 == 0)
            valorRetorno += "Buzz"
        return if (valorRetorno.isEmpty()) number.toString() else valorRetorno
    }
}