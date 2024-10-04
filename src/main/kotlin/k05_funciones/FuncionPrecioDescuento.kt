package k05_funciones

// la función calcularPrecioConDescuento debe recibir dos valores: uno de tipo Double,
// que guarde una variable para el precio del producto;
// otra, de tipo entero para el porcentaje de descuento. Debe mostrar el precio con el descuento
// Si tengo un producto que cuesta $1000.00 y tiene un descuento del 25%
// Cuánto es el descuento: 1000 * (25/100) = 1000 * .25 = 250
// Cuál es el precio del producto: 1000.00 - 250.00 = 750.00

fun calcularPrecioConDescuento(precio: Double, porcentajeDescuento: Int) {
    val descuento = precio * (porcentajeDescuento / 100.0)
    val precioConDescuento = precio - descuento
    println("El precio con descuento es $${String.format("%.2f", precioConDescuento)}")
}

fun main() {
    // Pedir el precio y el porcentaje de descuento
    println("Calculando descuentos a lo grande")

    print("Dame el precio del producto: ")
    val precioProducto = readln().toDouble()

    print("Dame el porcentaje de descuento: ")
    val porcentaje = readln().toInt()

    // calcularPrecioConDescuento(1000.00, 25) // $750.00
    calcularPrecioConDescuento(precioProducto, porcentaje)
    imprimirLinea()
}