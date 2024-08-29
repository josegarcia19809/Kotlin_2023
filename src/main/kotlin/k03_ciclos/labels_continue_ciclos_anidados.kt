package k03_ciclos

fun main() {
    loop@ for (i in 1..4) {
        for (j in 1..4) {
            if (i % 3 == 0) {
                println("-".repeat(100))
                continue@loop
            }
            println("$i $j")
        }
    }
}