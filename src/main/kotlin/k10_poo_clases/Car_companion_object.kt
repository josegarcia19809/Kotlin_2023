package k10_poo_clases

class Car4 {
    // Se maneja lo que está dentro como métodos y variables estáticas
    companion object {
        fun provideDrivingInstructions(): String {
            return "Drive safe!"
        }
    }
}

fun main() {
    // val car = Car4() // No hace falta crear una instancia
    println(Car4.provideDrivingInstructions())
}