package com.hacybeyker.testunitariosexample.calculadora

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class CalculadoraParametrizadaTest(
    private val numero1: Int,
    private val numero2: Int,
    private val resultadoEsperado: Int
) {

    private var calculadora: Calculadora? = null

    /*
    Ejemplo en nuestra división queremos hacer 5 pruebas
    Positivo / Positivo = Positivo
    Positivo / Negativo = Negativo
    Negativo / Positivo = Negativo
    Negativo / Negativo = Positivo
    Positivo / 0 = Excepción

    Método a Probar                 |      Entrada      |       Salida Experarada
    dividir(int a, int b)           |a = 6, b=2         |3
    dividir(int a, int b)           |a = 6, b=-2        |-3
    dividir(int a, int b)           |a = -6, b=2        |-3
    dividir(int a, int b)           |a = -6, b=-2       |3
    dividir(int a, int b)           |a = -6, b=0        |Excepción
     */

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun obtenerDatosPruebaTest(): Iterable<Array<Any>> {
            val list: MutableList<Array<Any>> = ArrayList()
            list.add(arrayOf(6, 2, 3))
            list.add(arrayOf(6, -2, -3))
            list.add(arrayOf(-6, 2, -3))
            list.add(arrayOf(-6, -2, 3))
            /*list.add(arrayOf(-6, 0, 3))*/
            return list
        }
    }

    @Before
    fun setUp() {
        calculadora = Calculadora()
    }

    @Test
    fun dividirTest() {
        Assert.assertEquals(resultadoEsperado, calculadora?.dividir(numero1, numero2))
    }
}