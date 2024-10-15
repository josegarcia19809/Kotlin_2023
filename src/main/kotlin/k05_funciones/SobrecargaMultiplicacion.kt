package k05_funciones

// SobrecargaMultiplicacion

fun multiplicarNumeros(numero: Int): Int {
    return numero * 2
}

fun multiplicarNumeros(numero: Int, multiplicador: Int): Int {
    return numero * multiplicador
}

fun main() {
    println(multiplicarNumeros(3)) // 6
    println(multiplicarNumeros(3, 5)) // 15
    imprimirLinea()
}