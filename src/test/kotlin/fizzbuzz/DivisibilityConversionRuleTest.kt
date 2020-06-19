package fizzbuzz

import junit.framework.Assert.assertEquals
import org.junit.Test

class DivisibilityConversionRuleTest {

    @Test
    fun `returns null with a non matching number`() {
        val rule = DivisibilityConversionRule(3, "Fizz")

        assertEquals(null, rule.convertOrEmpty(1))
    }

    @Test
    fun `returns the word with exact number`() {
        val rule = DivisibilityConversionRule(3, "Fizz")

        assertEquals("Fizz", rule.convertOrEmpty(3))
    }

    @Test
    fun `returns the word if a multiple of number`() {
        val rule = DivisibilityConversionRule(3, "Fizz")

        assertEquals("Fizz", rule.convertOrEmpty(6))
    }
}