package com.hacybeyker.testunitariosexample.calculadora

import org.junit.runner.RunWith
import org.junit.runners.Suite

/*@RunWith(value = Suite::class)*/
/*@Suite.SuiteClasses(CalculadoraParametrizadaTest::class, CalculadoraTest::class)*/

@RunWith(value = Suite::class)
@Suite.SuiteClasses(CalculadoraTest::class, CalculadoraParametrizadaTest::class)
class CalculadoraSuitTest {

}