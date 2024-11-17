package k12_nullability

fun main() {
    val herName: String = "Lilly"
    val hisName: String? = null

    println(herName)
    println(hisName)

    var catName: String? = "Mixi"
    catName = null

    var dogName: String = "Cholo"
    // dogName = null // Error: Null can not be a value of a non-null type String
}