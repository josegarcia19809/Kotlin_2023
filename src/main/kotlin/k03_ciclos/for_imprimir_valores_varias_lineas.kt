package k03_ciclos

fun main() {
    for (i in 1..100) {
        print(" $i")
        if (i % 20 == 0) {
            println()
        }
    }
}