package fizzbuzz

class FizzBuzz {
    fun say(number: Int): String {
        return when (number) {
            5 -> "Buzz"
            3 -> "Fizz"
            else -> number.toString()
        }
    }
}
