package k13_handling_exceptions

/*
    The user must input how many kilometers they ran today.
    Convert that value to miles
    Handle any exceptions that might occur.
 */

fun main() {
    print("How many kilometers do you run today? ")
    try {
        val kilometers = readln().toInt()
        println("You ran ${kilometers * 0.62} miles")
    } catch (e: Exception) {
        println("The input is not a number")
        e.printStackTrace()
    }
}