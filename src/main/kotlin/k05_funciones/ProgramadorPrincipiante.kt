package k05_funciones

// ProgramadorPrincipiante

// Este programa mostrará las expectativas de salario de un programador principiante
// Crear las funciones para mostrar los siguientes datos:
// - nombre: visualizarNombre()
// - edad: visualizarEdad()
// - salario esperado: imprimirSalarioEsperado()

fun visualizarNombre() {
    println("Mi nombre es José L. García")
    imprimirLinea()
}

fun visualizarEdad() {
    println("Tengo 65 años")
    imprimirLinea()
}

fun imprimirSalarioEsperado() {
    println("Espero ganar $80,000 mensuales")
    imprimirLinea()
}

fun main() {
    visualizarNombre()
    visualizarEdad()
    imprimirSalarioEsperado()
}
