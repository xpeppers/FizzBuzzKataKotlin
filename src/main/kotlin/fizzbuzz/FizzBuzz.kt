package fizzbuzz

class FizzBuzz {
    fun say(number: Int): String {
        val conversionRules = listOf(
                DivisibilityConversionRule(divisor = 3, word = "Fizz"),
                DivisibilityConversionRule(divisor = 5, word = "Buzz")
        )

        val result = conversionRules.joinToString("") { it.convertOrEmpty(number) }

        return if(result.isNotEmpty()) result else number.toString()
    }
}