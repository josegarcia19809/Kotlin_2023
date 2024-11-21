package k12_nullability

fun main() {
    println("Input a message:")
    val message = readLine()
    println(message ?: "Hi how are you?")
}
/*
Este código en Kotlin solicita al usuario que ingrese un mensaje. Si el usuario no introduce
nada (null), se muestra un mensaje por defecto. Vamos a desglosarlo:

println("Input a message:")
Imprime el texto "Input a message:" para solicitar al usuario que escriba algo.

val message = readLine()
Lee la entrada del usuario desde la consola y la asigna a la variable message.
La función readLine() devuelve un valor de tipo String? (nullable).
Si el usuario no introduce nada, el valor de message será null.

println(message ?: "Hi how are you?")
Usa el operador Elvis (?:). Si message no es null, imprime el valor ingresado por el usuario.
Si es null, imprime el texto por defecto "Hi how are you?".
 */