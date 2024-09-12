package k07_colecciones_in_y_rangos

fun main() {
    val colors = listOf("blue", "green", "red", "black", "blue")
    println(colors)
    println("-".repeat(100))

    // Acceder a los elementos de una lista
    println(colors[0])
    println(colors[2])

    println(colors.get(1))
    println(colors.get(3))

    println(colors.contains("red"))
    println(colors.contains("pink"))

    val newColors = listOf("red", "green")
    println(colors.containsAll(newColors))

    val otherColors = listOf("red", "green", "teal")
    println(colors.containsAll(otherColors))

    println("Index of blue: ${colors.indexOf("blue")}")
    println("Index of teal: ${colors.indexOf("teal")}")

    println("Last index of blue: ${colors.lastIndexOf("blue")}")

    // Tamaño de la lista
    println("Cantidad de colores: ${colors.size}")

    // Crear una lista vacía
    val ventas = listOf<Int>()
    println(ventas)

    // Usar valores nulos
    val productos = listOf("ropa", "medicinas", null)
}