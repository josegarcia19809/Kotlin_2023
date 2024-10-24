package k10_poo_clases

/*
* Crea una clase llamada Mathematic. Tiene cuatro funciones:

Add: toma dos parámetros y devuelve la suma.
Sub: toma dos parámetros y devuelve la resta.
Mul: toma dos parámetros y devuelve la multiplicación.
Div: toma dos parámetros y devuelve la división.
Crea un objeto de esa clase y prueba sus métodos.
* */

class Mathematic {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun sub(a: Int, b: Int): Int {
        return a - b
    }

    fun mul(a: Int, b: Int): Int {
        return a * b
    }

    fun div(a: Int, b: Int): Int {
        return a / b
    }
}

fun main() {
    val mathematic = Mathematic()
    println("3 + 7 = ${mathematic.add(3, 7)}")
    println("7 * 5 = ${mathematic.mul(7, 5)}")
    println("2 - 8 = ${mathematic.sub(2, 8)}")
    println("7 / 2 = ${mathematic.div(7, 2)}")
}