package k05_funciones

/* GastosPapeleria
* Una papelería vende lapices a $4.00 cada uno; gomas a $2.50; y brújulas a $12.00.
* Escribir una función que reciba el nombre del artículo, su precio, y la cantidad a comprar.
* La función debe mostrar el total a pagar de ese artículo.
* */

fun cobrarVentaArticulo(nombre: String, precio: Double, cantidad: Int) {
    val totalVenta = precio * cantidad
    println("Cobro de $nombre: $totalVenta")
    println("-".repeat(100))
}

fun main() {
    // cobrarVentaArticulo("lápiz", 4.0, 2)
    println("Papelería la Nueva")
    println("Elige tu producto")
    println("1. Lapices")
    println("2. Gomas")
    println("3. Brujulas")
    print("? ")
    val opcion = readln().toInt()
    var nombre: String = ""
    if (opcion == 1) {
        nombre = "Lápiz"
    } else if (opcion == 2) {
        nombre = "Goma"
    } else if (opcion == 3) {
        nombre = "Brújula"
    }

    print("Dame precio de $nombre: ")
    val precio = readln().toDouble()

    print("Dame cantidad a comprar: ")
    val cantidad = readln().toInt()

    cobrarVentaArticulo(nombre, precio, cantidad)
}