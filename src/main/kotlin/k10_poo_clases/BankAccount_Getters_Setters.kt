package k10_poo_clases

/*
        A bank account class has a variable amount, and credit rating.
    Whenever a user adds money to the account, their credit rating rises.
    Whenever a user takes money from the account, their rating falls.
    Implement this in a program.
 */

class BankAccount {
    var creditRating = 500
    var account: Int = 0
        get() = field
        set(value) {
            if (value > account) {
                creditRating++
            } else {
                creditRating--
            }
            field = value
            println("New credit rating is $creditRating")

        }
}

fun main() {
    val account1 = BankAccount()
    account1.account = 300
    account1.account = 400
    account1.account = 100
    println("Account is ${account1.account}")
}

/*
    Este programa en Kotlin simula una clase llamada BankAccount que gestiona una
    cuenta bancaria básica con un sistema de "rating crediticio". Aquí está el desglose:

Clase BankAccount
    Propiedad creditRating:
        Se inicializa en 500.
        Representa el puntaje crediticio del titular de la cuenta.
    Propiedad account:
        Es un entero con un getter y un setter personalizados.
        Getter (get() = field): Devuelve el valor almacenado en el campo field (el valor interno de
         account).
        Setter (set(value)):
        Compara el valor nuevo (value) con el actual (field):
        Si value > account, incrementa creditRating en 1.
        Si value <= account, decrementa creditRating en 1.
        Actualiza el campo interno (field) con el nuevo valor.
        Imprime el nuevo valor de creditRating.
    main
        Crea una instancia de BankAccount (account1).
        Inicialmente, creditRating = 500 y account = 0.
        Primera asignación: account1.account = 300.
        El nuevo valor (300) es mayor que el actual (0).
        creditRating se incrementa en 1 (nuevo valor: 501).
        Imprime: New credit rating is 501.
        Segunda asignación: account1.account = 400.
        El nuevo valor (400) es mayor que el actual (300).
        creditRating se incrementa en 1 (nuevo valor: 502).
        Imprime: New credit rating is 502.
        Tercera asignación: account1.account = 100.
        El nuevo valor (100) es menor que el actual (400).
        creditRating se decrementa en 1 (nuevo valor: 501).
        Imprime: New credit rating is 501.
 */