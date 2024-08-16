package k03_ciclos

fun main() {
    print("¿Cuántas líneas quiere imprimir? ")
    val n = readln().toInt()
    println("\n")
    for (i in 1..n) {
        println("$i. I must not sleep in class")
    }
}