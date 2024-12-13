package k14_sets

/*
    You have a set of the first 10 prime numbers.
    val numbers = setOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
    Is the number 21 a prime number? Print out the result.
    Is the number 13 a prime number? Print out the result.
 */
fun main() {
    val numbers = setOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
    println("Is the number 21 a prime number? ${numbers.contains(21)}")
    println("Is the number 13 a prime number? ${numbers.contains(13)}")
}