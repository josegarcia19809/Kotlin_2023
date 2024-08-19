package k04_arreglos

/*
Este programa muestra un arreglo que fue previamente inicializado con los días de cada mes.
Enero se guarda en la posición 0; Febrero, en la 1; y así sucesivamente
*/

fun main() {
    val dias = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    // Imprimir en pantalla
    for (d in dias) {
        println(d)
    }
    println("-".repeat(100))

    for (index in 0 until 12) {
        println("Mes ${index + 1} tiene ${dias[index]} días.")
    }
}