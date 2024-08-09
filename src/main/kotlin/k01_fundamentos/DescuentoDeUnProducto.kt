package k01_fundamentos

// Programa que descuenta 10% a un producto, del cual se pide su precio.
fun main() {
    println("PROGRAMA PARA CALCULAR UN DESCUENTO DEL 10% A UN PRODUCTO")

    print("Dime el precio del producto: ")
    val precioInicial: Double = readln().toDouble()

    val descuento: Double = precioInicial * 0.10
    val precioConDescuento: Double = precioInicial - descuento

    println("El precio con descuento es de $precioConDescuento")
}