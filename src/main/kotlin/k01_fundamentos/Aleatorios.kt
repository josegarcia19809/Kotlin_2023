package k01_fundamentos

import kotlin.random.Random

fun main() {
    println(Random.nextInt())
    println(Random.nextInt(10)) // de 0 a Límite superior no inclusivo
    println(Random.nextInt(0, 20))
    println(Random.nextDouble(300.00))
}