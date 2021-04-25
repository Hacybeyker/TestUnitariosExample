package com.hacybeyker.testunitariosexample.mockitomvp

import junit.framework.TestCase
import org.junit.Assert
import org.junit.Before
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.Spy
import org.mockito.junit.MockitoJUnitRunner

//nos permite hacer mock de las interfaces y clases
//nos permite programar un comportamiento
//nos permite ejecutar un metodo
//nos permite verificar

@RunWith(MockitoJUnitRunner::class)
class LoginPresenterTest : TestCase() {

    @Mock
    private lateinit var view: Login.View

    /*@Mock
    private lateinit var model: Login.Model*/

    private lateinit var presente: LoginPresenter

    @Before
    fun setUps() {
        presente = LoginPresenter(view)
    }

    @Test
    fun shouldShowErrorMessageWhenUserOrPasswordIsWrongTest() {
        //2. Nos permite programar un coportamiento
        `when`(view.getUserName()).thenReturn("janeth")
        `when`(view.getPassword()).thenReturn("321")
        //3. Ejecutamos un metodo
        presente.validarUser(view.getUserName(), view.getPassword())
        //4. Verificar que la vista ejecuta el metodo Error
        verify(view).error()
    }

    @Test
    fun shouldCallUsuarioValidWhenUserAndPasswordAreRightTest() {
        `when`(view.getUserName()).thenReturn("Carlos")
        `when`(view.getPassword()).thenReturn("123")
        Assert.assertEquals("Carlos", view.getUserName())
        presente.validarUser(view.getUserName(), view.getPassword())
        verify(view).usuarioValido()
    }

    @Test
    fun shouldthrowingException() {
        `when`(view.getUserName()).thenThrow(RuntimeException::class.java)
        try {
            view.getUserName()
        } catch (ex: RuntimeException) {
        }
    }

    @Test
    fun shouldCallUsuarioValidWhenUserAndPasswordAreRightDoReturnTest() {
        doReturn("Carlos").`when`(view).getUserName()
        Assert.assertEquals("Carlos", view.getUserName())
    }

    @Test
    fun shouldCallUsuarioValidWhenUserAndPasswordAreRightTest2() {
        `when`(view.getUserName()).thenReturn("Carlos")
        `when`(view.getPassword()).thenReturn("123")
        Assert.assertEquals("Carlos", view.getUserName())
        presente.validarUser(view.getUserName(), view.getPassword())
        verify(view).usuarioValido()
        verify(view, times(1)).usuarioValido()//que sea invocado 1 vez
        /*verify(view, never()).usuarioValido()//que nunca sea invocado
        verify(view, atLeast(4)).usuarioValido()//veces como minimo que sea invocado
        verify(view, atMost(7)).usuarioValido()//veces como maximo que sea invocado
        verify(view, only()).usuarioValido()//solo si se invoca el metodo y otros no*/
    }

    @Mock
    lateinit var mockList: ArrayList<String>

    @Spy
    lateinit var spyList: ArrayList<String>

    @Test
    fun spyTest() {
        //El spy si crea la intancia real y ademas reastrea las interacciones del mismo
        //a diferencia del mock que solo crea como un cascaron de la clase que crea las interacciones del mismo
        spyList.add("one")
        spyList.add("two")

        verify(spyList).add("one")
        verify(spyList).add("two")

        Assert.assertEquals(2, spyList.size)
    }

    @Ignore
    @Test
    fun mockTest() {
        mockList.add("one")
        mockList.add("two")

        verify(mockList).add("one")
        verify(mockList).add("two")

        Assert.assertEquals(2, spyList.size)
    }


}

//doReturn vs `when`
//doReturn no ejeuta el contenido del metodo mientras que
//`when` si lo ejecuta
//por lo tanto `when`  si hace la llamada real al metodo mientras que doReturn nop.