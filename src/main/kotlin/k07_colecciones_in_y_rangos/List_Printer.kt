package k07_colecciones_in_y_rangos

/*
* A printer needs the colors red, green and blue to print.
    A printer on your desk has the following colors available
* val availableColors = listOf("red", "blue")

    Design a program that prints out a boolean value, on whether or not the printer can print.

* */

fun main() {
    val availableColors = listOf("red", "blue")

    val requiredColors = listOf("red", "blue", "green")

    println("Can print the printer ? ${availableColors.containsAll(requiredColors)}")

}