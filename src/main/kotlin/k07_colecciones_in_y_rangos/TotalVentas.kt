package k07_colecciones_in_y_rangos

fun main() {
    val noLista = 1//___________
    val ventas = listOf(5.00, 8.00, 10.00, 15.00, 20.50, 25.00, 14.00, 12.00, 1.00)
    var total = 0.0

    for (venta in ventas) {
        total += venta
    }

    var ventas10oMenos = 0
    for (venta in ventas) {
        if (venta <= 10) {
            ventas10oMenos += 1
        }
    }
}