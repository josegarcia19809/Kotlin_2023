package k05_funciones

/*
Create a function that receives the name of an animal, and returns the estimated lifespan.

cats -> 15
dogs -> 10
rabbit -> 12
everything else -> 20

Ask the user to input an animal, then print out the estimated lifespan for that animal.*/

fun estimatedLifeSpan(name: String): Int {
    val lifeSpan = when (name) {
        "cat" -> 15
        "dog" -> 10
        "rabbit" -> 12
        else -> 20
    }
    return lifeSpan
}

fun main() {
    print("Please enter a animal: ")
    val animal = readln()
    val lifeSpan = estimatedLifeSpan(animal)
    print("A $animal has a lifespan of $lifeSpan years")
}