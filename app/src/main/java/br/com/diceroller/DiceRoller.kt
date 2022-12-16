package br.com.diceroller

class DiceRoller(sides : Int) {
    private val range: IntRange = 1..sides
    fun generateRandomNumber(): Int {
        return range.random()
    }
}