package k07_colecciones_in_y_rangos

/*
* Ask a user to input their age.

If they are under 13, they are a child
If they are under 18, they are a teen
If they are older, they are an adult.

Use ranges to print out the correct message.

If the age is 0, convert it to 1.
* */

fun main() {
    print("Please enter your age: ")
    var age = readLine()!!.toInt()

    if (age == 0) age = 1

    val result = if (age in 1..12) {
        "a child"
    } else if (age in 13..17) {
        "a teen"
    } else {
        "an adult"
    }

    println("User is $result")

}