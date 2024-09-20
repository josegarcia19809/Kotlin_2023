package k07_colecciones_in_y_rangos

fun main() {
    val tareas = ArrayList<String>()
    tareas.addAll(listOf("Barrer", "Cocinar", "Festejar con los amigos"))
    while (true) {
        print("Escribe agregar, mostrar, editar, eliminar o salir: ")
        val accionUsuario = readln().trim()

        when (accionUsuario) {
            "agregar" -> {
                print("Ingresa una tarea: ")
                val nuevaTarea = readln().trim()
                tareas.add(nuevaTarea.replaceFirstChar { it.uppercase() })
            }

            "mostrar" -> {
                tareas.forEachIndexed { index, tarea ->
                    println("${index + 1}: $tarea")
                }
            }

            "editar" -> {
                print("Dame número de tarea a cambiar: ")
                var numero = readln().toInt()
                numero -= 1
                print("Dame nuevo nombre de tarea: ")
                val nuevoNombre = readln()
                tareas[numero] = nuevoNombre.replaceFirstChar { it.uppercase() }
            }

            "eliminar" -> {
                print("Dame número de tarea a eliminar: ")
                var numero = readln().toInt()
                numero -= 1
                tareas.removeAt(numero)
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