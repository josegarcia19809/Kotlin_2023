package k07_colecciones_in_y_rangos

fun main() {
    val puntuaciones = arrayOf(20, 30, 40, 50, 60)
    val incremento = 150 % 6

    puntuaciones[2] += incremento
    puntuaciones[4] += incremento

    for (puntuacion in puntuaciones) {
        println(puntuacion)
    }
}