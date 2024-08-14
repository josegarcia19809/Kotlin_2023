package k02_condiciones

// Division.kt
// Programa para dividir un número entre otro.
// Si el segundo es cero, se muestra un mensaje de error.

fun main() {
    // Leer el primer número
    print("Dame un número: ")
    val num1 = readln().toDouble()

    // Leer el segundo número
    print("Dame otro número: ")
    val num2 = readln().toDouble()

    // Comprobar si se puede dividir por cero
    if (num2 == 0.0) {
        // Error: división por cero
        println("No existe la división entre cero")
        println("Ejecuta el programa de nuevo e introduce un número diferente de cero")
    } else {
        // Realizar la división y mostrar el resultado
        val resultado = num1 / num2
        println("El resultado es: $resultado")
    }
}

// Ejemplo:
// 10/5 -> 2.0
// 10/0 -> No existe la división entre cero