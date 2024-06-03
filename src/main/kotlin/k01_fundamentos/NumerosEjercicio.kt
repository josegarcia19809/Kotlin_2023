package k01_fundamentos

/*
* Ask the user to input a number and read it into a variable.
Convert it to an integer.
Multiply that value with a double variable that you created.
What is the type of the new variable?
Print it to the console.
* */
fun main() {
    print("Ingresa un número: ")
    val entrada = readln()
    val numero = entrada.toInt()
    val numero2 = 12.5
    val resultado = numero2 * numero
    println(resultado)
    println(resultado::class.java)
}