package k04_arreglos

fun main() {
    val puntuaciones = intArrayOf(7, 8, 9, 10, 11)
    println("Arreglo original: ${puntuaciones.joinToString(", ")}")

    ++puntuaciones[2] // Pre-incremento
    puntuaciones[4]++ // Post-incremento

    // Después de los incrementos
    for (i in 0..4) {
        print("${puntuaciones[i]} ")
    }
    println()
}

