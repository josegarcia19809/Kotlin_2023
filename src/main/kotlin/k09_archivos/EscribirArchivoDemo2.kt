package k09_archivos

import java.io.File

fun main() {
    // Ruta del archivo
    val archivo = File("salida2.txt")

    // Varias líneas de texto
    val lineas = listOf(
        "Primera línea del archivo.",
        "Segunda línea del archivo.",
        "Tercera línea del archivo."
    )

    // Escribimos todas las líneas en el archivo, sobrescribiendo el contenido anterior
    archivo.writeText(lineas.joinToString("\n"))

    println("El archivo ha sido escrito correctamente con varias líneas.")
}
