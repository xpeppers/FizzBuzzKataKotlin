package fizzbuzz

class FizzBuzz {
    fun say(number: Int): String {
        if (number == 5) return "Buzz"
        if (number == 3) return "Fizz"
        return number.toString()
    }

}
