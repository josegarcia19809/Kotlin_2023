package k05_funciones

// CalculadoraPrecioMenudeo

// Escribe un programa que le pida al  usuario que ingrese el costo al por mayor de un artículo
// y su margen de ganancia. Luego debe mostrar el precio al menudeo del artículo.

// Por ejemplo:
// Si el costo al por mayor del artículo es de $5.00 y el porcentaje de margen de ganancia
// es del 100%, entonces el precio de venta al menudeo es $10.00

// Si el costo al menudeo fue de $5.00 y el porcentaje de margen de ganancia es del 50%, entonces
// el precio de venta al menudeo es de $7.50

// El programa debe tener una función que se llame calcularPrecioMenudeo que reciba el costo
// al por mayor y el porcentaje de margen de ganancia como argumentos y devuelva el precio
// de venta al menudeo del artículo

fun calcularPrecioMenudeo(costoMayoreo: Double, porcentajeGanancia: Int): Double {
    val ganancia = costoMayoreo * porcentajeGanancia / 100
    val precioMenudeo = costoMayoreo + ganancia

    return precioMenudeo
}

fun main() {
    // println(calcularPrecioMenudeo(5.00, 100))
    // println(calcularPrecioMenudeo(5.00, 50))

    print("Dame precio al mayoreo: ")
    val precioMayoreo = readln().toDouble()

    print("Dame el porcentaje de ganancia: ")
    val porcentajeGanancia = readln().toInt()

    val precioAlMenudeo = calcularPrecioMenudeo(precioMayoreo, porcentajeGanancia)

    println("El precio al menudeo debe ser de $precioAlMenudeo pesos")
}