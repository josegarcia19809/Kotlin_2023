package k05_funciones

/* GastosPapeleria
* Una papelería vende lapices a $4.00 cada uno; gomas a $2.50; y brújulas a $12.00.
* Escribir una función que reciba el nombre del artículo, su precio, y la cantidad a comprar.
* La función debe mostrar el total a pagar de ese artículo.
* */

fun cobrarVentaDelArticulo(nombre: String, precio: Double, cantidad: Int) {
    val totalVenta = precio * cantidad
    println("Cobro de $nombre: $totalVenta")
    println("-".repeat(100))
}

fun mostrarMenuProductos() {
    println("Elige tu producto")
    println("1. Lapices")
    println("2. Gomas")
    println("3. Brujulas")
    println("4. Salir")
    print("? ")
}

fun main() {
    println("Papelería la Nueva")
    do {
        mostrarMenuProductos()
        val opcion = readln().toInt()
        if (opcion in 1..3) {
            val nombre = when (opcion) {
                1 -> "Lápiz"
                2 -> "Goma"
                3 -> "Brújula"
                else -> "Otro"
            }
            print("Dame precio de $nombre: ")
            val precio = readln().toDouble()

            print("Dame cantidad a comprar: ")
            val cantidad = readln().toInt()

            cobrarVentaDelArticulo(nombre, precio, cantidad)
        } else if (opcion != 4) {
            println("Opción no válida. Por favor elige una opción del menú.")
        }
    } while (opcion != 4);
}