package condicional_when

fun main() {
    print("Dame tu nombre: ")
    val nombre = readln()

    when (val longitudNombre = nombre.length) {
        in 1..5 -> println("Nombre corto. Tiene $longitudNombre caracteres")
        in 6..10-> println("Nombre mediano. Tiene $longitudNombre caracteres")
        else -> println("Nombre largo. Tiene $longitudNombre caracteres")
    }
}
// luis -> corto 4
// maricela -> mediano 8
// jose alberto -> largo 12