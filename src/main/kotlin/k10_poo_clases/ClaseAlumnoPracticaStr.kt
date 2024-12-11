package k10_poo_clases

class Alumno2(val nombre: String, val carrera: String) {

    override fun toString(): String {
        return "Nombre: $nombre, carrera: $carrera"
    }
}

fun main() {
    val alumno1 = Alumno2("José García", "Ing. en Computación")
    val alumno2 = Alumno2("María Sánchez", "Licenciatura en Informática")

    println(alumno1)
    println(alumno2)
}