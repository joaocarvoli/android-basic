package br.com.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        Toast.makeText(this.applicationContext, "Dice Rolled", Toast.LENGTH_SHORT).show()
        val resultRoll: TextView = findViewById(R.id.textView)
        val secondResultRoll: TextView = findViewById(R.id.textView3)
        val diceRoller = DiceRoller(6)
        val secondDiceRoller = DiceRoller(6)
        val numberGenerated = diceRoller.generateRandomNumber()
        val secondNumberGenerated = secondDiceRoller.generateRandomNumber()


        resultRoll.text = numberGenerated.toString()
        secondResultRoll.text = secondNumberGenerated.toString()
    }
}