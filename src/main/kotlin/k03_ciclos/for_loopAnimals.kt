package k03_ciclos

fun main() {
    val animals = arrayListOf("cat", "dog", "mouse", "bear")
    for (animal: String in animals) {
        println("Feed the $animal")
    }
}