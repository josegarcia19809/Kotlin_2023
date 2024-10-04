package k05_funciones

fun printDouble(number: Int) {
    println("Double of $number is ${number * 2}")
}

fun sayHelloPeople(people: Collection<String>) {
    for (person in people) {
        println("Hi $person")
    }
}

// Default values
fun showMessage(number: Int, message: String = "Your number is") {
    println("$message is $number")
}

fun multiplyBy5(a: Int) {
    println("$a x 5 = ${a * 5}")
}

fun main() {
    printDouble(5)
    imprimirLinea()

    val peopleToGreeting = listOf("Ana", "Carolina", "Rox")
    sayHelloPeople(peopleToGreeting)
    imprimirLinea()

    showMessage(12, "My number is")
    showMessage(23)
    imprimirLinea()

    for (i in 1..3) {
        multiplyBy5(i)
    }
}