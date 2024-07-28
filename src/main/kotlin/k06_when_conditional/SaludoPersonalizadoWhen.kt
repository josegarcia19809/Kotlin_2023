package k06_when_conditional

/*
Ask the user to input their name.

Based on the first letter of their name, print out a personalised greeting
for the first 3 letters of the alphabet, a different one for the next 3 letters,
and a third message for the rest
**/

fun main() {
    print("Please enter your name: ")
    val name = readLine() ?: ""
    when (name[0]) {
        'A', 'B', 'C' -> println("Hello, $name, welcome")
        in 'D'..'F' -> println("Hi $name, how are you?")
        else -> println("Hi")
    }

}