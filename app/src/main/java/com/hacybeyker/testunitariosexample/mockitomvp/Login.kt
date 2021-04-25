package com.hacybeyker.testunitariosexample.mockitomvp

interface Login {
    interface View {
        fun usuarioValido()
        fun error()
        fun getUserName(): String
        fun getPassword(): String
    }

    interface Presenter {
        fun validarUser(user: String, password: String)
        fun usuarioValido()
        fun error()
    }

    interface Model {
        fun validaUser(user: String, password: String)
    }
}