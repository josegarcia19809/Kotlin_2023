package k05_funciones

// MetodoNombreCompleto

// el método o función mostrarNombreCompleto debe recibir 3 valores de tipo String
// una para el nombre; otra, para el apellido paterno; y otra, para el apellido materno
// el método o función debe mostrar el nombre completo,
// empezando por los apellidos y separando el nombre por una coma

fun mostrarNombreCompleto(nombre: String, apellidoP: String, apellidoM: String) {
    println("$apellidoP $apellidoM, $nombre")
}

fun main() {
    mostrarNombreCompleto("José Luis", "García", "Morales")
    mostrarNombreCompleto("Mariana", "García", "Monroy")
    imprimirLinea()
}