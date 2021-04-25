package com.hacybeyker.testunitariosexample.calculadora

import org.junit.*
import java.lang.ArithmeticException

/**
 * Created by Carlos Osorio on 17/04/2021
 */

class CalculadoraTest {

    private var calculadoraNull: Calculadora? = null
    private lateinit var calculadora: Calculadora

    @Before
    fun setUp() {
        calculadora = Calculadora()
        println("Se a ejecutado el metodo setUp()")
    }

    @After
    fun tearDown() {
        //calculadora = null
        println("Se a ejecutado el metodo tearDown()")
    }

    @Test
    fun calculadoraNotNullTest() {
        Assert.assertNotNull("Calculadora debe ser not null", calculadora)
        println("Se a ejecutado el metodo calculadoraNotNullTest()")
    }

    @Test
    fun calculadoraNullTest() {
        Assert.assertNull("Calculadora debe ser null", calculadoraNull)
        println("Se a ejecutado el metodo calculadoraNullTest()")
    }

    /*
    Método a Probar                 |      Entrada      |       Salida Experarada
    sumar(int a, int b)             |a = 10, b=20       |30
    sumar(int a, int b)             |a = 7, b=4         |11
    restar(int a, int b)            |a = 7, b=4         |3
    restar(int a, int b)            |a = 10, b=20       |-10
    */


    @Test
    fun sumar() {
        //setup
        val a = 10
        val b = 20
        val resultadoEsperado = 30
        var resultado = 0
        //Accion
        resultado = calculadora.sumar(a, b)
        //Assert
        Assert.assertEquals(resultadoEsperado, resultado)
    }

    @Test
    fun sumar_ValirInput_ValidExpected_Test() {
        Assert.assertEquals(11, calculadora.sumar(7, 4))
        println("sumar_ValirInput_ValidExpected_Test()")
    }

    @Test
    fun restar_ValidInput_ValidExpected_Test() {
        Assert.assertEquals(3, calculadora.restar(7, 4))
        println("restar_ValidInput_ValidExpected_Test()")
    }

    @Test
    fun restar_ValidInput_ValidNegativeExpected_Test() {
        Assert.assertEquals(-10, calculadora.restar(10, 20))
        println("restar_ValidInput_ValidNegativeExpected_Test")
    }

    @Test
    fun sumarTestExplicado() {
        //Setup
        val calculadoraPrueba = Calculadora()
        val resultadoEsperado = 30
        //Accion
        val resultadoActual = calculadoraPrueba.sumar(10, 20)
        //Assert
        Assert.assertEquals(resultadoEsperado, resultadoActual)
        Assert.assertEquals(resultadoEsperado, calculadoraPrueba.sumar(10, 20))
        println("Se a ejecutado el metodo sumarTestExplicado()")
    }

    @Test
    fun sumarTest() {
        Assert.assertEquals(30, calculadora.sumar(10, 20))
    }

    @Test
    fun ejemploAssert() {
        Assert.assertTrue(1 == 1)
        Assert.assertFalse(1 == 2)
        //Assert.assertNull(calculadora)
        Assert.assertNotNull(calculadora)

        val calculadora1 = Calculadora()
        val calculadora2 = Calculadora()
        val calculadora3 = calculadora1
        //Assert.assertSame(calculadora1, calculadora2)
        Assert.assertSame(calculadora1, calculadora3)
        Assert.assertNotSame(calculadora1, calculadora2)

        Assert.assertEquals("a", "a")
        //Assert.assertEquals("Esto es una prueba AssertEquals con error fa no es a", "fa","a")

        Assert.assertEquals(1.0, 1.4, 0.5)
        //Assert.fail("Fallo detectado manualmente")
    }

    @Test
    fun testSumar() {
    }

    @Test
    fun testRestar() {
    }


    /*
    Método a Probar                 |      Entrada      |       Salida Experarada
    dividir(int a, int b)           |a = 4, b=2         |2
    dividir(int a, int b)           |a = 4, b=0         |Excepcion
    */

    @Test
    fun dividir_ValidInput_ValidExpected_Test() {
        Assert.assertEquals(2, calculadora.dividir(4, 2))
        println("dividir_ValidInput_ValidExpected_Test()")
    }

    @Ignore("Metodo no listo. Ignorar por ahora. Esperando solucionar la division por cero")
    @Test
    fun dividir_NotValidInput_Test() {
        Assert.assertEquals(2, calculadora.dividir(4, 0))
        println("dividir_NotValidInput_Test()")
    }

    @Test(expected = ArithmeticException::class)
    fun dividir_NotValidInput_ByZero_Test() {
        println("dividir_NotValidInput_ByZero_Test()")
        Assert.assertEquals(2, calculadora.dividir(4, 0))
    }

    @Ignore
    @Test(timeout = 600)
    fun operacionLargaDuracion_TimeOut_Test() {
        calculadora.operacionLargaDuracion()
        println("operacionLargaDuracion_TimeOut_Test()")
    }
}