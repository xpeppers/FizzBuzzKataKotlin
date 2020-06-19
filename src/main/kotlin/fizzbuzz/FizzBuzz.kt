package fizzbuzz

class FizzBuzz {
    fun say(number: Int): String {

        val divAndWords = listOf(
                DivisorAndWord(divisor = 3, word = "Fizz"),
                DivisorAndWord(divisor = 5, word = "Buzz")
        )

        val result = divAndWords.joinToString("") { evaluateWordOrEmpty(number, it) }

        if(result.isNotEmpty()) return result

        return number.toString()
    }

    private fun evaluateWordOrEmpty(number: Int, it: DivisorAndWord): String {
        if (number isDivisibleBy it.divisor) return it.word
        return ""
    }

    private infix fun Int.isDivisibleBy(number: Int) = this % number == 0
}