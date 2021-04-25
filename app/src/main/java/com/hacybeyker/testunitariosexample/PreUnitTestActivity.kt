package com.hacybeyker.testunitariosexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.hacybeyker.testunitariosexample.calculadora.Calculadora
import com.hacybeyker.testunitariosexample.databinding.ActivityPreUnitTestBinding

class PreUnitTestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPreUnitTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreUnitTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = Calculadora().sumar(10, 20)
        binding.textViewResult.text = "$result"

        Log.d("TAG", "Here - onCreate: $result")
        if (result == 30)
            Log.d("TAG", "Here - onCreate: $result")
        else
            Log.d("TAG", "Here - onCreate: $result")
    }
}