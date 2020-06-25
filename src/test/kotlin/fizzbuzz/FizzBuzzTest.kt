package fizzbuzz

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun `say the plain number`() {
        assertEquals("1", FizzBuzz().say(1))
        assertEquals("2", FizzBuzz().say(2))
        assertEquals("4", FizzBuzz().say(4))
    }

    @Test
    fun `say Fizz for the number 3`() {
        assertEquals("Fizz", FizzBuzz().say(3))
    }

    @Test
    fun `say Buzz for the number 5`() {
        assertEquals("Buzz", FizzBuzz().say(5))
    }

    @Test
    fun `say Fizz for the number 6`() {
        assertEquals("Fizz", FizzBuzz().say(6))
    }

    @Test
    fun `say Fizz for multiples of 3`() {
        assertEquals("Fizz", FizzBuzz().say(3 * 2))
        assertEquals("Fizz", FizzBuzz().say(3 * 3))
        assertEquals("Fizz", FizzBuzz().say(3 * 4))
    }


}