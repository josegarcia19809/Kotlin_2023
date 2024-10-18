package k09_archivos

import java.io.File

val tareas = ArrayList<String>()
val nombreArchivo = "tareas.txt"

fun crearArchivo() {
    val archivo = File(nombreArchivo)
    val existeArchivo = archivo.exists()
    if (!existeArchivo) {
        archivo.createNewFile()
    }
}

fun leerArchivo() {
    val archivo = File(nombreArchivo)
    val existeArchivo = archivo.exists()

    if (existeArchivo) {
        val lineasTareas = archivo.readLines()
        for (lineaTarea in lineasTareas) {
            tareas.add(lineaTarea)
        }
    }
}

fun escribirEnArchivo() {
    val archivo = File(nombreArchivo)
    archivo.writeText(tareas.joinToString("\n"))
}

fun agregarTarea() {
    print("Ingresa una tarea: ")
    val nuevaTarea = readln().trim()
    tareas.add(nuevaTarea.replaceFirstChar { it.uppercase() })
}

fun mostrarTareas() {
    if (tareas.isEmpty()) {
        println("No hay tareas por hacer")
        return
    }

    println("Tareas por hacer: ")
    tareas.forEachIndexed { index, tarea ->
        println("${index + 1}: $tarea")
    }
}

fun editarTarea() {
    try {
        print("Dame número de tarea a editar: ")
        var numero = readln().toInt()
        numero -= 1
        println("Dame nuevo nombre de tarea: ")
        val nuevoNombre = readln()
        tareas[numero] = nuevoNombre.replaceFirstChar { it.uppercase() }
    } catch (e: IndexOutOfBoundsException) {
        println("*********Índice fuera de rango")
    }
}

fun quitarTarea() {
    try {
        print("Dame número de tarea a eliminar: ")
        var numero = readln().toInt()
        numero -= 1
        tareas.removeAt(numero)
    } catch (e: IndexOutOfBoundsException) {
        println("*********Índice fuera de rango")
    }
}

fun main() {
    crearArchivo()
    leerArchivo()
    while (true) {
        print("Escribe agregar, mostrar, editar, eliminar o salir: ")
        val accionUsuario = readln().trim()

        when (accionUsuario) {
            "agregar" -> {
                agregarTarea()
                escribirEnArchivo()
            }

            "mostrar" -> {
                mostrarTareas()
            }

            "editar" -> {
                mostrarTareas()
                editarTarea()
                escribirEnArchivo()
            }

            "eliminar" -> {
                mostrarTareas()
                quitarTarea()
                escribirEnArchivo()
            }

            "salir" -> {
                break
            }

            else -> {
                println("Hey, ingresa una opción válida")
            }
        }
    }
    println("Adios")
}