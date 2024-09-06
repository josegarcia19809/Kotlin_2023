package k03_ciclos

/*
* You have a list of clients
    val clients = listOf("Anna", "Bob", "Carol", "David")
    Print out a greeting for each client, unless their name starts with the letter ‘C’
* */

fun main() {
    val clients = listOf("Anna", "Bob", "Carol", "David")
    for (client in clients) {
        if (client[0] == 'C') {
            continue
        }
        println("Hello $client")
    }
}