package fizzbuzz

data class DivisibilityConversionRule(val divisor: Int, val word: String) {
    fun convertOrEmpty(number: Int) = if (number isDivisibleBy divisor) word else ""

    private infix fun Int.isDivisibleBy(number: Int) = this % number == 0
}