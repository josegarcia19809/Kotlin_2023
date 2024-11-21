package k12_nullability

fun main() {
    var catName: String? = null
    println(catName ?: "This cat has no name")
    println(catName ?: "Mixi".length)
}


/*
* Este código en Kotlin utiliza el operador Elvis (?:), que permite asignar un valor por
* defecto cuando una variable nullable es null. Vamos línea por línea:

var catName: String? = null
Declara una variable catName de tipo String? (nullable) y le asigna el valor null.

println(catName ?: "This cat has no name")
Imprime el valor de catName si no es null. Como catName es null, imprime el valor por defecto:
* "This cat has no name".

println(catName ?: "Mixi".length)
Aquí, también verifica si catName es null. Como lo es, imprime el resultado de "Mixi".length,
* que evalúa a 4 (la longitud de la cadena "Mixi").
* */