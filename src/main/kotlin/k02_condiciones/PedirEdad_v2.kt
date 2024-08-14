package k02_condiciones

// PedirEdad_v2

fun main() {
    print("Dame tu edad: ")
    val edad = readln().toInt()

    val mensaje = if (edad >= 18) "Eres mayor" else "Eres menor"
    println("$mensaje de edad")
}