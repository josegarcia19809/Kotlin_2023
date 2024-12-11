package k01_fundamentos

fun main() {
    val noLista = 1//_____________________
    val galletasPorBolsa = noLista + 40 * 2
    val porcionesPorBolsa = 10
    val caloriasPorPorcion = 300

    val caloriasPorBolsa = porcionesPorBolsa * caloriasPorPorcion
    val caloriasPorGalleta = caloriasPorBolsa / galletasPorBolsa

    val cantidadGalletasConsumidas = noLista + 40
    val caloriasConsumidas = caloriasPorGalleta * cantidadGalletasConsumidas
}
