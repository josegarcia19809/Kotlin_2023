package k07_colecciones_in_y_rangos

/*
* An animal shelter has a list of animals that it tries to get adopted.
* They are trying to print a message, to either advertise available animals
* if there are any animals in the shelter, or thank the community if all
* animals have been adopted.
*
* Design a program to print out that message
* */

fun main() {
    val animals = arrayListOf("cat", "dog")
    if (animals.isEmpty()) {
        println("Thank you for giving homes to all our pets")
    } else {
        println("Please come in and adopt a pet. We have $animals")
    }
}