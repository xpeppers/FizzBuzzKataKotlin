package fizzbuzz

import org.junit.Assert.assertEquals
import org.junit.Test

class DivisibileConversionRuleTest {

    @Test
    fun `returns null with a non matching number`() {
        val rule = DivisibileConversionRule(3, "Fizz")

        assertEquals(null, rule.convertOrEmpty(1))
    }

    @Test
    fun `returns the word with exact number`() {
        val rule = DivisibileConversionRule(3, "Fizz")

        assertEquals("Fizz", rule.convertOrEmpty(3))
    }

    @Test
    fun `returns the word if a multiple of number`() {
        val rule = DivisibileConversionRule(3, "Fizz")

        assertEquals("Fizz", rule.convertOrEmpty(6))
    }

    @Test
    fun `returns the word if contains the number`() {
        val rule = DivisibileConversionRule(3, "Fizz")

        assertEquals("Fizz", rule.convertOrEmpty(37))
    }
}