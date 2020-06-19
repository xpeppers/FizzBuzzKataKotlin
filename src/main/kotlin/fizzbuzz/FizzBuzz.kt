package fizzbuzz

class FizzBuzz {
    fun say(number: Int): String {
        var result = ""
        if (number isDivisibleBy 3) {
            result += "Fizz"
        }

        if (number isDivisibleBy 5) {
            result += "Buzz"
        }

        if(result.isNotEmpty())
            return result

        return number.toString()
    }

    private infix fun Int.isDivisibleBy(number: Int) = this % number == 0
}
