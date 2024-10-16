package k05_funciones


// AreaRectangulo

// El programa tendrá las siguientes funciones:
// obtenerLongitud, obtenerAncho, obtenerArea,
// mostrarDatos

fun obtenerLongitud(): Double {
    print("Dame la longitud: ")
    val longitud = readln().toDouble()
    return longitud
}

fun obtenerAncho(): Double {
    print("Dame la anchura: ")
    val anchura = readln().toDouble()
    return anchura
}

fun obtenerArea(longitud: Double, anchura: Double): Double {
    return longitud * anchura
}

fun mostrarDatos(longitud: Double, anchura: Double, area: Double) {
    println(
        "El área de un rectángulo con longitud $longitud y anchura $anchura tiene un " +
                "área de $area unidades cuadradas"
    )
}

fun main() {
    println("Calcular el área de un rectángulo")

    val longitud = obtenerLongitud()
    val anchura = obtenerAncho()

    val area = obtenerArea(longitud, anchura)

    mostrarDatos(longitud, anchura, area)
}
