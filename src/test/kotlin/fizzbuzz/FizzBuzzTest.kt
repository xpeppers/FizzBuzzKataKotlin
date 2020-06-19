package fizzbuzz

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun `say 1 when number is 1`() {
        val said = FizzBuzz().say(1)

        assertEquals("1", said)
    }

    @Test
    fun `say 2 when number is 2`() {
        val said = FizzBuzz().say(2)

        assertEquals("2", said)
    }
}