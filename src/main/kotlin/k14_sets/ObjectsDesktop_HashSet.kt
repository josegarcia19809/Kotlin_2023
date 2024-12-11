package k14_sets

/*
    Create a set of the objects that are on your desk at the moment.
    Create another set of the objects that you would remove if you were to clean your desk.
    Print out the items that would remain.
 */

fun main() {
    val objects = hashSetOf("Pen", "Mouse", "Computer Laptop")
    val removeObjects = setOf("Pen", "Mouse")

    objects.removeAll(removeObjects)
    println(objects)
}