package k01_fundamentos

fun main() {
    // Multiplicar 2 números
    print("Dame primer número: ")
    val num1: Float = readln().toFloat()

    print("Dame segundo número: ")
    val num2: Float = readln().toFloat()

    val suma: Float = num1 * num2
    println("La multiplicación de $num1 por $num2 es $suma")
}

// La multiplicación de 8.5 por 2.0 es 17.0