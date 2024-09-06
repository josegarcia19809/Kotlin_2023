package condicional_when

// ComidasRecomendadas_When

/*
* Supongamos que se recomienda tener 3 comidas al día.
* Pedir al usuario que introduzca el número de comidas que tiene todos los días
* Basado en la entrada imprimir un mensaje que anime al usuario
* a aumentar o disminuir el número de comidas que tiene
* */

fun main() {
    print("¿Cuántas comidas tienes al día? ")
    val comidas = readln().toInt()

    when (comidas) {
        in 0..2 -> println("Deberías comer más")
        3 -> println("Está perfecto")
        else -> println("Deberías comer menos")
    }
}