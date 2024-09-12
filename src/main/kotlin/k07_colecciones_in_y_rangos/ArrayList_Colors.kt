package k07_colecciones_in_y_rangos

fun main() {
    var colors = arrayListOf("black", "white", "red", "green", "blue")
    println(colors)
    println("-".repeat(100))

    // Añadir más colores
    println("Agregando color yellow")
    colors.add("yellow")
    println(colors)
    println("-".repeat(100))

    // Agregar otra colección
    val moreColors = arrayListOf("pink", "teal")
    colors.addAll(moreColors)
    println(colors)
    println("-".repeat(100))

    // Quitar un elemento
    colors.remove("red")
    println(colors)
    println("-".repeat(100))

    // Quitar varios elementos
    colors.removeAll(moreColors)
    println(colors)
    println("-".repeat(100))

    // Remover un color en una posición
    colors.removeAt(1)
    println(colors)
    println("-".repeat(100))

    // Si la lista contiene elementos duplicados, la función remove solo quitará el primero de ellos
    colors.add("blue")
    println(colors)
    colors.remove("blue")
    println(colors)
    println("-".repeat(100))

    colors.add("red")
    println(colors)
    println("-".repeat(100))

    colors.set(1, "redder")
    println(colors)
    println("-".repeat(100))

    var subListColors = colors.subList(1, 2)
    println(subListColors)
    println("-".repeat(100))

    subListColors = colors.subList(1, 3)
    println(subListColors)
    println("-".repeat(100))

    colors.clear()
    println(colors)
    println("-".repeat(100))

    println("¿Está vacía la lista? ${colors.isEmpty()}")
}