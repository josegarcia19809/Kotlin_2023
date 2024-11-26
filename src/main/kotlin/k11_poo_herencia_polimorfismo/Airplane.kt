package k11_poo_herencia_polimorfismo

/*
    Inheritance
    An Airplane has speed and altitude. It also two methods, ascend which increases altitude,
    and descend, which decreases altitude.
    Create two classes that inherit from Airplane, Boeing and Airbus. They have diferent speeds.
    Create objects, call methods and print out messages for both child classes.
 */
import k05_funciones.imprimirLinea

open class Airplane {
    var name = "Airplane"
    var speed = 100
    var altitude = 1000

    fun ascend() {
        altitude += 100
    }

    fun descend() {
        altitude -= 100
    }

    fun printInfo() {
        println("Name: $name, Speed: $speed, Altitude: $altitude")
    }
}

class Boeing : Airplane() {}

class Airbus : Airplane() {}

fun main() {
    val boeing = Boeing()
    boeing.name = "Boeing"
    repeat(10, action = { boeing.ascend() })
    boeing.printInfo()
    repeat(5, action = { boeing.descend() })
    boeing.printInfo()
    imprimirLinea()
    val airbus = Airbus()
    airbus.name = "Airbus"
    repeat(6, action = { airbus.ascend() })
    airbus.printInfo()
    repeat(10, action = { airbus.descend() })
    airbus.printInfo()
}