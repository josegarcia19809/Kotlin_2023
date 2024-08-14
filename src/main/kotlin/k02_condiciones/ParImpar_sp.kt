package k02_condiciones

// ParImparMensaje

// Programa para mostrar si un número es par o impar
fun main() {
    print("Introduce un número: ")
    val numero: Int = readln().toInt()

    val mensaje = if (numero % 2 == 0) "es par" else "es impar"
    println("El número $numero $mensaje")
}