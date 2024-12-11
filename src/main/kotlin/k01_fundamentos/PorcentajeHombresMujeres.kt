package k01_fundamentos

fun main() {
    val noLista =1// ____________
    val cantidadHombres = noLista + 5 * 20
    val cantidadMujeres = noLista + 6 * 20
    val total = cantidadHombres + cantidadMujeres
    val porcentajeHombres = cantidadHombres * 100.0 / total
    val porcentajeMujeres = cantidadMujeres * 100.0 / total
}
