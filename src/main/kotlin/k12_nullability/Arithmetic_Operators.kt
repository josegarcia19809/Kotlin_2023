package k12_nullability

fun main() {
    val num: Double? = 10.0
    println(num?.plus(3))
    println(num?.minus(3))
    println(num?.times(3))
    println(num?.div(3))
    println(num?.rem(3))
}