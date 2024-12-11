package k10_poo_clases

class CargosBancarios(
    private var saldoCuenta: Double,
    private val cantidadChequesEmitidos: Int
) {

    fun obtenerCobroTotal(): Double {
        // Cobro por comisión base
        val comisionBase = 10.0
        saldoCuenta -= comisionBase

        // Cobro por comisión de cheques
        val comisionPorCheques = if (cantidadChequesEmitidos < 20) {
            cantidadChequesEmitidos * 0.10
        } else {
            cantidadChequesEmitidos * 0.08
        }

        saldoCuenta -= comisionPorCheques
        val cargoTotal = comisionBase + comisionPorCheques
        return cargoTotal
    }

    fun obtenerSaldoActual(): Double {
        return saldoCuenta
    }
}

fun main() {
    val noLista = 1//____________
    val saldoInicial = noLista * 10.0
    val chequesEmitidos = noLista * 2

    val cargosB = CargosBancarios(saldoInicial, chequesEmitidos)
    val saldoInicialCuenta = cargosB.obtenerSaldoActual()
    val cargosTotales = cargosB.obtenerCobroTotal()
    val saldoDespuesDeCobros = cargosB.obtenerSaldoActual()

    println("Saldo inicial: $saldoInicialCuenta")
    println("Cargos totales: $cargosTotales")
    println("Saldo después de los cobros: $saldoDespuesDeCobros")
}
