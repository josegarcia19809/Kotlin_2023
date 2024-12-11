package k10_poo_clases

class FacturaMensual(private val paquete: Int, private val minutos: Int) {

    fun cargosTotales(): Double {
        var pago = 0.0
        when (paquete) {
            1 -> {
                pago = 60.00
                if (minutos > 10) {
                    val minutosAdicionales = minutos - 10
                    pago += minutosAdicionales * 0.50
                }
            }

            2 -> {
                pago = 40.00
                if (minutos > 20) {
                    val minutosAdicionales = minutos - 20
                    pago += minutosAdicionales * 0.40
                }
            }
        }
        return pago
    }
}

fun main() {
    for (noLista in 1..24) {
        //val noLista = 22
        println("--------------------------------$noLista")
        val noPaquete = (noLista % 2) + 1
        val minutos = noLista * 40
        val factura = FacturaMensual(noPaquete, minutos)
        val cargo = factura.cargosTotales()
        println("noPaquete: $noPaquete")
        println("El cargo total es: $cargo")
    }
}
