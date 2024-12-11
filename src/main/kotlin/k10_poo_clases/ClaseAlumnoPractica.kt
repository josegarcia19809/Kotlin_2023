package k10_poo_clases

class Alumno3(val nombre: String, val carrera: String) {
    fun obtenerDatos(): String {
        return "Nombre: $nombre, carrera: $carrera"
    }
}

fun main() {
    val alumno1 = Alumno3("José García", "Ing. en Computación")
    println(alumno1.obtenerDatos())
}