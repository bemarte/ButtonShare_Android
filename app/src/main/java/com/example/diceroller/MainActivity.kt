package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //findViewById to get a reference to the button and assign it to an immutable variable called rollButton
        val rollButton:Button = findViewById(R.id.roll_button)
        //ao clicar no botão, aparece mensagem confirmando o click
        rollButton.setOnClickListener {
            //test Toast
            //Toast.makeText(this, "Botão clicado",Toast.LENGTH_SHORT).show()

            rollDice()
        }
    }
    private fun rollDice() {
//        val resultText: TextView = findViewById(R.id.result_text)
//
//        val randomInt = Random.nextInt(6)+1
//
//        resultText.text = randomInt.toString()

        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "This is my text to send.")
            type = "text/plain"
        }

        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)
    }
}