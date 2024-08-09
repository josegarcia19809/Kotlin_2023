package k01_fundamentos

fun main() {
    print("¿Cuántas horas trabajaste? ")
    val horasTrabajadas: Int = readln().toInt()

    print("¿Cuánto te pagan la hora? ")
    val pagoPorHora: Double = readln().toDouble()

    val pagoTotal: Double = horasTrabajadas * pagoPorHora

    println("Salario bruto: $$pagoTotal")
}