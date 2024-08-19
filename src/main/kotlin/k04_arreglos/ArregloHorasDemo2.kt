package k04_arreglos

// Este programa muestra los valores guardados en un arreglo de 3 elementos
fun main() {

    val empleados = 3
    val horas: Array<Int> = Array(empleados) { 0 }

    println("Ingresa las horas trabajadas por los $empleados empleados")

    for (i in 1..empleados) {
        print("Empleado $i: ")
        horas[i - 1] = readln().toInt()
    }

    println("Mostrar los valores ingresados")
    for (i in 1..empleados) {
        println(horas[i - 1])
    }

    println("-".repeat(100))
    for (hora in horas) {
        println(hora)
    }
}