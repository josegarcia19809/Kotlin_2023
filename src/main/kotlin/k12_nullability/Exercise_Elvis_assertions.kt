package k12_nullability

/*
A product costs 29.99.
Ask a user at the console how many products they want to buy.
If the read value is null, use the default of one.
Print the total of the purchase.
 */

fun main() {
    val cost = 29.99
    print("How many products would you want to buy? ")
    val input = readLine()
    val purchasedProducts = input?.toIntOrNull() ?: 1

    println("The total of the purchase is ${purchasedProducts * cost}")
}

/*
Este código en Kotlin calcula el costo total de una compra basada en el número de productos que
el usuario desea adquirir. Vamos a desglosarlo:

Explicación del código:

val input = readLine()
Lee la entrada del usuario como una cadena (String?). Si el usuario no ingresa nada,
el valor será null.

val purchasedProducts = input?.toIntOrNull() ?: 1

Usa el operador seguro (?.) para intentar convertir input a un número entero utilizando
toIntOrNull().
Si la conversión falla (por ejemplo, porque el usuario ingresó texto no numérico), devuelve null.
Con el operador Elvis (?:), asigna el valor por defecto 1 si input es null o no es un número válido.
println("The total of the purchase is ${purchasedProducts!! * cost}")

Calcula el costo total multiplicando purchasedProducts por cost.
 */