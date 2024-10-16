package k05_funciones

import kotlin.math.pow

// DistanciaDeCaida

// Cuando un objeto cae debido a la gravedad, se puede determinar la distancia que el
// objeto cae en un periodo especifico de tiempo usando la siguiente fórmula
// d = ½ * g * t²

fun calcularDistanciaDeCaida(t: Double): Double {
    val g = 9.8
    val d = 0.5 * g * t.pow(2)
    return d
}

fun main() {
    for (i in 1..10) {
        println(String.format("%.2f", calcularDistanciaDeCaida(i.toDouble())))
    }
}
