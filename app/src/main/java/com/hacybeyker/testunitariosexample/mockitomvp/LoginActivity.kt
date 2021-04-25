package com.hacybeyker.testunitariosexample.mockitomvp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.hacybeyker.testunitariosexample.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), Login.View {

    private lateinit var binding: ActivityLoginBinding
    private var presenter: Login.Presenter = LoginPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*presenter = LoginPresenter(this)*/
    }

    override fun usuarioValido() {
        /*startActivity(Intent(LoginActivity::class, FinalActivyty::class))*/
    }

    override fun error() {
        Log.d("TAG", "error: Usuario no es valido")
    }

    override fun getUserName(): String {
        return binding.editUsername.text.toString()
    }

    override fun getPassword(): String {
        return binding.editPassword.text.toString()
    }
}