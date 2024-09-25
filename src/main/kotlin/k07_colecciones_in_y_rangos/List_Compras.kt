package k07_colecciones_in_y_rangos

fun main() {
    val listaCompras = listOf(15, 20, 50, 70, 50, 12)

    var aPagar = 0.0

    for (producto in listaCompras) {
        aPagar += producto * 2
    }

    println(aPagar)
}