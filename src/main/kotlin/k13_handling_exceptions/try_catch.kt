package k13_handling_exceptions

fun main() {
    val test = readLine()
    try {
        println(test?.toInt())
    } catch (ex: Exception) {
        println("A exception occurred")
    }
}