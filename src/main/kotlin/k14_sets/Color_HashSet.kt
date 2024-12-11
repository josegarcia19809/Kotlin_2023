package k14_sets

/*
    Create an empty set of String colors
    Add three colors.
    Remove one.
    Print out the result
 */

fun main() {
    val colors = HashSet<String>()
    colors.add("red")
    colors.add("blue")
    colors.add("green")
    println(colors)

    colors.remove("blue")
    println(colors)

    val colorList = listOf("red", "blue", "green", "blue")
    colors.addAll(colorList)
    println(colors)
}