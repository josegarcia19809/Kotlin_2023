package k05_funciones

fun calculateCost(product: String, price: Double) {
    println("A $product costs ${price.times(1.20)}")
}

fun calculateCost(products: Map<String, Double>) {
    for ((product, price) in products) {
        calculateCost(product, price)
    }
}

fun main() {
    calculateCost("Coffee", 4.99)

    val products = mapOf("Cake" to 4.00, "Can of soda" to 1.60)
    calculateCost(products)
}