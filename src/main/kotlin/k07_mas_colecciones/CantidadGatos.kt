package k07_mas_colecciones

/*
* A lady has cats
* 1 to 3    -> few cats
* 4 to 6    -> several cats
* 7 or more -> many cats
*
* Ask the user how many cats they have, then print the appropiate text
* */

fun main() {
    print("How many cats do you have? ")
    val cats = readLine()!!.toInt()
    val howMany = if (cats in 1..3)
        "few cats"
    else if (cats in 4..6)
        "several cats"
    else
        "many cats"

    println("This lady has $howMany")
}