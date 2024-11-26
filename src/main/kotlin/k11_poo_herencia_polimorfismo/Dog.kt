package k11_poo_herencia_polimorfismo

open class Dog {
    var size = 0

    fun bark() {
        println("Bark")
    }

    fun play() {
        println("Play")
    }
}

class Corgi : Dog() {}

fun main() {
    val corgi = Corgi()
    corgi.size = 10
    corgi.play()
    corgi.bark()
    println(corgi.size)
}