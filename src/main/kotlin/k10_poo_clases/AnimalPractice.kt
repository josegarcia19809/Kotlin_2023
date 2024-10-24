package k10_poo_clases
/*
* Crea una clase llamada Animal. Tiene una variable topSpeed y una función run() que
* imprime un mensaje indicando la velocidad máxima del animal.
Crea un objeto de esa clase y ejecuta la función.
Actualiza la variable y ejecuta la función nuevamente.
* */
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