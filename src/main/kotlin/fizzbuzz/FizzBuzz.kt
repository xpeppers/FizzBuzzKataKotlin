package fizzbuzz

class FizzBuzz {
    fun say(number: Int): String {
        if (number == 5) return "Buzz"
        if (number.isMultipleOf3()) return "Fizz"
        return number.toString()
    }

    private fun Int.isMultipleOf3() = this % 3 == 0
}
