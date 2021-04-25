package com.hacybeyker.testunitariosexample.mockitomvp

class LoginPresenter(private val view: Login.View?) : Login.Presenter {

    private var model: Login.Model = LoginModel(this)

    override fun validarUser(user: String, password: String) {
        view?.let {
            model.validaUser(user = user, password = password)
        }
    }

    override fun usuarioValido() {
        view?.usuarioValido()
    }

    override fun error() {
        view?.error()
    }
}