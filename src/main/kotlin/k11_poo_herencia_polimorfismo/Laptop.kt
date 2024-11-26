package k11_poo_herencia_polimorfismo

/*
    Inheritance
    A class Laptop has characteristics like screenSize and speed,
    and a function run that prints out a message which includes its characteristics.
    A class Apple is a Laptop, so it inherits the laptop characteristics.
    However it has a smaller screen size.
    Implement this in a program, call the method run in both Laptop and
    Apple, and observe the different values.
 */
open class Laptop {
    var speed = 0
    var screenSize = 0

    fun printCharacteristicsLaptop() {
        println("Laptop speed: $speed, screen size: $screenSize")
    }
}

class Apple : Laptop() {}

fun main() {
    val laptop = Laptop()
    laptop.screenSize = 15
    laptop.speed = 1000
    laptop.printCharacteristicsLaptop()

    val apple = Apple()
    apple.screenSize = 13
    apple.speed = 2000
    apple.printCharacteristicsLaptop()
}