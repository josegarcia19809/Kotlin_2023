package k03_ciclos

fun main() {
    // Decrementará de 10 a 1
    println("GOMAS ($6.00)")
    println("Gomas\t\tCosto")
    for (cantidad in 10 downTo 1) {
        val costo = cantidad * 6.00
        val costoF = String.format("$%,.2f", costo)
        println("$cantidad\t\t\t$costoF")
    }
}
// ChatGPT puede cometer errores.
// Considera verificar la información importante.