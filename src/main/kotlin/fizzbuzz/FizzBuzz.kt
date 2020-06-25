package fizzbuzz

class FizzBuzz {
    fun say(number: Int): String {
        if (number isMultipleOf 5) return "Buzz"
        if (number isMultipleOf 3) return "Fizz"
        return number.toString()
    }

    private infix fun Int.isMultipleOf(number: Int) = this % number == 0
}
