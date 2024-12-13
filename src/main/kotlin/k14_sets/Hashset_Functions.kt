package k14_sets

fun main() {

    /*
    El código utiliza dos conjuntos (HashSet) en Kotlin para encontrar los elementos
    comunes entre ellos. intersect devuelve los elementos que están en ambos conjuntos.
     */
    val numbers = hashSetOf(1, 2, 3, 4, 5)
    val newNumbers = hashSetOf(7, 2, 5, 9, 6)
    println(numbers.intersect(newNumbers))

    numbers.clear()
    println(numbers)
    println("numbers is empty? ${numbers.isEmpty()}")

}
