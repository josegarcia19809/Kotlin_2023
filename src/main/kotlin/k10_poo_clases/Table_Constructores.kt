package k10_poo_clases

import k05_funciones.imprimirLinea

// POO: Múltiples constructores - Table
/*
    Constructors
    Create a class Table that has the variables legs and height.
    Provide 3 different constructors.
    Create 3 objects using the different constructors and print out the variable values.
 */

class Table {
    var legs = 0
    var height = 120

    constructor() {
        legs = 4
        height = 30
    }

    constructor(newLegs: Int, newHeight: Int) {
        legs = newLegs
        height = newHeight
    }

    constructor(newHeight: Int) {
        legs = 3
        height = newHeight
    }

    fun printInfo() {
        println("Legs: $legs, Height: $height")
    }
}

fun main() {
    val table1 = Table()
    table1.printInfo()
    imprimirLinea()

    val table2 = Table(150)
    table2.printInfo()
    imprimirLinea()

    val table3 = Table(4, 200)
    table3.printInfo()
}
