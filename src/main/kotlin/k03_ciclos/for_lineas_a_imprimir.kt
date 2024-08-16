package k03_ciclos

fun main() {
    //
    print("¿Cuántas líneas quieres imprimir? ")
    val n = readln().toInt()
    print("\n")
    for (i in 1..n) {
        print("$i. I must not sleep in class\n")
    }
}
