package com.github.cesar1287.turma3sib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.github.cesar1287.turma3sib.RegisterActivity.Companion.KEY_INTENT_AGE
import com.github.cesar1287.turma3sib.RegisterActivity.Companion.KEY_INTENT_DOUBLE
import com.github.cesar1287.turma3sib.RegisterActivity.Companion.KEY_INTENT_EMAIL
import com.github.cesar1287.turma3sib.RegisterActivity.Companion.KEY_INTENT_NAME
import com.github.cesar1287.turma3sib.RegisterActivity.Companion.KEY_INTENT_PASSWORD

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("lifecycle", "onCreate - Main")

        val name = intent.getStringExtra(KEY_INTENT_NAME)
        val email = intent.getStringExtra(KEY_INTENT_EMAIL)
        val password = intent.getStringExtra(KEY_INTENT_PASSWORD)
        val number = intent.getDoubleExtra(KEY_INTENT_DOUBLE, 0.0)
        val age = intent.getIntExtra(KEY_INTENT_AGE, 0)

        val textView = findViewById<TextView>(R.id.tvMainHelloWorld)
        val randomButton = findViewById<Button>(R.id.btMainRandom)

        textView.text = "Meu nome é $name\n" +
                "Meu email é $email\n" +
                "Minha senha é $password\n" +
                "E minha idade é $age - $number"

        randomButton.setOnClickListener {
            val randomNumber = (Math.random() * 10).toInt()
            val text = "O número sorteado é $randomNumber"
            textView.text = text
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("lifecycle", "onStart - Main")
    }

    override fun onResume() {
        super.onResume()
        Log.i("lifecycle", "onResume - Main")
    }

    override fun onPause() {
        super.onPause()
        Log.i("lifecycle", "onPause - Main")
    }

    override fun onStop() {
        super.onStop()
        Log.i("lifecycle", "onStop - Main")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("lifecycle", "onDestroy - Main")
    }
}