package k04_arreglos

fun main() {
    val personajes = arrayOf("Hugo", "Luis", "Paco", "Donald")

    for (personaje in personajes) {
        println(personaje)
    }
    println("-".repeat(100))

    for (i in 0..3) {
        println(personajes[i])
    }
}