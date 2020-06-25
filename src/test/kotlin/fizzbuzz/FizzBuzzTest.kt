package fizzbuzz

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun `say 1 for the number 1`() {
        assertEquals("1", FizzBuzz().say(1))
    }
}