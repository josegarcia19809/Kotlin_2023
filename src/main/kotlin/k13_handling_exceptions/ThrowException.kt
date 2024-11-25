package k13_handling_exceptions

fun main() {
    println("Escribe un texto sabio:")
    val texto = readLine()
    throw IllegalStateException("I don't like this input")
}