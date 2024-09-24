package k06_when_conditional

fun main() {
    print("Dame tu número de lista: ")
    val noLista = readln().toInt()
    val saldo = noLista * 10
    val cantidadChequesEmitidos = noLista * 2

    val comisionBase = 10
    val saldoCuenta = saldo - comisionBase

    val comisionPorCheques: Double = when (cantidadChequesEmitidos) {
        in 1..60 -> {
            cantidadChequesEmitidos * 0.15
        }
        in 61..70 -> {
            cantidadChequesEmitidos * 0.12
        }
        in 71..90 -> {
            cantidadChequesEmitidos * 0.10
        }
        else -> {
            cantidadChequesEmitidos * 0.08
        }
    }

    val cobroTotal = saldoCuenta - comisionPorCheques
    val cargosBancarios = comisionBase + comisionPorCheques

    println(cobroTotal)
    println(cargosBancarios)
}
