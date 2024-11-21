package k12_nullability

fun main() {
    println("Input a number:")
    val input = readLine()
    val number = input?.toInt()
    println("$number multiplied by 5 es ${number!! * 5}")
}

/*
Este código en Kotlin solicita al usuario que ingrese un número, lo convierte a un entero y lo
multiplica por 5. Aquí tienes la explicación:

Código explicado
println("Input a number:")
Muestra en la consola el mensaje: "Input a number:", solicitando al usuario que ingrese un número.

val input = readLine()
Lee la entrada del usuario como una cadena (String?) y la asigna a la variable input.
Este valor puede ser null si no se ingresa nada.

val number = input?.toInt()
Convierte la entrada de texto a un entero utilizando toInt(), pero solo si input no es null.
Si input es null, entonces number también será null.

println("$number multiplied by 5 es ${number!! * 5}")

Usa la interpolación de cadenas ($number y ${number!! * 5}).
El operador !! se utiliza para garantizar que number no es null. Si number es null, el programa
lanzará una excepción NullPointerException.
Calcula el producto de number por 5 y lo imprime.
 */