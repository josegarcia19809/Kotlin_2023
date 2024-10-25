package k10_poo_clases

import k05_funciones.imprimirLinea

// ClaseEmpleado.kt

class Empleado(
    val nombre: String, val identificacion: Int, val departamento: String,
    val puesto: String
) {
    fun obtenerDatos(): String {
        return "Empleado: $nombre, identificación: $identificacion, departamento: $departamento, " +
                "puesto: $puesto"
    }
}

fun main() {
    val empleado1 = Empleado("Susana Reyes", 47899, "contabilidad", "Vicepresidente")
    val empleado2 = Empleado("Marcos Juárez", 39119, "TI", "Programador")
    val empleado3 = Empleado("Félix Moreno", 81774, "fabricación", "Ingeniero")

    println(empleado1.obtenerDatos())
    println(empleado2.obtenerDatos())
    println(empleado3.obtenerDatos())
    imprimirLinea()

}


