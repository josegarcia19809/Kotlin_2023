package k12_nullability

fun main() {
    var catName: String? = null
    catName = "Mixi"
    println(catName!!.length)
}

/*
Este código en Kotlin asigna un valor a una variable nullable y utiliza el operador de
not-null assertion (!!) para asegurar que no es null. Vamos a explicarlo:

var catName: String? = null
Declara una variable catName de tipo String? (nullable) y la inicializa con null.

catName = "Mixi"
Asigna el valor "Mixi" a la variable catName. Ahora catName ya no es null.

println(catName!!.length)
Aquí se usa el operador !! para afirmar que catName no es null. Esto permite acceder directamente
a sus propiedades, como length. Si catName fuera null, se lanzaría una
excepción NullPointerException. En este caso, catName contiene "Mixi", por lo que imprime 4
(la longitud de la cadena).
 */