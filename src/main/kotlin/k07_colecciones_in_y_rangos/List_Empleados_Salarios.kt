package k07_colecciones_in_y_rangos

fun main() {
    val salarios = listOf(2000, 4000, 600, 5000, 1000)
    val porcentajeDescuento = 15
    for (salario in salarios) {
        println(salario - (salario * porcentajeDescuento / 100))
    }
}