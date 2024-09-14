package k07_colecciones_in_y_rangos

fun main() {
    val colores = arrayListOf("negro", "azul", "blanco", "rojo", "verde")
    println("colores: $colores")
    println("-".repeat(100))

    // Agregar más colores
    println("Agregando el amarillo")
    colores.add("amarillo")
    println("colores: $colores")
    println("-".repeat(100))

    // Agregar una colección de elementos
    val masColores = arrayListOf("rosa", "morado")
    println("Agregando $masColores")
    colores.addAll(masColores)
    println("colores: $colores")
    println("-".repeat(100))

    // Quitar un elemento
    // Si la lista contiene elementos duplicados, la función remove solo quitará el primero de ellos
    println("Quitando el color rojo")
    colores.remove("rojo")
    println("colores: $colores")
    println("-".repeat(100))

    // Quitar varios elementos
    println("Quitando $masColores")
    colores.removeAll(masColores)
    println("colores: $colores")
    println("-".repeat(100))

    // Remover un color en una posición
    println("Quitando elemento en posición 1 (azul)")
    colores.removeAt(1)
    println("colores: $colores")
    println("-".repeat(100))

    // Cambiar el valor de un elemento
    println("Cambiando amarillo por 'muy amarillo'")
    colores.set(3, "muy amarillo")
    println("colores: $colores")
    println("-".repeat(100))

    // Obtener una sublista de [negro, blanco, verde, muy amarillo]
    var sublistaColores = colores.subList(1, 3) // Solo obtendrá los elementos 1 y 2
    println("sublistaColores: $sublistaColores")
    println("-".repeat(100))

    // Limpiar el ArrayList
    colores.clear()
    println("Después de limpiar el ArrayList")
    println("colores: $colores")
    println("-".repeat(100))

    // Preguntar si la lista está vacía
    println("¿Está vacía la lista? ${colores.isEmpty()}")
    println("-".repeat(100))
}