package com.github.cesar1287.turma3sib

import android.content.Intent
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

        with(binding) {
            btRegisterSave.setOnClickListener {
                val name = tieRegisterName.text.toString()
                val email = tieRegisterEmail.text.toString()
                val password = tieRegisterPassword.text.toString()

                if (name.isBlank()) {
                    tilRegisterName.error = "Campo nome vazio ou inválido"
                } else {
                    tilRegisterName.isErrorEnabled = false
                }

                startActivity(
                    Intent(
                        this@RegisterActivity,
                        MainActivity::class.java)
                )
            }
        }
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