package com.github.cesar1287.turma3sib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.cesar1287.turma3sib.databinding.ActivityResultImcBinding
import kotlin.math.pow

class ResultImcActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultImcBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultImcBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imc = intent.getParcelableExtra<Imc>("imc")

        // peso / altura²
        imc?.let {
            val imcResult = it.weight / (it.height / 100).pow(2)
            val imcFormatted = String.format("%.1f", imcResult).toDouble()

            with(binding) {
                tvResultImcValue.text = "Seu IMC é $imcFormatted"

                val result = when {
                    imcFormatted < 18.5 -> {
                        "MAGREZA"
                    }
                    imcFormatted < 25 -> {
                        "NORMAL"
                    }
                    imcFormatted < 30 -> {
                        "SOBREPESO"
                    }
                    imcFormatted < 40 -> {
                        "OBESIDADE"
                    }
                    else -> {
                        "OBESIDADE GRAVE"
                    }
                }

                tvResultImcResult.text = "E o resultado é: $result"

                btResultBack.setOnClickListener {
                    finish()
                }
            }
        }
    }
}