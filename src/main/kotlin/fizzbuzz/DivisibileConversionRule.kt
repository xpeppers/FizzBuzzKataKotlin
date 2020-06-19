package fizzbuzz

class DivisibileConversionRule(private val divisor: Int, private val word: String): ConversionRule {

    override fun convertOrEmpty(number: Int): String? = if (number isDivisibleBy divisor) word else null

    private infix fun Int.isDivisibleBy(number: Int) = this % number == 0
}