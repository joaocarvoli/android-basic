package br.com.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UnitTest {
    @Test
    fun generates_number(){
        val dice = DiceRoller(6)
        val rollResult = dice.generateRandomNumber()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 2..6)
    }
}