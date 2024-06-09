package k01_fundamentos

/*
* Ask the user to input a number of type double.
Multiply it by pi
var pi = 4.14159
Print the type of the resulting variable.
Print the result.
* * */
fun main() {
    print("Please enter a number: ")
    val numInput: Double = readln().toDouble()
    val pi = 3.14159
    val result = numInput * pi

    println("$result is of type ${result::class.java}")
}