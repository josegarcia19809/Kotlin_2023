package k07_colecciones_in_y_rangos

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