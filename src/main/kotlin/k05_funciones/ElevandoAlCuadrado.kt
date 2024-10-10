package k05_funciones

// ElevandoAlCuadrado

// Crear una función que reciba un número y que devuelva el cuadrado
// de dicho número.

fun calcularCuadrado(numero: Int): Int {
    val cuadrado = numero * numero
    return cuadrado
}

fun main() {
    println("Programa para calcular el cuadrado de un número")

    print("Dame un número: ")
    val num = readln().toInt()

    val numAlCuadrado = calcularCuadrado(num)
    println("$num al cuadrado es $numAlCuadrado")
}

