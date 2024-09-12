package k07_colecciones_in_y_rangos

/*
* Create a list of your favourite animals
* Print out how many animals you have in your list
* Print out the second element in that list
* */

fun main() {
    val favouriteAnimals = listOf("Dog", "Cat", "Tiger", "Shark")
    println("I have ${favouriteAnimals.size} favourite animals")
    println("The second element is ${favouriteAnimals[1]}")
}