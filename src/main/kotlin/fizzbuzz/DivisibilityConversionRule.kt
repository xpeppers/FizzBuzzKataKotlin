package fizzbuzz

class DivisibilityConversionRule(private val divisor: Int, private val word: String): ConversionRule {

    override fun convertOrEmpty(number: Int) = if (number isDivisibleBy divisor) word else ""

    private infix fun Int.isDivisibleBy(number: Int) = this % number == 0
}