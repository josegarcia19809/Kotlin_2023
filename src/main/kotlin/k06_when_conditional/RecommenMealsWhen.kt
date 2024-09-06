package k06_when_conditional

/*
* Assume that 3 meals a day is the recommended amount.
* Ask the user to input the number of meals they have every day.
* Based on the input, print out a message that encourages the user to increase
* or decrease the number of meals they have.
* */

fun main() {
    println("How many meals do you have a day: ")
    val meals = readLine()!!.toInt()
    when (meals) {
        in 0..2 -> println("You should eat more")
        3 -> println("That's perfect")
        else -> println("You should eat less")
    }
}