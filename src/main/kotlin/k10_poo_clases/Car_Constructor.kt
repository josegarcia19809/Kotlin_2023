package k10_poo_clases

import k05_funciones.imprimirLinea

// POO: Múltiples constructores - Car
class Car1(var model: String, var topSpeed: Int) {
    fun printInfo() {
        println("Model: $model, Top Speed: $topSpeed ")
    }
}

// Múltiples Constructores
class Car2 {
    var model: String = ""
    var topSpeed: Int = 100

    constructor() {
        model = "No model"
        topSpeed = 1000
    }

    constructor(newModel: String) {
        model = newModel
        topSpeed = 1000
    }

    constructor(newModel: String, newSpeed: Int) {
        model = newModel
        topSpeed = newSpeed
    }

    fun printInfo() {
        println("Model: $model, Top Speed: $topSpeed ")
    }
}

fun main() {
    val car1 = Car1("BMV", 2000)
    car1.printInfo()
    imprimirLinea()

    // Cuál constructor se utilizará? depende del número de parámetros
    val car2 = Car2()
    car2.printInfo()
    imprimirLinea()

    val car3 = Car2("Chevrolet")
    car3.printInfo()
    imprimirLinea()

    val car4 = Car2("Jetta", 200)
    car4.printInfo()
}