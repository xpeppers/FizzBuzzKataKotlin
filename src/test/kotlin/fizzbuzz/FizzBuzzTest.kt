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

}