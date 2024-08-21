package k04_arreglos

fun main() {
    // Declarar e inicializar el array con los valores proporcionados
    val voltios = arrayOf(11.95, 16.32, 12.15, 8.22, 15.98, 26.22, 13.54, 6.45, 17.59)

    // Imprimir los valores en formato de 3 renglones con 3 columnas
    for (i in voltios.indices) {
        if (i % 3 == 0 && i != 0) {
            println() // Nueva línea después de cada 3 valores
        }
        print("${voltios[i].toString().padStart(8)} ")
    }
}