package k09_archivos

import java.io.File

fun main() {
    // Ruta del archivo
    val archivo = File("salida3.txt")

    // Varias líneas de texto
    val lineas = listOf(
        "Primera línea del archivo.",
        "Segunda línea del archivo.",
        "Tercera línea del archivo."
    )

    // Escribimos o agregamos cada línea en el archivo
    for (linea in lineas) {
        archivo.appendText(linea + "\n")
    }

    println("Las líneas han sido agregadas al archivo correctamente.")
}
