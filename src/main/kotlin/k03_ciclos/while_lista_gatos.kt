package k03_ciclos

fun main() {
    val cats = listOf("Tigger", "Smokey", "Sassy", "Patch", "Sammy")
    var index = 0
    while (index < cats.size) {
        println("Hello ${cats[index]}")
        index++
    }
}