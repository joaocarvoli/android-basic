package br.com.diceroller

import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val luckyNumberGenerated = LuckyNumber(6).generateRandomNumber()
        val luckyTextView : TextView = findViewById(R.id.luckyNumber)
        val luckyText = "The lucky number is: $luckyNumberGenerated"
        luckyTextView.text = luckyText
        val rollButton: Button = findViewById(R.id.button)


        rollButton.setOnClickListener { luckyNumber(luckyNumberGenerated) }
    }

    private fun rollDice(): Int {
        val diceRoller = DiceRoller(6)
        return diceRoller.generateRandomNumber()
    }

    private fun luckyNumber(luckyNumber : Int) {
        val rolledNumber = rollDice()
        setRollImage(rolledNumber)
        when(rolledNumber){
            luckyNumber -> generateToast("You win")
            else -> generateToast("You lose!")
        }
    }

    private fun setRollImage(numberGenerated: Int){
        val rollView : ImageView = findViewById(R.id.imageView)
        when(numberGenerated){
            1 -> rollView.setImageResource(R.drawable.dice_1)
            2 -> rollView.setImageResource(R.drawable.dice_2)
            3 -> rollView.setImageResource(R.drawable.dice_3)
            4 -> rollView.setImageResource(R.drawable.dice_4)
            5 -> rollView.setImageResource(R.drawable.dice_5)
            6 -> rollView.setImageResource(R.drawable.dice_6)
        }

    }

    private fun generateToast(text: String) {
        Toast.makeText(this.applicationContext, text, Toast.LENGTH_SHORT).show()
    }
}