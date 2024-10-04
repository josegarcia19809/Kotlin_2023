package k05_funciones

/*
* Create a function that receives the price of a product, adds 20% tax and return the result
* These are the products in your online store
*
*
* Print out the final price of each product
* */

import java.text.NumberFormat
import java.util.Locale

fun addTax(price: Double) = price.times(1.2)
fun formatoPesos(cantidad: Double): String {
    val formatoMX = NumberFormat.getCurrencyInstance(Locale("es", "MX"))
    return formatoMX.format(cantidad)
}

fun main() {
    val products = hashMapOf(Pair("shoes", 30.00), Pair("socks", 6.00), Pair("jeans", 40.00))
    for (item in products.keys) {
        val finalPrice = addTax(products[item] ?: 0.0)
        println("$item cost ${formatoPesos(finalPrice)}")
    }
}