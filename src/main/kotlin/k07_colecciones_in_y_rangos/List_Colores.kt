package k07_colecciones_in_y_rangos

// Listas (List)
fun main() {
    val colores = listOf("azul", "verde", "rojo", "negro", "azul")
    println("colores: $colores")
    println("-".repeat(100))

    // Acceder a los elementos de la lista
    println("Primer elemento: ${colores[0]}") // primer azul
    println("Tercer elemento: ${colores[2]}") // rojo
    println("-".repeat(100))

    println("Segundo elemento: ${colores.get(1)}") // verde
    println("Cuarto elemento: ${colores.get(3)}") // negro
    println("-".repeat(100))

    // Búsquedas
    println("Existe el rojo en la lista de colores? ${colores.contains("rojo")}")
    println("Existe el rosa en la lista de colores? ${colores.contains("rosa")}")
    println("-".repeat(100))


    val nuevosColores = listOf("rojo", "verde")
    println("nuevosColores: $nuevosColores")
    println("¿colores contiene a nuevosColores? ${colores.containsAll(nuevosColores)}")

    val otrosColores = listOf("rojo", "verde", "morado")
    println("otrosColores: $otrosColores")
    println("¿colores contiene a otrosColores? ${colores.containsAll(otrosColores)}")
    println("-".repeat(100))

    // Buscar el índice de los elementos
    println("Índice del primer azul: ${colores.indexOf("azul")}") // 0
    println("Índice del primer morado: ${colores.indexOf("morado")}") // -1

    println("Índice del último azul: ${colores.lastIndexOf("azul")}") // 4
    println("-".repeat(100))

    // Tamaño de la lista
    println("Cantidad de colores: ${colores.size}")
}