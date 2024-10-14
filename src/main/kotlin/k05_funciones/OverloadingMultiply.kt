package k05_funciones

fun multiply(number: Int) = number * 2
fun multiply(number: Int, multiplier: Int) = number * multiplier

fun main() {
    println(multiply(3))
    println(multiply(3, 5))
}