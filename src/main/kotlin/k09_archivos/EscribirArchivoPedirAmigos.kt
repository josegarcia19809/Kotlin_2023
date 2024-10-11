package k09_archivos

// EscribirArchivoPedirAmigos

// El programa primero nos debe pedir cuántos amigos tenemos. Según el número de
// amigos que le hayamos dado, nos pedirá sus nombres. El programa escribirá
// dichos nombres en un archivo de texto

import java.io.File

fun main() {
    println("Programa para lista de amigos")
    print("¿Cuántos amigos tienes? ")
    val numAmigos = readln().toInt()

    // Crear un ArrayList vacío
    val listaAmigos = arrayListOf<String>()

    for (i in 1..numAmigos) {
        print("Escribe el nombre tu amigo #$i: ")
        val nombreAmigo = readln()
        // Anexar al ArrayList
        listaAmigos.add(nombreAmigo)
    }

    // Escribir a un archivo
    val archivo = File("amigos_lista.txt")
    archivo.writeText(listaAmigos.joinToString("\n"))
    println("La lista de amigos se ha creado correctamente")
    println("Abre el archivo amigos_lista.txt")

}