package com.hacybeyker.testunitariosexample.mockitomvp

class LoginModel(private val presenter: Login.Presenter) : Login.Model {

    override fun validaUser(user: String, password: String) {
        if (user == "Carlos" && password == "123")
            presenter.usuarioValido()
        else
            presenter.error()
    }
}