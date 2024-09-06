package condicional_when

// MomentoDelDia_When

/*
* Basándose en la hora del día
* 6 a 11    -> mañana
* 12 a 14   -> mediodía
* 15 a 17   -> tarde
* 18 a 21   -> nochecita
* 22 a 5    -> noche
* Preguntar al usuario la hora actual e
* imprimir un mensaje que especifique el momento del día
* */

fun main() {
    print("¿Qué hora es? ")
    var hora = readln().toInt()

    if (hora > 23) hora = 23

    val momentoDelDia = when (hora) {
        in 6..11 -> "mañana"
        in 12..14 -> "mediodía"
        in 15..17 -> "tarde"
        in 18..21 -> "nochecita"
        else -> "noche"
    }

    println("A las $hora:00 es $momentoDelDia")
}