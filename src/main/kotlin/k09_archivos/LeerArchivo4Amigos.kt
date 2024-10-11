package k09_archivos

// LeerArchivo4Amigos

import java.io.File

fun main() {
    val archivo = File("amigos45.txt")

    // Leer el archivo línea por línea
    val lineas = archivo.readLines()

    // Imprimir cada linea
    for (linea in lineas) {
        println(linea)
    }
}