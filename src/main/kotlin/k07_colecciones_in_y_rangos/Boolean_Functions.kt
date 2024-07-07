package k07_mas_colecciones

fun main() {
    val animals = arrayListOf<String>()
    if (animals.isEmpty()) {
        animals.add("dog")
    }
    println(animals)

    val otherAnimals = arrayListOf<String>()
    if (otherAnimals.add("dog")) {
        println("Item was successfully added")
    }
}