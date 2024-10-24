package k15_clases

fun main() {
    val tareas = ArrayList<String>()
    tareas.add("Barrer")
    tareas.add("Trapear")
    tareas.add("Planchar")

    while (true) {
        print("Escribe agregar, mostrar, editar, quitar o salir: ")
        val accionUsuario = readLine()?.trim()

        when (accionUsuario) {
            "agregar" -> {
                print("Ingresa una tarea: ")
                val tarea = readLine()?.capitalize()
                tarea?.let { tareas.add(it) }
            }
            "mostrar" -> {
                tareas.forEachIndexed { index, tarea ->
                    println("${index + 1}: $tarea")
                }
            }
            "editar" -> {
                print("Dame número de tarea a cambiar: ")
                val numero = readLine()?.toIntOrNull()?.minus(1)
                if (numero != null && numero in tareas.indices) {
                    print("Dame nueva tarea: ")
                    val nuevaTarea = readLine()?.capitalize()
                    nuevaTarea?.let { tareas[numero] = it }
                } else {
                    println("Número inválido")
                }
            }
            "quitar" -> {
                print("Dame número de tarea a eliminar: ")
                val numero = readLine()?.toIntOrNull()?.minus(1)
                if (numero != null && numero in tareas.indices) {
                    tareas.removeAt(numero)
                } else {
                    println("Número inválido")
                }
            }
            "salir" -> break
            else -> println("Hey, has ingresado una instrucción desconocida")
        }
    }

    println("¡Adios!")
}
