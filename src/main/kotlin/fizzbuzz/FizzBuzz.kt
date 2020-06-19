package fizzbuzz

class FizzBuzz(private val rules: List<DivisibilityConversionRule>) {

    fun say(number: Int): String {
        val result = rules.joinToString("") { it.convertOrEmpty(number) }

        return if (result.isNotEmpty()) result else number.toString()
    }
}