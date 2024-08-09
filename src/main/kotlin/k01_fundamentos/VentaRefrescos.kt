package k01_fundamentos

fun main() {
    println("Tienda 'La comercial'")

    print("Dame cantidad de refrescos vendidos: ")
    val cantidadRefrescos: Int = readln().toInt()

    print("Dame el costo por refresco: ")
    val costo: Double = readln().toDouble()

    val total: Double = cantidadRefrescos * costo

    println("La venta total es de $$total")
}