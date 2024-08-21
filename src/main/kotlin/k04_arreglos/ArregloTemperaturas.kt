package k04_arreglos

fun main() {
    val temperaturas = doubleArrayOf(3.4, 5.8, 20.0, 40.0)

    val longitudArreglo = temperaturas.size
    println("Tamaño del arreglo: $longitudArreglo")
    println("-".repeat(30))

    // Usar los indices del arreglo para saber hasta donde llegará el for
    for (i in temperaturas.indices) {
        println("#${i}: ${temperaturas[i]}")
    }
}