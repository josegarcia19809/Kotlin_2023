package k12_nullability

// Read a number from the console and convert it to Double.
//Multiply it by 7, and convert the result into a string.
//Print the length of that string to the console.

fun main() {
    print("Give a number: ")
    val number = readlnOrNull()?.toDouble()
    println(number?.times(7))
    val numberString = number?.times(7).toString()
    print(numberString.length)
}