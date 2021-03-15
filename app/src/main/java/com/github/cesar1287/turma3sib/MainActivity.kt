package com.github.cesar1287.turma3sib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.tvMainHelloWorld)
        val randomButton = findViewById<Button>(R.id.btMainRandom)

        randomButton.setOnClickListener {
            val randomNumber = (Math.random() * 10).toInt()
            val text = "O número sorteado é $randomNumber"
            textView.text = text
        }
    }
}