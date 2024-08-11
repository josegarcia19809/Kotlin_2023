package k03_ciclos

/*
* Ask the user for a number.

Print out a square matrix of the size indicated by the number.

Inside each cell, print out 1 emoji

😀 If the row*column is divisible by 3
🤨 If the row*column % 3 is 1
😱 If the row*column % 3 is 2

* */
fun main() {
    print("Enter a number: ")
    val number = readln().toInt()

    for (row in 1..number) {
        for (column in 1..number) {
            when (row * column % 3) {
                0 -> print("\uD83D\uDE00 ")
                1 -> print("\uD83E\uDD28 ")
                2 -> print("\uD83D\uDE31 ")
            }
        }
        println()
    }
}