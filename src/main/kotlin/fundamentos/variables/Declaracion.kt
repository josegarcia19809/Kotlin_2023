package fundamentos.variables

fun main() {
    val numero: Int = 10
    val resultado: Int
    resultado = 20
    val empleado1 = Empleado("José García", 123)
    println(empleado1.nombre)
    println(resultado)
}

class Empleado(var nombre: String, val id: Int) {}