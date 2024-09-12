package k07_colecciones_in_y_rangos

/*
* A club has a guestlist
* A guest comes and gives their name. (inputs to the console)
* Will the user have access to the club?
* */


fun main() {
    val guestlist = setOf("John", "Alice", "Bob", "Carol")
    println("Please enter your name: ")
    val guest = readln()
    if (guest in guestlist) {
        println("Hi $guest please come in")
    } else {
        println("Sorry, you're not on the guestlist")
    }
}