package k15_maps

/*
You have the following translation of numbers in french
var count = hashMapOf(Pair(1, "un*), Pair(2, "deux"), Pair(3, "trois"))
Print out how you would translate 2.
What about 3.
Add the translation for 4 => "quatre"
Print out the whole map.
 */

fun main() {
    val count = hashMapOf(Pair(1, "un"), Pair(2, "deux"), Pair(3, "trois"))

    println("${2} in french is ${count[2]}")
    println("${3} in french is ${count[3]}")

    count[4] = "quatre"
    println("$count")

}