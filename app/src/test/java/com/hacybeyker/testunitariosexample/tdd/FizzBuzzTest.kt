package com.hacybeyker.testunitariosexample.tdd

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by Carlos Osorio on 24/04/2021
 */

/**
Como implementar TDD en una empresa Real:
1.- El product Manager escribe la historia de usuario
2.- Se escriben todos los criterios de aceptación de esa historia de usuario.
3.- Se coge el primer criterio de aceptación y se traduce a prueba unitaria.
4.- Comprobamos que el test falla
5.- Se escribe el código para hacer pasar el test
6.- Se ejecutas todos nuestros test
7.- Refactorizamos el código
8.- Volvemos a pasar todas las pruebas
Ventajas de TDD. El código esta testado de serie. Es decir no hay un método que no este testado antes de lanzar a producción.
No hay código innecesario, ya que los test son códigos de uso que nos ha indicado nuestro director de proyecto.
 */

class FizzBuzzTest {

    /**
    //METODO////////////////////////////////////////ESPECIFICACIOM//////////////////////////////////////////////////////////
    ------------------------------------------------------------------------------------------------------------------------
    String of(int numero)
    |1.- Si es divisible por 3 entonces devolver "Fizz"
    |2.- Si es divisible por 5 entonces devolver "Buzz"
    |3.- Si es divisible por 3 y 5 entonces devolver "FizzBuzz"
    |4.- Si nada de lo de arriba ocurre devolver el número en String

    Método a Probar                           |   Entrada       |  Salida Experarada
    of(int numero)                            |numero = 0       |0
    of(int numero)                            |numero = 1       |1
    of(int numero)                            |numero = 2       |2
    of(int numero)                            |numero = 3       |Fizz
    of(int numero)                            |numero = 4       |4
    of(int numero)                            |numero = 5       |Buzz
    of(int numero)                            |numero = 6       |Fizz
    of(int numero)                            |numero = 7       |7
    of(int numero)                            |numero = 8       |8
    of(int numero)                            |numero = 9       |Fizz
    of(int numero)                            |numero = 10      |Buzz
    of(int numero)                            |numero = 15      |FizzBuzz
    of(int numero)                            |numero = 100     |Buzz
    -----------------------------------------------------------------------------------------
     */

    private lateinit var fizzBuzz: FizzBuzz

    @Before
    fun setUp() {
        fizzBuzz = FizzBuzz()
    }

    @Test
    fun `Cuando es 0 devuelve 0`() {
        Assert.assertEquals("0", fizzBuzz.of(0))
    }

    @Test
    fun `Cuando es 1 devuelve 1`() {
        Assert.assertEquals("1", fizzBuzz.of(1))
    }

    @Test
    fun `Cuando es 2 devuelve 2`() {
        Assert.assertEquals("2", fizzBuzz.of(2))
    }

    @Test
    fun `Cuando es 3 devuelve Fizz`() {
        Assert.assertEquals("Fizz", fizzBuzz.of(3))
    }

    @Test
    fun `Cuando es 5 devuelve Buzz`() {
        Assert.assertEquals("Buzz", fizzBuzz.of(5))
    }

    @Test
    fun `Cuando es 6 devuelve Fizz`() {
        Assert.assertEquals("Fizz", fizzBuzz.of(6))
    }

    @Test
    fun `Cuando es 10 devuelve Buzz`() {
        Assert.assertEquals("Buzz", fizzBuzz.of(10))
    }

    @Test
    fun `Cuando es 15 devuelve FizzBuzz`() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.of(15))
    }

    @Test
    fun `Cuando es 100 devuelve Buzz`() {
        Assert.assertEquals("Buzz", fizzBuzz.of(100))
    }
}