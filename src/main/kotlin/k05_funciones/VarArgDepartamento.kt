package k05_funciones

fun printDepartamento(departamento: Int, vararg names: String) {
    for (name in names) {
        println("Name: $name - $departamento")
    }
}

fun main() {
    printDepartamento(23345, "José García", "Rox S", "Luna L")
}