package k01_fundamentos

fun main() {
    println("-".repeat(100))
    println("Tienda de libros")

    print("Proporciona el titulo: ")
    val nombre = readln()

    print("Proporciona el id: ")
    val id: Int = readln().toInt()

    print("Proporciona el precio: ")
    val precio: Double = readln().toDouble()

    print("Proporciona el símbolo del precio: ")
    val simbolo: Char = readln()[0]

    print("Proporciona el envío gratuito (true/false): ")
    val esEnvioGratuito: Boolean = readln().toBoolean()

    println()
    println("$nombre #$id")
    println("Precio: $simbolo$precio")
    println("Es envio gratuito: $esEnvioGratuito")
}