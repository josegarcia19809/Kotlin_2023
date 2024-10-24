package k10_poo_clases


/*
* Crea una clase calculadora. Debe tener:

Una variable que almacene el total.
Una función que sume un número al total.
Una función que reste un número del total.
Una función que multiplique el total por una cantidad.
Una función que divida el total por una cantidad.
Una función que reinicie el total a 0.
Crea un objeto, prueba las funciones y muestra algunos resultados.
* */
class Calculator {
    var total = 0
    fun add(num: Int) {
        println("+$num")
        total += num
        println("total: $total")
    }

    fun subtract(num: Int) {
        println("-$num")
        total -= num
        println("total: $total")
    }

    fun multiply(num: Int) {
        println("*$num")
        total *= num
        println("total: $total")
    }

    fun divide(num: Int) {
        println("/$num")
        total /= num
        println("total: $total")
    }

    fun reset() {
        total = 0
        println("total: $total")
    }
}

fun main() {
    val calculator = Calculator()
    calculator.add(20)
    calculator.subtract(10)
    calculator.multiply(3)
    calculator.divide(6)
    calculator.reset()
}