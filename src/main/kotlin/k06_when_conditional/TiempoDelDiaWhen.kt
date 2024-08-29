package k06_when_conditional

/*
Assuming, based on the hour of the day
6 to 11 	->	morning
12 to 14	-> 	noon
15 to 17	-> 	afternoon
18 to 21	->	evening
22 to 5	    -> 	night
Ask the user to input the current hour.
Print out a message to specify the time of day.
 */

fun main() {
    print("What is the current hour? ")
    var hour = readln().toInt()
    if (hour > 23) hour = 23
    val timeOfDay = when (hour) {
        in 6..11 -> "morning"
        in 12..14 -> "noon"
        in 15..17 -> "afternoon"
        in 18..21 -> "evening"
        else -> "night"
    }
    println("At $hour:00 it's $timeOfDay")
}