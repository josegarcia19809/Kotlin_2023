package k05_funciones

// MetodoSaludar
/*
* La función saludar debe recibir un valor de tipo String. Posteriormente mostrará un mensaje
* */

fun saludar(nombre: String) {
    println("Hola amigo(a) $nombre")
}

fun main() {
    saludar("José")
    saludar("Luis")
    saludar("Rox")
    saludar("Fabiola")
    imprimirLinea()
}