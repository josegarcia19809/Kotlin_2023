package k15_maps

/*
You have a map of customers with how many products they have bought.
var customers = mapOf(Pair ("John", 1), Pair"Alice", 5), Pair ("Bob", 3))
Is "Alice" a customer? How many products did they buy?
Is "Michael" a customer?
 */

fun main() {
    var customers = mapOf(Pair("John", 1), Pair("Alice", 5), Pair("Bob", 3))
    println("Is \"Alice\" a customer? ${customers.containsKey("Alice")}")
    println("How many products did they buy? ${customers["Alice"]}")

    println("Is \"Michael\" a customer? ${customers.containsKey("Michael")}")
}
