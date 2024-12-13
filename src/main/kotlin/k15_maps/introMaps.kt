package k15_maps

fun main() {
    val count = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(count)

    // Otra forma más concisa de definir el mismo mapa en Kotlin es usando la sintaxis de
    // pares clave-valor directamente:
    val count2 = mapOf(4 to "four", 5 to "five", 6 to "six")
    println(count2)

    // Explicación:
    // El operador to es una forma más legible y compacta de crear instancias de Pair.
    // Produce exactamente el mismo resultado que Pair(key, value).
    // Ambas definiciones son equivalentes y generan un mapa inmutable con las mismas claves y
    // valores.

    // if we create a empty map
    // we must specify both the key and value types
    val count3 = mapOf<Int, String>()
    println(count3)

    // Get a value based on a key
    println(count.get(2))
    println(count[2])

    // Get the whole set of keys (they are unique)
    println("Keys: ${count.keys}")

    // Get the collection of values (can have duplicates)
    println("Vaues: ${count.values}")
}