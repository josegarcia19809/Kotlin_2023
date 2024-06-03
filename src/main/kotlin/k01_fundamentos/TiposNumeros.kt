package k01_fundamentos

fun main() {
    val numero1 = 45
    println(numero1)
    println(numero1::class.java)

    val numero2 = 4599987777
    println(numero2)
    println(numero2::class.java)

    val numero3 = 45.99
    println(numero3)
    println(numero3::class.java)

    val numero4: Byte = 5
    println(numero4)
    println(numero4::class.java)

    val numero5 = 5f
    println(numero5)
    println(numero5::class.java)

    val numero6 = 6L
    println(numero6)
    println(numero6::class.java)
}