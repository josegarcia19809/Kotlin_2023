package k03_ciclos

// An online store has the following map of customers and number of purchases.
// val customers = hashMapOf(Pair("Alice", 4), Pair("Bob", 6), Pair("Anna", 7))
//For each customer, print out a message telling them how many purchases they made.

fun main() {
    val customers = hashMapOf(Pair("Alice", 4), Pair("Bob", 6), Pair("Anna", 7))
    for (customerName in customers.keys) {
        val purchases = customers[customerName]
        println("$customerName you purchased $purchases items")
    }
}