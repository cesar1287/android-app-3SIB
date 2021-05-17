package com.github.cesar1287.turma3sib

import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.cesar1287.turma3sib.databinding.ActivityImcBinding

class ImcActivity : AppCompatActivity() {

    private lateinit var binding: ActivityImcBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImcBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {

            btImcCalculate.setOnClickListener {
                val height = tieImcHeight.text.toString()
                val weight = tieImcWeight.text.toString()
                val isValidHeight: Boolean
                val isValidWeight: Boolean

                when {
                    height.isBlank() -> {
                        tilImcHeight.error = "Campo inválido"
                        isValidHeight = false
                    }
                    height.toInt() >= 300 -> {
                        tilImcHeight.error = "Altura inválida"
                        isValidHeight = false
                    }
                    else -> {
                        tilImcHeight.isErrorEnabled = false
                        isValidHeight = true
                    }
                }

                when {
                    weight.isBlank() -> {
                        tilImcWeight.error = "Campo inválido"
                        isValidWeight = false
                    }
                    weight.toInt() >= 200 -> {
                        tilImcWeight.error = "Peso inválido"
                        isValidWeight = false
                    }
                    else -> {
                        tilImcWeight.isErrorEnabled = false
                        isValidWeight = true
                    }
                }

                if (isValidHeight && isValidWeight) {
                    val imc = Imc(
                        height = height.toDouble(),
                        weight = weight.toDouble()
                    )

                    val intent = Intent(this@ImcActivity, ResultImcActivity::class.java)
                    intent.putExtra("imc", imc)
                    startActivity(intent)
                }
            }
        }
    }
}