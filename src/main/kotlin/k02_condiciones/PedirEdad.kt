package k02_condiciones

fun main(args: Array<String>) {
    println("Dame tu edad:")
    val edad = readln().toInt();
    if (edad >= 18) {
        println("Eres mayor de edad.")
    } else {
        println("No eres mayor de edad.")
    }
}
