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

    // Ejercicios:
    // 1. Extraer la longitud de la frase: "Cuando pierdas, no pierdas la lección."
    // 2. Extraer la palabra "pierdas" de la frase anterior
    // 3. Cuando el nombre de un cliente en una variable, después imprime un mensaje personalizado
    // para ese cliente.
    // 4. Usa 2 variables, una para guardar la cantidad de manzanas y otra para la cantidad de peras
    // después imprime el total de frutas que se tienen.
    // 5. A client has purchased a number of products that have a certain price
    // Print out the total amount that the client needs to pay
    //
    // val client = “Mary”
    // val products = 3
    // val price = 30
}