package k02_condiciones

/*
*
You are designing a grading system for school exams. The total for an exam is 100 points,
* and you need to convert that into a grade A to F.

Design a program that reads in a number that represents a student’s grade, from 1 to 100
* and prints out a grade.

A -> 90 to 100
B -> 80 to 89
C -> 70 to 79
D -> 60 to 69
E -> 50 to 59
F -> everything else
* */

fun main() {
    print("Ingresa una calificación de 0 a 100: ")
    val calificacion: Int = readln().toInt()
    val letra = if (calificacion >= 90) {
        "A"
    } else if (calificacion >= 80) {
        "B"
    } else if (calificacion >= 70) {
        "C"
    } else if (calificacion >= 60) {
        "D"
    } else if (calificacion >= 50) {
        "E"
    } else {
        "F"
    }

    println("Tu calificación en letra es $letra")
}