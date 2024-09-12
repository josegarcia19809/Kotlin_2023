package k07_colecciones_in_y_rangos

/*
* This is the list of winners of the men’s 100m race.
val winners = listOf("Usain", "John", "Michael", "Alex", "Bob")

What place did Michael finish on?

* */

fun main() {
    val winners = listOf("Usain", "John", "Michael", "Alex", "Bob")

    val indexOfMichael = winners.indexOf("Michael")

    println("Michael finished on position ${indexOfMichael + 1}")
}