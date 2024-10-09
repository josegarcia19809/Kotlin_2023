package k05_funciones

/* TarjetaCredito
* Este programa le pedirá al usuario que ingrese su salario anual y su calificación crediticia.
* Se crearán 2 funciones que mostrarán los mensajes correspondientes si califica o
* no califica. Otra función recibirá el salario y la calificación y evaluará si recibirá la
* tarjeta de crédito o no. El usuario debe ganar por lo menos 2000 pesos mensuales y tener una
* calificación mínima de 7
* */

fun siCalifica() {
    println("Felicidades 🥳, si calificas para la tarjeta de credito")
}

fun noCalifica() {
    println("Lo sentimos 😥, no calificas para la tarjeta de credito")
}

fun evaluarPersonaParaTarjeta(salario: Double, calificacionC: Int) {
    // Determinar si el usuario califica
    if (salario >= 2000 && calificacionC >= 7) {
        siCalifica()
    } else {
        noCalifica()
    }
}

fun main() {
    println("Banco de la Informática")

    print("Dame tu salario mensual: ")
    val salarioMensual = readln().toDouble()

    print(
        "En una escala del 1 al 10 ¿Cuál sería tu calificación crediticia? " +
                "\n 10=excelente, 1=muy mala: "
    )
    val calificacionCrediticia = readln().toInt()

    evaluarPersonaParaTarjeta(salarioMensual, calificacionCrediticia)
    imprimirLinea()
}



