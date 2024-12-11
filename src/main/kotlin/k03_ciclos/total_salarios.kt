package k03_ciclos

fun main() {
    val noLista = 1 // Reemplaza con el valor correspondiente
    var totalSalarios = 0.0
    var i = 1

    while (i <= 3) {
        val salarioBruto = noLista * 50 * (i + 1)
        val porcentajeImpuesto = noLista
        val salarioNeto = salarioBruto - (salarioBruto * porcentajeImpuesto / 100)
        totalSalarios += salarioNeto
        i++
    }

    println(totalSalarios)
}
