package k09_archivos

// EscribirArchivo4Amigos

// Este programa escribirá un archivo que tendrá 4 líneas
// En cada línea debe aparecer el nombre de un amigo

import java.io.File

fun main() {
    val archivo = File("amigos4.txt")

    val salidaArchivo = listOf(
        "Rox",
        "Isaac",
        "Carolina",
        "Ami"
    )

    archivo.writeText(salidaArchivo.joinToString("\n"))

    println("El archivo amigos4.txt se ha escrito correctamente")
}