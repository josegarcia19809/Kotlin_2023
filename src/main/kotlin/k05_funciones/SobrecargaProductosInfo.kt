package k05_funciones

// SobrecargaProductosInfo

// Se puede involucrar el manejo de productos en una tienda para mostrar su información
// Puedes sobrecargar una función que maneje un solo producto o una lista de productos
// y muestre la información

// Función que imprime la información de un solo producto
fun imprimirInfoProducto(producto: String) {
    println("El producto $producto - Se ha agregado al carrito")
}

// Función sobrecargada que imprime información de varios productos
fun imprimirInfoProducto(productos: List<String>) {
    println("Se han añadido los siguientes productos al carrito:")
    for (producto in productos) {
        println("- $producto")
    }
}

fun main() {
    // Ejemplo con un solo producto
    imprimirInfoProducto("Laptop")

    // Ejemplo con varios productos
    val listaProductos = listOf("Teclado", "Ratón", "Monitor")
    imprimirInfoProducto(listaProductos)
    imprimirLinea()
}