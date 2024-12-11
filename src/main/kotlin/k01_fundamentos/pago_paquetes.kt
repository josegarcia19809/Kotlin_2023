package k01_fundamentos

fun main() {
    val noLista = 1 // Reemplaza con el valor correspondiente
    val paquete = (noLista % 3) + 1
    val minutos = noLista * 40
    var pago = 0.0
    var minutosAdicionales = 0

    if (paquete == 1) {
        pago = 40.00
        if (minutos > 10) {
            minutosAdicionales = minutos - 10
            pago += minutosAdicionales * 0.50
        }
    } else if (paquete == 2) {
        pago = 60.00
        if (minutos > 20) {
            minutosAdicionales = minutos - 20
            pago += minutosAdicionales * 0.40
        }
    } else if (paquete == 3) {
        pago = 70.00
        if (minutos > 30) {
            minutosAdicionales = minutos - 30
            pago += minutosAdicionales * 0.30
        }
    }

    println(paquete)
    println(pago)
}
