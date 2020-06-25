package fizzbuzz

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun `say 1 for the number 1`() {
        assertEquals("1", FizzBuzz().say(1))
    }

    @Test
    fun `say 2 for the number 2`() {
        assertEquals("2", FizzBuzz().say(2))
    }

    @Test
    fun `say Fizz for the number 3`() {
        assertEquals("Fizz", FizzBuzz().say(3))
    }

    @Test
    fun `say 4 for the number 4`() {
        assertEquals("4", FizzBuzz().say(4))
    }

    @Test
    fun `say the plain number`() {
        assertEquals("1", FizzBuzz().say(1))
        assertEquals("2", FizzBuzz().say(2))
        assertEquals("4", FizzBuzz().say(4))
    }
}