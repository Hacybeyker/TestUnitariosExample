package com.hacybeyker.testunitariosexample.calculadora

import org.junit.*

class CalculadoraTestBeforeClass {

    var calculadoraBefore: Calculadora? = null
    var numeroBefore: Int = 0

    companion object {
        var calculadoraBeforeClass: Calculadora? = null
        var numeroBeforeClass: Int = 0

        @JvmStatic
        @BeforeClass
        fun beforeClass() {
            calculadoraBeforeClass = Calculadora()
            numeroBeforeClass = 3
            println("Se ha realizado el beforeClass()")
        }

        @JvmStatic
        @AfterClass
        fun afterClass() {
            calculadoraBeforeClass = null
            numeroBeforeClass = 0
            println("Se ha realizado el afterClass()")
        }
    }


    @Before
    fun before() {
        calculadoraBefore = Calculadora()
        numeroBefore = 3
        println("Se ha realizado el before()")
    }

    @After
    fun after() {
        calculadoraBefore = null
        numeroBefore = 0
        println("Se ha realizado el after()")
    }

    @Test
    fun pruebaBeforeVsBeforeClass() {
        numeroBeforeClass += 3
        numeroBefore += 3
        Assert.assertEquals("numeroBeforeClass: ", 6, numeroBeforeClass)
        Assert.assertEquals("numeroBefore: ", 6, numeroBefore)
        println("Se ha realizado el pruebaBeforeVsBeforeClass()")
    }

    @Test
    fun pruebaBeforeVsBeforeClass2() {
        numeroBeforeClass += 3
        numeroBefore += 3
        Assert.assertEquals("numeroBeforeClass: ", 9, numeroBeforeClass)
        Assert.assertEquals("numeroBefore: ", 6, numeroBefore)
        println("Se ha realizado el pruebaBeforeVsBeforeClass2()")
    }
}