package k10_poo_clases

class Animal {
    var name = ""
    var topSpeed = 0

    fun run() {
        println("$name's top speed is $topSpeed")
    }
}

fun main() {
    val cat = Animal()
    cat.name = "Mixi"
    cat.topSpeed = 2
    cat.run()
}