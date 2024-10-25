package k10_poo_clases

import k05_funciones.imprimirLinea

// ClaseDatosPersonales.kt
class DatoPersonal(
    val nombre: String,
    val direccion: String,
    val edad: Int,
    val telefono: String
) {
    fun obtenerDatos(): String {
        return "Nombre: $nombre, dirección: $direccion, edad: $edad, telefono: $telefono";
    }
}

fun main() {
    val persona1 = DatoPersonal("José L. García", "San Miguel T", 40, "712120000")
    val persona2 = DatoPersonal("Rodolfo Fernandez", "Atlacomulco", 50, "712120001")
    val persona3 = DatoPersonal("Thalia Monroy", "México", 19, "55120000")

    println(persona1.obtenerDatos())
    println(persona2.obtenerDatos())
    println(persona3.obtenerDatos())
    imprimirLinea()
}