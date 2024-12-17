package k15_maps

/*
You manage an amusement park, and you have a map that stores dates and attendance.
var attendance = hashMapOf (Pair ("23 Sept", 2837),
Pair ("24 Sept", 3726), Pair("25 Sept", 6253))
Add a value for 26 Sept.
How many people attended in total on 25 and 26 Sept?
Is data for 22 Sept available?
 */

fun main() {
    var attendance = hashMapOf(
        Pair("23 Sept", 2837),
        Pair("24 Sept", 3726), Pair("25 Sept", 6253)
    )
    attendance["26 Sept"] = 3456

    val peopleOn25 = attendance["25 Sept"] ?: 0
    val peopleOn26 = attendance["26 Sept"] ?: 0

    println("How many people attended in total on 25 and 26 Sept? ${peopleOn25 + peopleOn26}")
    println("Is data for 22 Sept available? ${attendance.containsKey("22 Sept")}")
}