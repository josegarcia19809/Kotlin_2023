package k03_ciclos

fun main() {
    //suma de números usando valor centinela
    var suma = 0
    print("Introduce un número (0 para terminar): ")
    var numero = readln().toInt()
    while (numero != 0) {
        suma += numero
        print("Introduce un número (0 para terminar): ")
        numero = readln().toInt()
    }
    println("La suma es $suma")
}
