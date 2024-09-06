package k03_ciclos

/*
* A group of young people are going to a nightclub.
Design a program that accepts user ages.
The program displays a welcome message for each user.
If it receives an age lower than 18, it prints a message that this client is not allowed.
If it receives the word “stop”, the program ends
* */

fun main() {
    while (true) {
        print("Enter your age ('stop' for quit): ")
        val input = readln()
        if (input == "stop") {
            break
        }

        val age = input.toInt()
        if (age < 18) {
            println("Sorry yo cannot go in")
            continue
        }

        println("welcome to the club")
    }
}