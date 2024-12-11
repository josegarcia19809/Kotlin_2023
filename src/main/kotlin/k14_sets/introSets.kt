package k14_sets

fun main() {
    val numbers = setOf(6, 37, 6, 42)
    println(numbers)

    // Crear un set vacío
    val numbers2 = setOf<Int>()
    println(numbers2)


    // Crear un set con valores nulos
    val numbers3 = setOf(6, 5, 2, null, 8, 7, 9, null)
    println(numbers3)

}