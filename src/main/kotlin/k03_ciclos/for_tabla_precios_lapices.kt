package k03_ciclos

fun main() {
    // Los incrementos serán de 2 en 2 para la cantidad de lapices
    println("LAPICES ($8.00)")
    println("LAPICES\t\tCOSTO")
    for (cantidad in 2..18 step 2) {
        val costo = cantidad * 8
        println("$cantidad\t\t\t$costo")
    }
}