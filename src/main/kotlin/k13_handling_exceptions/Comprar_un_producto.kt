package k13_handling_exceptions

/*
    A customer will tell the program what product they want to buy.
    Then, they will tell the program how many products they require.
    Assume the price of the product is 9.99
    What is the total?
    Handle any exceptions that might occur.
 */

fun main() {
    print("What product do you want to buy? ")
    val product = readln()
    print("How many products($product) do you require? ")
    try {
        val requireProducts = readln().toInt()
        val price = 9.99
        println("You pay ${requireProducts * price} dollars")
    } catch (e: Exception) {
        println("The input is not a number")
    } finally {
        println("Transation completed")
    }
}