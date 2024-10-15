package k05_funciones

// SobrecargaSuma

fun sumarNumeros(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun sumarNumeros(num1: Double, num2: Double): Double {
    return num1 + num2
}

fun sumarNumeros(num1: Int, num2: Int, num3: Int): Int {
    return num1 + num2 + num3
}

fun main() {
    println(sumarNumeros(32, 40)) // 72
    println(sumarNumeros(21.1, 20.2)) // 41.3
    println(sumarNumeros(40, 70, 20)) // 130
    imprimirLinea()
}
