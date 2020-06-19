package fizzbuzz

class FizzBuzz(private val conversionRules: List<ConversionRule>) {

    fun say(number: Int): String {
        val result = conversionRules.joinToString("") { it.convertOrEmpty(number) }

        return if (result.isNotEmpty()) result else number.toString()
    }
}