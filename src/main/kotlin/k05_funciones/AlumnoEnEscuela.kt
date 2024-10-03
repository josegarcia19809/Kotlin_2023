package k05_funciones

// AlumnoEnEscuela.kt

// Este programa preguntará a un alumno su calificación (0.0 y 10.0), también pedirá
// su porcentaje de asistencias. El programa tendrá 2 funciones:
// estaAprobado(): mostrará un mensaje de que está aprobado
// noEstaAprobado(): mostrará un mensaje de que no está aprobado
// Condición para que esté aprobado: 6.0 o más de calificación y que tenga por lo menos
// 80% de asistencias

fun estaAprobado() {
    println("Felicidades 🥳, ya aprobaste")
}

fun noEstaAprobado() {
    println("Ni modo 😭, no aprobaste")
}

fun main() {
    println("Bienvenido al sistema de calificaciones")

    print("Dame tu calificación (0.0 a 10.0): ")
    val calificacion = readln().toDouble()

    print("Dame tu porcentaje de asistencias: ")
    val porcentaje = readln().toInt()

    if (calificacion >= 6.0 && porcentaje >= 80) {
        estaAprobado()
    } else {
        noEstaAprobado()
    }
    imprimirLinea()
}