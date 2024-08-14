package k01_fundamentos

fun main() {
    var horasTrabajadas: Int = 5
    val pagoPorHora: Double = 100.50

    horasTrabajadas = 8

    println("Horas trabajadas: $horasTrabajadas")
    println("Pago por hora: $pagoPorHora")
    println("Pago total: ${horasTrabajadas * pagoPorHora} ")
}