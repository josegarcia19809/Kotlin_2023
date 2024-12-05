package k10_poo_clases

class Car3 {
    val model = "BMW"
    val topSpeed = 100

    init {
        println("This car is a $model and has a top speed of $topSpeed")
    }
}

fun main() {
    val car = Car3()
}