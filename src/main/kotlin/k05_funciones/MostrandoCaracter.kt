package k05_funciones

// MostrandoCaracter

// Escribe una función que se llame mostrarCaracter. La función debe aceptar 2
// argumentos: una cadena y un caracter. El entero es la posición de caracter dentro del string,
// donde el primer caracter está en la posición 0.
// Ejemplo: mostrarCaracter("New York", 2) Debe devolver la letra 'w' porque está en la
// posición 2

fun mostrarCaracter(texto: String, posicion: Int): Char {
    return texto[posicion]
}

fun main() {
    println(mostrarCaracter("New York", 2))
    println(mostrarCaracter("Mexico", 2))
    println(mostrarCaracter("Atlacomulco", 6))
}