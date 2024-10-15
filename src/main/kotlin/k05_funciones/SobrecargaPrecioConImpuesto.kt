package k05_funciones

// SobrecargaPrecioConImpuesto

// Crea una función que reciba el nombre de un producto y su precio.
// Añade un impuesto del 20% al producto y muestra un mensaje
// indicando cuánto cuesta el producto

// Sobrecarga la función para que reciba un mapa de productos y precios
// y que haga lo mismo con cada producto

// Llama a ambas funciones en tu programa principal

// Función que recibe el nombre de un producto y su precio
fun calcularPrecioConImpuesto(producto: String, precio: Double) {
    val precioConImpuesto = precio * 1.20
    println("El producto $producto cuesta $precioConImpuesto pesos, con un impuesto del 20%")
}

fun calcularPrecioConImpuesto(productos: Map<String, Double>) {
    for ((producto, precio) in productos) {
        val precioConImpuesto = precio * 1.20
        println("El producto $producto cuesta $precioConImpuesto pesos, con un impuesto del 20%")
    }
}

fun main() {
    // Se llama a la función con solo un producto
    calcularPrecioConImpuesto("Laptop", 1000.00)
    imprimirLinea()

    // Se llama a la función sobrecargada y le pasamos un mapa de productos
    val mapaProductos = mapOf(
        "Teclado" to 50.00,
        "Ratón" to 30.00,
        "Monitor" to 200.00
    )
    calcularPrecioConImpuesto(mapaProductos)
    imprimirLinea()
}