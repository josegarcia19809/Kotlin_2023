package k04_arreglos

fun main() {
    val valores = IntArray(3)
    println("Intento de guardar 4 números en un arreglo de 3 elementos")

    // Usando un bucle for con un rango de 0 a 3
    for (i in 0..3) {
        println("Procesando el elemento $i")
        try {
            valores[i] = 10
        } catch (e: ArrayIndexOutOfBoundsException) {
            println("Error en el índice $i")
        }
    }
    println("-".repeat(100))
}