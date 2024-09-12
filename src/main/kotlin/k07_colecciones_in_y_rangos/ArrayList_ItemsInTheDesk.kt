package k07_colecciones_in_y_rangos

/*
* You have a number of items on your desk
* val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
*
* You clean up your desk and remove as many items as you can to be more productive
* val removedItems = listOf("pen", "paper", "mug", "laptop")
*
* Print out the remaining items
* */

fun main() {
    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = listOf("pen", "paper", "mug", "laptop")

    println(items)
    items.removeAll(removedItems)
    println(items)
}