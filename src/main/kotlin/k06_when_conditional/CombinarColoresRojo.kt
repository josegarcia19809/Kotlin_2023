package k06_when_conditional

fun main() {
    val color1 = "rojo"
    var nuevoColor = ""
    print("Dame un color para combinar con rojo: ")
    val color2 = readln()
    when (color2) {
        "azul" -> {
            nuevoColor = "morado"
        }

        "amarillo" -> {
            nuevoColor = "naranja"
        }

        "blanco" -> {
            nuevoColor = "rosa"
        }

        else -> {
            nuevoColor = "tendrás que investigar"
        }
    }
    println("La combinación de $color1 y $color2 es $nuevoColor")
    println("-".repeat(100))
}