package k03_ciclos

// Sumar los primeros 100 números
fun main() {
    var total=0
    for (i in 1..100) {
        total+=i
    }
    println("Total: $total")
}