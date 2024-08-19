package k04_arreglos

fun main() {
    // Este programa muestra los valores guardados en un arreglo de 3 elementos
    val empleados = 3 // Número de empleados
    val horas: Array<Int> = Array(empleados) { 0 } // Arreglo de horas inicializado con ceros

    println("Ingresa las horas trabajadas por los $empleados empleados")

    // Lee las horas trabajadas por cada empleado individualmente
    print("Empleado 1: ")
    horas[0] = readln().toInt()

    print("Empleado 2: ")
    horas[1] = readln().toInt()

    print("Empleado 3: ")
    horas[2] = readln().toInt()

    // Muestra los valores almacenados
    println("Las horas que ingresaste son: ")
    println(horas[0])
    println(horas[1])
    println(horas[2])
}