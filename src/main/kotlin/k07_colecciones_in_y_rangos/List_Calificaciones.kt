package k07_colecciones_in_y_rangos

fun main() {
    val calificaciones = listOf(8.8, 9.2, 9.6, 5.0, 2.0, 5.9)

    for (calificacion in calificaciones) {
        println(calificacion)
    }

    var total = 0.0
    var aprobados = 0.0
    for (calificacion in calificaciones) {
        if (calificacion >= 6.0) {
            println(calificacion)
            total += calificacion
            aprobados++
        }
    }
    if (aprobados > 0) {
        val promedio = (total / aprobados)
        println(promedio)
    }
}