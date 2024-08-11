package k03_ciclos

/*
* Ask the user to input a number. Call it maxValue.
Print out every number smaller than maxValue that is divisible by 7, in descending order.
*/

fun main() {
    print("Give a number: ")
    val maxValue = readln().toInt()

    for (i in maxValue downTo 0) {
        if (i % 7==0)
            print("$i ")
    }
}