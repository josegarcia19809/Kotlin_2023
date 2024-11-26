package k05_funciones

/* CaloriasPorGalleta.kt
* Una bolsa de galletas contiene 40 galletas. La información de la bolsa dice que tiene 10
* porciones y que cada porción tiene 300 calorías. Una persona dice que si ha comido
* más de 500 calorías está en riesgo. Escribir 2 funciones que manden mensajes al respecto:
* estaEnRiesgo(), noEstaEnRiesgo()
* El programa preguntará cuántas galletas ha comido
* */

fun estaEnRiesgo() {
    println("Cuidate, ya casi ☠️")
}

fun noEstaEnRiesgo() {
    println("Vas bien 👍🏼")
}

fun main() {
    val caloriasPorGalleta = 75
    for (noLista in 1..24) {
//        val noLista = 1
        //print("¿Cuántas galletas te comiste? ")
//    val galletas = readln().toInt()
        println("---------------------------------$noLista")
        val galletas = noLista * 5

        val caloriasConsumidas = galletas * caloriasPorGalleta

        println("Calorias consumidas: $caloriasConsumidas")

        if (caloriasConsumidas > 500) {
            estaEnRiesgo()
        } else {
            noEstaEnRiesgo()
        }
        //imprimirLinea()
    }
}