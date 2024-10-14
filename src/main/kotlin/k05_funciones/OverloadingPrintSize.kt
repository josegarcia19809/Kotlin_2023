package k05_funciones

fun printSize(message: String) {
    println("'$message' has a size of ${message.length}")
}

fun printSize(size: Int) {
    var message = ""
    for (i in 1..size) {
        message += "x"
    }
    println("A message of size $size is '$message'")
}

fun main() {
    printSize("Hello")
    printSize(10)
}