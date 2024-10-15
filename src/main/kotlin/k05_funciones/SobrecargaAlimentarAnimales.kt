package k05_funciones

// SobrecargaAlimentarAnimales

// Este programa crea una función sobrecargada que reciba un animal o una lista de animales
// Luego imprime un mensaje para alimentar a cada animal

fun alimentarAnimal(animal: String) {
    println("Alimentando a $animal")
}

fun alimentarAnimal(animales: Collection<String>) {
    for (animal in animales) {
        alimentarAnimal(animal)
    }
}

fun main() {
    alimentarAnimal("gato")
    alimentarAnimal(setOf("perro", "oso", "víbora"))
    imprimirLinea()
}