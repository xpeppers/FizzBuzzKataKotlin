package fizzbuzz

import org.junit.Assert.assertEquals
import org.junit.Test

class AcceptanceTest {

    @Test
    fun `FizzBuzz says numbers from 1 to 100`() {
        val fizzBuzz = FizzBuzz(listOf(
                DivisibileConversionRule(divisor = 3, word = "Fizz"),
                DivisibileConversionRule(divisor = 5, word = "Buzz")
        ))

        val said = (1..100).map { fizzBuzz.say(it) }

        val expected = listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "Fizz", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "FizzBuzz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz", "41", "Fizz", "Fizz", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz", "FizzBuzz", "Buzz", "FizzBuzz", "FizzBuzz", "Buzz", "Buzz", "FizzBuzz", "Buzz", "Buzz", "FizzBuzz", "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz", "71", "Fizz", "Fizz", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz", "Fizz", "82", "Fizz", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz", "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz")
        assertEquals(expected, said)
    }
}