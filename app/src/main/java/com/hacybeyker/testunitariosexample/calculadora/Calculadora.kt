package com.hacybeyker.testunitariosexample.calculadora

/**
 * Created by Carlos Osorio on 16/04/2021
 */

class Calculadora {
    fun sumar(numberOne: Int, numberTwo: Int): Int {
        return numberOne + numberTwo
    }

    fun restar(numberOne: Int, numberTwo: Int): Int {
        return numberOne - numberTwo
    }

    fun dividir(numberOne: Int, numberTwo: Int): Int {
        return numberOne / numberTwo
    }

    fun operacionLargaDuracion(){
        Thread.sleep(1000)
    }
}