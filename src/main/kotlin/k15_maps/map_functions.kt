package k15_maps

fun main() {
    val count= hashMapOf(1 to "one", 2 to "two", 3 to "three")
    println("This map has a size of ${count.size}")

    println("Does the map have the key 2? ${count.containsKey(2)}")
    println("Does the map have the key 5? ${count.containsKey(5)}")

    println("Does the map have the value \"one\"? ${count.containsValue("one")}")
    println("Does the map have the value \"five\"? ${count.containsValue("five")}")

    println("Is the map empty? ${count.isEmpty()}")
    println("Does the map have any key value pairs? ${count.isNotEmpty()}")
}