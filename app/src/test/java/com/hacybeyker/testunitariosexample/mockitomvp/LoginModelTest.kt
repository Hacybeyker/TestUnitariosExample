package com.hacybeyker.testunitariosexample.mockitomvp

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class LoginModelTest {

    @Mock
    private lateinit var presenter: Login.Presenter

    private lateinit var model: LoginModel

    @Before
    fun setUp() {
        model = LoginModel(presenter)
    }

    @Test
    fun shouldSuccessWithValidUserAndPasswordTest() {
        model.validaUser("Carlos", "123")
        Mockito.verify(presenter).usuarioValido()
    }

    @Test
    fun shouldNotSuccessWithValidUserAndPasswordTest() {
        model.validaUser("carlos", "321")
        Mockito.verify(presenter).error()
    }
}