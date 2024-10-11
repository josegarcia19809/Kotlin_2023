package k09_archivos

import java.io.File

fun main() {
    // Ruta del archivo
    val archivo = File("salida.txt")

    // Texto a escribir en el archivo
    val texto = "Este es el contenido del archivo."

    // Escribimos el texto en el archivo
    archivo.writeText(texto + "\n")
    archivo.appendText(texto)

    println("El archivo ha sido escrito correctamente.")
}
