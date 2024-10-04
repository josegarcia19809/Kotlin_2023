package k05_funciones

// Escribe un programa que solicite al usuario, ingresar los costos mensuales de los siguientes
// gastos incurridos por operar su automóvil:
// pago de la mensualidad, seguro, gasolina, aceite, llantas y mantenimiento.
// El programa luego debe mostrar el costo mensual total de estos gastos y
// el costo anual total de estos gastos.

fun calcularGastosIncurridos(
    mensualidad: Double, seguro: Double, gasolina: Double,
    aceite: Double, llantas: Double, mantenimiento: Double
) {
    val costoTotalMensual = mensualidad + seguro + gasolina + aceite + llantas + mantenimiento
    val costoTotalAnual = costoTotalMensual * 12

    println("El costo mensual es de $${String.format("%.2f", costoTotalMensual)}")
    println("El costo anual es de $${String.format("%.2f", costoTotalAnual)}")
}

fun main() {
    println("Calculando gastos del automóvil")

    print("Dime los gastos de la mensualidad: ")
    val mensualidad = readln().toDouble()

    print("Dime los gastos del seguro: ")
    val seguro = readln().toDouble()

    print("Dime los gastos de la gasolina: ")
    val gasolina = readln().toDouble()

    print("Dime los gastos del aceite: ")
    val aceite = readln().toDouble()

    print("Dime los gastos de las llantas: ")
    val llantas = readln().toDouble()

    print("Dime los gastos del mantenimiento: ")
    val mantenimiento = readln().toDouble()

    //calcularGastosIncurridos(3000.00, 100.00, 800.00, 12.00, 10.00, 100.00)
    calcularGastosIncurridos(mensualidad, seguro, gasolina, aceite, llantas, mantenimiento)
    imprimirLinea()
}