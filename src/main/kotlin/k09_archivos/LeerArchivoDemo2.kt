package k09_archivos

import java.io.File

fun main() {
    // Ruta del archivo
    val archivo = File("salida2.txt")

    // Leer el archivo línea por línea
    val lineas = archivo.readLines()

    // Imprimir cada línea
    for (linea in lineas) {
        println(linea)
    }
}
