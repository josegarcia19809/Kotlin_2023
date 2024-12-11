package k03_ciclos

fun main() {
    val noLista = 10
    val dias = 5
    var salario = 1
    var dia = 1
    var total = 0

    while (dia <= dias) {
        total += salario
        salario *= 2
        dia++
    }

    println(total)
}
