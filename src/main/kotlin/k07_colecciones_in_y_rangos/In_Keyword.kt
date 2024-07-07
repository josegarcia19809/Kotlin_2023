package k07_colecciones_in_y_rangos

fun main() {
    val favouritePet = "dog"
    val availablePets = listOf("dog", "cat", "horse")

    if (favouritePet in availablePets) { // si está el elemento en la lista
        println("We have your next best friend")
    } else {
        println("Sorry, $favouritePet is not available")
    }


    println("Enter your preferred coffe: ")
    val coffe = readln()
    val availableCoffees = listOf("capuccino", "mocha")
    if (coffe !in availableCoffees) { // Si no está el elemento en la lista
        println("Sorry, $coffe is not available")
    } else {
        println("$coffe is available")
    }

    println("Please, enter a number: ")
    val num = readln().toInt()
    if (num !in 1..9){
        println("Your number is not single digit")
    }

}