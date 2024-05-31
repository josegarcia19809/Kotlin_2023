package k08_cadenas

import java.util.*

fun main() {
    val miMascota = "Cocodrilo"
    println(miMascota.length)

    val miNombre = "josé"
    // miNombre.capitalize()
    println(miNombre.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })

    val miApellido = "García"
    // miapellido.decapitalize()
    println(miApellido.replaceFirstChar { it.lowercase(Locale.getDefault()) })

    val entrada = "     Aqui hay muchos espacios      "
    println(entrada.trim())

    // Obtener un carácter
    println(miApellido.get(3))
    println(miApellido[3])

    // Obtener una subcadena
    println(miApellido.substring(3))
    println(miApellido.substring(3, 5)) // Índice inicial, índice final exclusivo

    println("Nombre: $miNombre")

    val diasTrabajados = 5
    val salarioPorDia = 250
    println("Tu salario es de $${salarioPorDia * diasTrabajados} pesos")
}