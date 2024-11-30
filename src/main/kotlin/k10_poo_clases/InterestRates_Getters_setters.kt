package k10_poo_clases

/*
    A bank has various rules for interest rates.
    If a user has less than 1000 in their account, their interest rate is 1.0
    If a user has less than 10.000 in their account, their interest rate is 0.5
    If a user has 10000 and over, their interest rate is 0.2.
    Implement this in a program, create an object, update the amount and print out the interest rate.
 */
class BankAccount2 {

    var interestRate: Double = 0.0
    var balance: Double = 0.0
        get() = field
        set(value) {
            if (value < 1000) {
                interestRate = 1.0
            } else if (value < 10000) {
                interestRate = 0.5
            } else {
                interestRate = 0.2
            }
            field = value
            println("The client has $value and has an interest rate of $interestRate")
        }
}

fun main() {
    val bankAccount = BankAccount2()
    bankAccount.balance = 500.0
    bankAccount.balance = 1000.0
    bankAccount.balance = 1200.0
    bankAccount.balance = 10000.0
    bankAccount.balance = 20000.0
}

/*
    Este programa en Kotlin define una clase llamada BankAccount2, que simula una cuenta bancaria
    con una funcionalidad básica para ajustar la tasa de interés (interestRate) en función del
    saldo (balance) de la cuenta.

Clase BankAccount2
Propiedades:
    interestRate:

        Es de tipo Double y representa la tasa de interés asociada al saldo de la cuenta.
        Se inicializa en 0.0.
    balance:

        También es de tipo Double y representa el saldo de la cuenta.
        Incluye un getter (devuelve el valor de la propiedad interna field) y un setter personalizado:
        Si el saldo (value) es menor a 1000, se asigna una tasa de interés del 1.0%.
        Si el saldo está entre 1000 y menos de 10,000, se asigna una tasa de interés del 0.5%.
        Si el saldo es de 10,000 o más, se asigna una tasa de interés del 0.2%.
        Luego, el valor de la propiedad interna field se actualiza con el nuevo saldo.
        Finalmente, imprime el saldo y la tasa de interés correspondiente.


        main
            Se crean y modifican valores en un objeto de la clase BankAccount2:

            Crea una instancia (bankAccount).

            Inicialmente, interestRate = 0.0 y balance = 0.0.
            Primera asignación: bankAccount.balance = 500.0.

            El saldo es menor a 1000.
            interestRate = 1.0.
            Imprime: The client has 500.0 and has an interest rate of 1.0.
            Segunda asignación: bankAccount.balance = 1000.0.

            El saldo es 1000, dentro del rango [1000, 10000).
            interestRate = 0.5.
            Imprime: The client has 1000.0 and has an interest rate of 0.5.
            Tercera asignación: bankAccount.balance = 1200.0.

            El saldo sigue en el rango [1000, 10000).
            interestRate = 0.5.
            Imprime: The client has 1200.0 and has an interest rate of 0.5.
            Cuarta asignación: bankAccount.balance = 10000.0.

            El saldo alcanza 10,000 o más.
            interestRate = 0.2.
            Imprime: The client has 10000.0 and has an interest rate of 0.2.
            Quinta asignación: bankAccount.balance = 20000.0.

            El saldo es mayor a 10,000.
            interestRate = 0.2.
            Imprime: The client has 20000.0 and has an interest rate of 0.2.
            Salida del programa:
            The client has 500.0 and has an interest rate of 1.0
            The client has 1000.0 and has an interest rate of 0.5
            The client has 1200.0 and has an interest rate of 0.5
            The client has 10000.0 and has an interest rate of 0.2
            The client has 20000.0 and has an interest rate of 0.2
            Resumen del comportamiento:
            El programa ajusta la tasa de interés (interestRate) dependiendo del saldo de la cuenta (balance).
            Cada vez que se actualiza el saldo, se recalcula y muestra la tasa de interés correspondiente.
            Esto permite al cliente conocer en tiempo real el interés aplicado a su cuenta.
 */