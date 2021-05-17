package com.github.cesar1287.turma3sib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.cesar1287.turma3sib.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("lifecycle", "onCreate - Register")
        //Register - user - 4 atributos
        //"name" -> name
        //"email" -> email

        //Intent

        //Main - user - 4 atributos
        //User(name, email, etc)
    }

    override fun onStart() {
        super.onStart()
        Log.i("lifecycle", "onStart - Register")
    }

    override fun onResume() {
        super.onResume()
        Log.i("lifecycle", "onResume - Register")
    }

    override fun onPause() {
        super.onPause()
        Log.i("lifecycle", "onPause - Register")
    }

    override fun onStop() {
        super.onStop()
        Log.i("lifecycle", "onStop - Register")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lifecycle", "onDestroy - Register")
    }
}