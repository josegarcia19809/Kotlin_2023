package k05_funciones

fun personalisedGreeting(person: String): String {
    val greeting = when (person[0]) {
        'C' -> "Are you Ok $person"
        'R' -> "What's up $person"
        else -> "Hi $person"
    }
    return greeting
}

fun main() {
    val clients = listOf("Rox", "Carolina", "Anna")
    for (client in clients) {
        val greeting = personalisedGreeting(client)
        println(greeting)
    }
}