package k03_ciclos

fun main() {
    println("Please enter a number: ")
    val number = readln().toInt()
    var i = 1
    var result = 1L
    while (i <= number) {
        result *= i
        i++
    }
    println("$number! = $result")
}