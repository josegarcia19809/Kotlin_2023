package k05_funciones

// FuncionDescuento

// la función calcularDescuento debe recibir dos valores: uno de tipo Double,
// que guarde una variable para el precio del producto;
// otra, de tipo entero para el porcentaje de descuento. Debe mostrar el descuento
// Si tengo un producto que cuesta $1000.00 y tiene un descuento del 25%
// Cuánto es el descuento: 1000 * (25/100) = 1000 * .25 = 250

fun calcularDescuento(precio: Double, porcentajeDescuento: Int) {
    val descuento = precio * (porcentajeDescuento / 100.0)
    println("El descuento de este producto es de $${String.format("%.2f", descuento)}")
}

fun main() {
    calcularDescuento(1000.00, 25)
    imprimirLinea()
}