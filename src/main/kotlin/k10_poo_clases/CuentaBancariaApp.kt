package k10_poo_clases

import k05_funciones.imprimirLinea

// CuentaBancariaApp
class CuentaBancaria(var balance: Double) {
    fun depositar(cantidad: Double) {
        balance += cantidad
    }

    fun retirar(cantidad: Double) {
        if (balance >= cantidad) {
            balance -= cantidad
        } else {
            println("No tienes suficiente saldo para retirar $cantidad pesos")
        }
    }

    fun obtenerBalance(): Double {
        return balance
    }

    override fun toString(): String {
        return "El balance es ${"%,.2f".format(obtenerBalance())} pesos"
    }
}

fun main() {
    // Pedir el balance inicial
    print("Ingresa tu balance inicial: ")
    val balanceInicial = readln().toDouble()

    // Crear un objeto de CuentaBancaria
    val ahorros = CuentaBancaria(balanceInicial)

    // Depositar a la cuenta del usuario
    print("¿Cuánto te pagaron esta semana? ")
    val pago = readln().toDouble()
    ahorros.depositar(pago)
    println("Ese pago se depositará en tu cuenta")

    // Mostrar el balance
    println("El balance de tu cuenta es de $${"%,.2f".format(ahorros.obtenerBalance())}.")

    // Pedir una cantidad a retirar
    print("¿Cuánto te gustaría retirar? ")
    val efectivo = readln().toDouble()
    println("Se retirará esa cantidad de tu cuenta")
    ahorros.retirar(efectivo)

    // Mostramos nuevamente el balance
    println(ahorros)
    imprimirLinea()
}

/*
* Balance inicial: 5000
* Depositar: 3000
* Retirar: 4000
* Balance final: $4000
* */