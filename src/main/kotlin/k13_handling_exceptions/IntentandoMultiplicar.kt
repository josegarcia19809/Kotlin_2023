package k13_handling_exceptions

fun main() {
    println("Please enter a number: ")
    val input = readLine()
    try {
        val number = input?.toInt()
        println("$number * 5 = ${number?.times(5)}")
    } catch (e: Exception) {
        println("The value '$input' was not a number'")
        e.printStackTrace()
    }
}

/*
Se intenta convertir la cadena ingresada a un entero (Int). El operador seguro de llamada (?.)
asegura que no se lance una excepción si la entrada es null. Si la conversión fue exitosa,
se calcula number * 5 y se imprime el resultado.

Si ocurre algún error (por ejemplo, si el usuario ingresa un valor que no es un número),
se captura la excepción y:

Se informa al usuario que la entrada no era un número.
Se imprime el seguimiento de la pila de la excepción con e.printStackTrace() (útil para depuración).
 */