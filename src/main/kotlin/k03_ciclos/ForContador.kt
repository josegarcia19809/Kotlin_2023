package k03_ciclos

fun main() {
    for (contador in 0..11) {
        print("$contador ")
    }

    val ciudades =
        listOf("Ciudad de México", "París", "Londres", "Tokio", "Río de Janeiro", "Moscú")
    for (ciudad in ciudades) {
        println(ciudad)
    }

}