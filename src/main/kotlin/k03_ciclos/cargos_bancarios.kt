package k03_ciclos

fun main() {
    val noLista = 10
    val saldo = noLista * 10
    val cantidadChequesEmitidos = noLista * 2

    val comisionBase = 10
    var saldoCuenta = saldo - comisionBase
    var comisionPorCheques = 0.0

    if (cantidadChequesEmitidos >= 1 && cantidadChequesEmitidos <= 60) {
        comisionPorCheques = cantidadChequesEmitidos * 0.15
    } else if (cantidadChequesEmitidos >= 61 && cantidadChequesEmitidos <= 70) {
        comisionPorCheques = cantidadChequesEmitidos * 0.12
    } else if (cantidadChequesEmitidos >= 71 && cantidadChequesEmitidos <= 90) {
        comisionPorCheques = cantidadChequesEmitidos * 0.10
    } else {
        comisionPorCheques = cantidadChequesEmitidos * 0.08
    }

    val cobroTotal = saldoCuenta - comisionPorCheques
    val cargosBancarios = comisionBase + comisionPorCheques

    println(cobroTotal)
    println(cargosBancarios)
}

