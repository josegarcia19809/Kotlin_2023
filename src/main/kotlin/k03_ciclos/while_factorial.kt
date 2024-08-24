package k03_ciclos

fun main() {
    println("Please enter a number: ")
    var number = readln().toInt()
    var i = 1
    var result = 1L
    while (i <= number) {
        result *= i
        i++
    }
    println("$number! = $result")
}