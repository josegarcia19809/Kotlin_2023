package k02_condiciones

fun main() {
    val esSoltero: Boolean = true
    val tieneDinero = false
    val esJoven = true
    val esWero = false

    if (esSoltero) {
        println("Te conviene")
    }
    if (tieneDinero && esWero) {
        println("Te conviene")
    }
    if (!tieneDinero) {
        println("No te conviene")
    }
    if (esJoven || tieneDinero) {
        println("Tiene por lo menos alguna cualidad deseable")
    }
}