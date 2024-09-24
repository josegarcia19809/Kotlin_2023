package k06_when_conditional

fun main() {
    print("Dame tu número de lista: ")
    val noLista = readln().toInt()
    val paquete = (noLista % 3) + 1
    val minutos = noLista * 40
    var pago = 0.0
    var minutosAdicionales = 0

    when (paquete) {
        1 -> {
            pago = 40.00
            if (minutos > 10) {
                minutosAdicionales = minutos - 10
                pago += minutosAdicionales * 0.50
            }
        }

        2 -> {
            pago = 60.00
            if (minutos > 20) {
                minutosAdicionales = minutos - 20
                pago += minutosAdicionales * 0.40
            }
        }

        3 -> {
            pago = 70.00
            if (minutos > 30) {
                minutosAdicionales = minutos - 30
                pago += minutosAdicionales * 0.30
            }
        }
    }

    println(paquete)
    println(pago)
}
