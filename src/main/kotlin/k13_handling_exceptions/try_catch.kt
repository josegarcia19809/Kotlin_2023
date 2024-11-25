package k13_handling_exceptions

import k05_funciones.imprimirLinea

fun main() {
    println("Ingresa un número: ")
    val test = readLine()
    try {
        println(test?.toInt())
    } catch (ex: Exception) {
        println("A exception occurred")
        println(ex.localizedMessage)
        imprimirLinea()
        ex.printStackTrace()
        imprimirLinea()
    }
}