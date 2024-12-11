package k07_colecciones_in_y_rangos

fun main() {
    val noLista = 1// Reemplaza con el valor correspondiente

    val horas = listOf(20, 30, 40, 25, 10)
    val pagoHora = noLista * 3

    for (hora in horas) {
        val sueldoBruto = hora * pagoHora
        println(sueldoBruto)
    }
}
