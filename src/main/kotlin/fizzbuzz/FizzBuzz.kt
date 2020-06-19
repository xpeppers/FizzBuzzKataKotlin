package fizzbuzz

class FizzBuzz {
    fun say(number: Int): String {
        if (number isDivisibleBy 3 && number isDivisibleBy 5) return "FizzBuzz"
        if (number isDivisibleBy 3) return "Fizz"
        if (number isDivisibleBy 5) return "Buzz"
        return number.toString()
    }

    private infix fun Int.isDivisibleBy(number: Int) = this % number == 0
}
