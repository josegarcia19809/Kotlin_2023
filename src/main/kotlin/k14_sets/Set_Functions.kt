package k14_sets

fun main() {
    // Definir funciones de sets
    val numbers = setOf(3, 6, 4, null, 8)
    println("numbers=$numbers")
    println("The size of the set is ${numbers.size}")

    println("numbers contains 4: ${numbers.contains(4)}")
    println("numbers contains 5: ${numbers.contains(5)}")

    val newNumbers = setOf(4, 5)
    println("numbers contains $newNumbers: ${numbers.containsAll(newNumbers)} ")
    // Otra forma
    println("numbers contains $newNumbers ${numbers.containsAll(setOf(4, 5))} ")

    println("numbers is empty: ${numbers.isEmpty()}")
    println("new set is empty: ${setOf<Int>().isEmpty()}")

}