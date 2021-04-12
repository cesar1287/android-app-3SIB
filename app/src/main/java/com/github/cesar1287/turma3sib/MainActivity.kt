package com.github.cesar1287.turma3sib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.github.cesar1287.turma3sib.RegisterActivity.Companion.KEY_INTENT_USER

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("lifecycle", "onCreate - Main")

        val user = intent.getParcelableExtra<User>(KEY_INTENT_USER)

        val textView = findViewById<TextView>(R.id.tvMainHelloWorld)
        val randomButton = findViewById<Button>(R.id.btMainRandom)

        textView.text = "Meu nome é ${user?.name}\n" +
                "Meu email é ${user?.email}\n" +
                "Minha senha é ${user?.password}\n" +
                "E minha idade é ${user?.age}"

        randomButton.setOnClickListener {
            val randomNumber = (Math.random() * 10).toInt()
            val text = getString(
                R.string.sorted_number,
                randomNumber,
                "sorteado é"
            )
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