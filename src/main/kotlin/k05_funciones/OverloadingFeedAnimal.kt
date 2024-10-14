package k05_funciones

fun feedAnimal(animal: String) {
    println("Feeding the $animal")
}

fun feedAnimal(animals: Collection<String>) {
    for (animal in animals) {
        feedAnimal(animal)
    }
}

fun main() {
    feedAnimal("cat")
    feedAnimal(setOf("dog", "bear", "shark"))
}