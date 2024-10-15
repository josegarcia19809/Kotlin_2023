package k05_funciones

// SobrecargaSaludo

fun saludarHola(persona: String) {
    println("Hola $persona")
}

fun saludarHola(gente: Collection<String>) {
    for (persona in gente) {
        saludarHola(persona)
    }
}

fun main() {
    saludarHola("Juan")
    saludarHola(listOf("Ana", "Roberto", "Carolina"))
    imprimirLinea()
}