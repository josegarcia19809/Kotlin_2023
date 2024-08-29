package k03_ciclos

/*
* You have a set of usernames
* val usernames = hashSetOf("john", "bob", "alice")
* Ask the user to choose their username.
* If their username is taken, print out a message and ask again
* */
fun main() {
    val usernames = hashSetOf("john", "bob", "alice")


    var finished = false
    do {
        print("Choose a username: ")
        val username = readln()
        if (usernames.contains(username)) {
            println("$username already exists. Please try again.")
        } else {
            println("$username is your new username.")
            usernames.add(username)
            finished = true
        }
    } while (!finished)
    println(usernames)
}