package fizzbuzz

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {

    private val rules = listOf(
            DivisibileConversionRule(divisor = 3, word = "Fizz"),
            DivisibileConversionRule(divisor = 5, word = "Buzz")
    )

    @Test
    fun `say the number when there are no rules matching`() {
        assertEquals("4", FizzBuzz(rules).say(4))
    }

    @Test
    fun `say the matched word when the rule matches`() {
        assertEquals("Fizz", FizzBuzz(rules).say(3))
        assertEquals("Buzz", FizzBuzz(rules).say(5))
    }

    @Test
    fun `concatenate all matched words when there are many rules matching`() {
        assertEquals("FizzBuzz", FizzBuzz(rules).say(3 * 5))
    }
}