package k09_archivos

// LeerArchivoVerificacion

// Antes de abrir un archivo tenemos que verificar que el archivo exista,
// si no existe, mandar el aviso correspondiente

import java.io.File

fun main() {
    // Pedir el nombre del archivo a abrir
    print("Dame el nombre del archivo: ")
    val nombreArchivo = readln()

    val archivo = File(nombreArchivo)

    // Verificar si el archivo existe
    if (archivo.exists()) {
        println("El archivo existe")
    } else {
        println("El archivo no existe")
        archivo.createNewFile()
        println("Archivo $archivo creado")
    }
}