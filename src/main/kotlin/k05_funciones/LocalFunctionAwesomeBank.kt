package k05_funciones

fun awesomeBank(users: HashMap<String, Double?>) {
    fun doubleAmount(amount: Double?): Double? = amount?.times(2)

    println(users)

    for (user in users.keys) {
        users[user] = doubleAmount(users[user])
    }

    println(users)
}

fun main() {
    awesomeBank(
        hashMapOf(
            Pair("Alice", 546.00),
            Pair("Bob", 345.00),
            Pair("Carol", 510.00),
        )
    )
}

