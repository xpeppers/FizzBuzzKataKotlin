package fizzbuzz

class FizzBuzz {
    fun say(number: Int): String {
        var result = ""

        val divAndWord = DivAndWord(divisor = 3, word = "Fizz")
        if (number isDivisibleBy divAndWord.divisor) {
            result += divAndWord.word
        }

        val buzzDivAndWord = DivAndWord(divisor = 5, word = "Buzz")
        if (number isDivisibleBy buzzDivAndWord.divisor) {
            result += buzzDivAndWord.word
        }

        if(result.isNotEmpty())
            return result

        return number.toString()
    }

    private infix fun Int.isDivisibleBy(number: Int) = this % number == 0
}