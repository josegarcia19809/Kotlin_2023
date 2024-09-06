package condicional_when

import java.util.*

/*
* Programa que nos dice que significan las abreviaturas lia, ico, lam, lde, lcn, lps
* */
fun main() {
    print("Ingresa una abreviatura (lia, ico, lam, lde, lcn, lps): ")
    val abreviatura = readln().lowercase(Locale.getDefault()) // Para leer y convertir a minúsculas

    val carrera = when (abreviatura) {
        "lia" -> "Informática Administrativa"
        "ico" -> "Ingeniería en Computación"
        "lam" -> "Administración"
        "lde" -> "Derecho"
        "lcn" -> "Contaduría"
        "lps" -> "Psicología"
        else -> "... (No existe)"
    }

    println("La abreviatura $abreviatura es de la licenciatura en $carrera")
}