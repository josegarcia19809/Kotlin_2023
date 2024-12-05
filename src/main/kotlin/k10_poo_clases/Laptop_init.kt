package k10_poo_clases

/*
    A laptop needs to have an operating system when running for the first time.
    Design a program that creates a class Laptop and prints a message that the operating system is
    being installed whenever an object of that class is created.
 */

class Laptop(val operatingSystem: String) {
    init {
        println("Operating System: $operatingSystem is installing")
    }
}

fun main() {
    val newLaptop = Laptop("Windows 10")
}