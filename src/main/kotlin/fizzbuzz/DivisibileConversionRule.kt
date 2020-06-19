package fizzbuzz

class DivisibileConversionRule(private val divisor: Int, private val word: String): ConversionRule {

    override fun convertOrEmpty(number: Int): String? = if (number isDivisibleBy divisor || number contains divisor) word else null

    private infix fun Int.isDivisibleBy(number: Int) = this % number == 0

    private infix fun Int.contains(number: Int) = toString().contains(number.toString())
}