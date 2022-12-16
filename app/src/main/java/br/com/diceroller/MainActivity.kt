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
        val luckyText: TextView = findViewById(R.id.luckyNumber)
        val luckyNumberGenerated = LuckyNumber(6).generateRandomNumber()
        luckyText.text = luckyNumberGenerated.toString()
        val rollButton: Button = findViewById(R.id.button)


        rollButton.setOnClickListener { luckyNumber(luckyNumberGenerated) }
    }

    private fun rollDice(): Int {
        generateToast("Dice Rolled!")
        val resultRoll: TextView = findViewById(R.id.textView)
        val diceRoller = DiceRoller(6)
        val numberGenerated = diceRoller.generateRandomNumber()
        resultRoll.text = numberGenerated.toString()
        return numberGenerated
    }

    private fun luckyNumber(luckyNumber : Int) {
        val numberGenerated = rollDice()
        if(luckyNumber == numberGenerated) generateToast("You win")
        else generateToast("You lose!")
    }

    private fun generateToast(text: String) {
        Toast.makeText(this.applicationContext, text, Toast.LENGTH_SHORT).show()
    }
}