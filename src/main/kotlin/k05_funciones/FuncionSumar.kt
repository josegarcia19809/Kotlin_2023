package k05_funciones

// FuncionSumar

// la función sumar debe recibir dos valores de tipo Double
// que guarde una variable para el numero1 y otra para el numero2
// debe mostrar la suma de ambos números

fun sumar(numero1: Double, numero2: Double) {
    val suma: Double = numero1 + numero2
    println("La suma es $suma")
}

fun main() {
    sumar(5.0, 7.0);
    sumar(2.5, 3.5);
    sumar(3.0, 2.0)
    imprimirLinea()
}