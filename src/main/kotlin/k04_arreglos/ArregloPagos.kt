package k04_arreglos

import java.text.DecimalFormat

fun main() {
    // Crear un objeto DecimalFormat para formatear números.
    val formatoPeso = DecimalFormat("#,##0.00")

    val empleados = 5
    var pagoHora: Double
    var sueldoBruto: Double

    // Crear un arreglo para guardar las horas trabajadas de cada empleado
    val horas = IntArray(empleados)

    // Pedir las horas trabajadas de cada empleado
    println(
        "Introduce las horas trabajadas de los $empleados empleados " +
                "quienes ganan lo mismo por cada hora trabajada"
    )
    for (i in 0 until empleados) { // 0..4
        print("Empleado #${i + 1}: ")
        horas[i] = readln().toInt()
    }

    // Pedir la tarifa de pago por cada hora trabajada
    print("Introduce cuánto ganan por hora los empleados: ")
    pagoHora = readln().toDouble()

    // Muestra el salario bruto de cada empleado
    println("Esto es lo que gana cada empleado")
    for (i in 0 until empleados) {
        sueldoBruto = horas[i] * pagoHora
        println("Empleado #${i + 1}: $${formatoPeso.format(sueldoBruto)}")
    }

}





