package k05_funciones

fun sumOfIntegers(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}

fun main() {
    println(sumOfIntegers(1,2,3))
    println(sumOfIntegers(2,3,4))
    println(sumOfIntegers(12,13,41))
}