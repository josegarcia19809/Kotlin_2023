package k03_ciclos

fun main() {
    var onlyEvenNumbers = arrayOf(2, 6, 4, 7, 8, 10)
    for (number in onlyEvenNumbers) {
        if (number % 2 != 0) continue
        println("Half of $number is ${number / 2}")
    }
}