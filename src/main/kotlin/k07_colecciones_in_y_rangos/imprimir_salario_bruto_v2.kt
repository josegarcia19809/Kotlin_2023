package k07_colecciones_in_y_rangos

fun main() {
    val noLista = 10

    val horas = listOf(20, 30, 40, 10, 25)
    val pagoHora = noLista * 3

    for (hora in horas) {
        val sueldoBruto = hora * pagoHora
        println(sueldoBruto)
    }
}
