package k12_nullability


fun main() {
    // Declare a nullable variable of type String and give it a value
    // Print out a substring of it, from position 3 to 6
    var message: String? = "I like_dogs"
    println(message?.substring(3, 6))

    // Declare a nullable variable of type Double
    // Multiply it by 6, convert it to a Float and print it to the console
    var b: Double? = 15.0
    b = b?.times(6)
    println(b?.toFloat())

    // Receive the name of the user from the console
    // Print out the length of the name
    print("Write your name: ")
    var userName = readlnOrNull()
    println(userName?.length)
}