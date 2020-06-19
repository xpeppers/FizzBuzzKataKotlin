package fizzbuzz

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {

    private val rules = listOf(
            DivisibilityConversionRule(divisor = 3, word = "Fizz"),
            DivisibilityConversionRule(divisor = 5, word = "Buzz")
    )

    @Test
    fun `say 1 when number is 1`() {
        assertEquals("1", FizzBuzz(rules).say(1))
    }

    @Test
    fun `say 2 when number is 2`() {
        assertEquals("2", FizzBuzz(rules).say(2))
    }

    @Test
    fun `say 4 when number is 4`() {
        assertEquals("4", FizzBuzz(rules).say(4))
    }

    @Test
    fun `say Fizz when number is 3`() {
        assertEquals("Fizz", FizzBuzz(rules).say(3))
    }

    @Test
    fun `say Buzz when number is 5`() {
        assertEquals("Buzz", FizzBuzz(rules).say(5))
    }

    @Test
    fun `say Fizz when number is 6`() {
        assertEquals("Fizz", FizzBuzz(rules).say(6))
    }

    @Test
    fun `say Buzz when number is 10`() {
        assertEquals("Buzz", FizzBuzz(rules).say(10))
    }

    @Test
    fun `say FizzBuzz when number is 15`() {
        assertEquals("FizzBuzz", FizzBuzz(rules).say(15))
    }

    @Test
    fun `say FizzBuzz when number is 30`() {
        assertEquals("FizzBuzz", FizzBuzz(rules).say(30))
    }

    @Test
    fun `say numbers from 1 to 100`() {
        val fizzBuzz = FizzBuzz(rules)

        val said = (1..100).map { fizzBuzz.say(it) }

        val expected = listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz", "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz", "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz", "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", "Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz", "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz")
        assertEquals(expected, said)
    }
}