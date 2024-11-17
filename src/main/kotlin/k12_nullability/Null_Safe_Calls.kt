package k12_nullability

fun main() {
    var catName: String? = "Mixi"
    println(catName?.length?.toString())
    catName = null
    println(catName?.length?.toString())
}