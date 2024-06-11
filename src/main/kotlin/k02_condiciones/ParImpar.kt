package k02_condiciones

fun main() {
    print("Enter a number: ")
    val number: Int = readln().toInt()
    var isEven: String? = null
    isEven = if (number % 2 == 0) "is even" else "is odd"
    println("The number $number $isEven")
}