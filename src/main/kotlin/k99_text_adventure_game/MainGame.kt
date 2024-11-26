package k99_text_adventure_game

import java.util.*

fun main() {
    val locations = readLocationInfo()
    var loc = 64

    while (true) {
        val location = locations[loc] ?: Location(
            0,
            "Sorry, something went wrong, so the game will terminate"
        )
        println(location.description)

        if (location.locationID == 0) {
            break
        }

        print("Available exits are: ")
        location.exits.keys.forEach {
            print("$it, ")
        }

        val direction = readln().uppercase(Locale.getDefault())
        if (location.exits.containsKey(direction)) {
            loc = location.exits[direction]!!
        } else {
            println("Yo can't go in that direction")
        }
    }
}