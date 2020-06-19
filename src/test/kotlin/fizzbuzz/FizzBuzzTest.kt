package fizzbuzz

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun `say 1 when number is 1`() {
        assertEquals("1", FizzBuzz().say(1))
    }

    @Test
    fun `say 2 when number is 2`() {
        assertEquals("2", FizzBuzz().say(2))
    }

    @Test
    fun `say 4 when number is 4`() {
        assertEquals("4", FizzBuzz().say(4))
    }

    @Test
    fun `say Fizz when number is 3`() {
        assertEquals("Fizz", FizzBuzz().say(3))
    }

    @Test
    fun `say Buzz when number is 5`() {
        assertEquals("Buzz", FizzBuzz().say(5))
    }

    @Test
    fun `say Fizz when number is 6`() {
        assertEquals("Fizz", FizzBuzz().say(6))
    }

    @Test
    fun `say Buzz when number is 10`() {
        assertEquals("Buzz", FizzBuzz().say(10))
    }

    @Test
    fun `say FizzBuzz when number is 15`() {
        assertEquals("FizzBuzz", FizzBuzz().say(15))
    }

    @Test
    fun `say FizzBuzz when number is 30`() {
        assertEquals("FizzBuzz", FizzBuzz().say(30))
    }
}