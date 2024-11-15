package k11_poo_herencia_polimorfismo

// CuentaAhorrosApp

open class CuentaAhorro(
    private var numeroCuenta: String,
    private var tasaInteres: Double,
    private var balance: Double
) {
    override fun toString(): String {
        var mensaje = ""
        mensaje += "Número de cuenta: ${numeroCuenta}, "
        mensaje += "Tasa de interes: ${tasaInteres}, "
        mensaje += "Balance: ${balance}."
        return mensaje
    }
}

// La clase CD representa una cuenta de certificado de depósito (CD).
// Es una subclase de la clase CuentaAhorro.
class CD(
    numeroCuenta: String,
    tasaInteres: Double,
    balance: Double,
    private var fechaVencimiento: String
) : CuentaAhorro(numeroCuenta, tasaInteres, balance) {
    override fun toString(): String {
        val mensaje = " Fecha de vencimiento: $fechaVencimiento"
        return super.toString() + mensaje
    }
}

fun pruebaCuentaAhorro() {
    println("-".repeat(100))
    println("Cuenta de ahorro")
    print("Ingresa número de cuenta: ")
    val numeroCuenta = readln()
    print("Ingresa tasa de interes: ")
    val tasaInteres = readln().toDouble()
    print("Ingresa tu saldo: ")
    val balance = readln().toDouble()
    val ahorros = CuentaAhorro(numeroCuenta, tasaInteres, balance)
    println(ahorros)
}

fun pruebaCD() {
    println("-".repeat(100))
    println("Cuenta de certificado de depósito (CD)")
    print("Ingresa número de cuenta: ")
    val numeroCuenta = readln()
    print("Ingresa tasa de interes: ")
    val tasaInteres = readln().toDouble()
    print("Ingresa tu saldo: ")
    val balance = readln().toDouble()
    print("Ingresa fecha de vencimiento: ")
    val fechaVencimiento = readln()
    val cd = CD(numeroCuenta, tasaInteres, balance, fechaVencimiento)
    println(cd)
}

fun main() {
    pruebaCuentaAhorro()
    pruebaCD()
}