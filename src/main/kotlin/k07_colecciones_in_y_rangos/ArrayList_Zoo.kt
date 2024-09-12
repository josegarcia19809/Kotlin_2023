package k07_colecciones_in_y_rangos

/*
* A zoo has a list of animals
* val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
*
* A new Panda bear cup has arrived
* Print out the new list of animals
* The lion has been sold to a different zoo
* Print out the new list of animals
* Does the zoo have both elephants and giraffes
* */

fun main() {
    val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
    animals.add("panda bear")
    println(animals)

    animals.remove("lion")
    println(animals)

    val hasAllAnimals = animals.containsAll(listOf("giraffe", "elephant"))
    println("Does the zoo have all the animals? $hasAllAnimals")
}