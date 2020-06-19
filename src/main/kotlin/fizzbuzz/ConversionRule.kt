package fizzbuzz

interface ConversionRule {
    fun convertOrEmpty(number: Int): String?
}