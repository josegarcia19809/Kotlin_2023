package k03_ciclos

/*
* Ask the user to input a number.
* If the factorial of that number is less than 3 000 000,
* ask them to input another number and repeat the process
* */

fun main() {
    var finished = false
    do {
        print("Enter the number: ")
        val n = readln().toInt()

        var factorial = 1L
        for (i in 1..n) {
            factorial *= i
        }
        println(factorial)
        if (factorial >= 3000000L){
            finished = true
            println("Game over")
        }

    } while (!finished)
}