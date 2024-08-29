package k03_ciclos

/*
* Ask the user to input a large integer
* Print out all the numbers that are divisible by 7, that are less than the user's number
* */

fun main() {
    print("Enter a number: ")
    val number = readln().toInt()
    var i = 0
    while (i <= number) {
        if (i % 7 == 0) {
            print(" $i")
        }
        i++
    }
}