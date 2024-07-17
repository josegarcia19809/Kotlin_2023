package k06_when_conditional

fun main() {
    var result = ""
    val number = 2345;

    when (number % 2) {
        0 -> result = "Number is even"
        1 -> result = "Number is odd"
    }
    println(result)
}