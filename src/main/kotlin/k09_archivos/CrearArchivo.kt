package k09_archivos

import java.io.File

fun main() {
    // Ruta del archivo
    val archivo = File("salida.txt")

    // Verificar si el archivo no existe y crearlo
    if (archivo.createNewFile()) {
        println("El archivo ha sido creado.")
    } else {
        println("El archivo ya existe.")
    }

    // Escribir algo en el archivo si es necesario
    archivo.writeText("Contenido inicial del archivo.")
}
