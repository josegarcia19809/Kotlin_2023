package k09_archivos

import java.io.File

fun main() {
    // Ruta del archivo
    val archivo = File("salida.txt")

    // Leer todo el contenido del archivo
    val contenido = archivo.readText()

    // Imprimir el contenido del archivo
    println(contenido)
}
