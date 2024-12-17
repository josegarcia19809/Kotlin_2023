package k15_maps

fun main() {
    val count = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    count[5] = "five"
    println(count)

    val countMore = mapOf(11 to "eleven", 12 to "twelve", 13 to "thrirteen")
    count.putAll(countMore)
    println(count)

    count.remove(2)
    println(count)

    count.replace(1, "uno")
    println(count)

    count.clear()
    println(count)
}