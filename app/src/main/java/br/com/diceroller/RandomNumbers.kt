package br.com.diceroller

open class RandomNumbers(sides : Int) {
    private val range: IntRange = 1..sides
    fun generateRandomNumber(): Int {
        return range.random()
    }
}