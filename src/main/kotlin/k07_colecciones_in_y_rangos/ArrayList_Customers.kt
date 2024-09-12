package k07_colecciones_in_y_rangos

/*
* Create a ArrayList of customers to your online store and add some customers
* A new customer has signed up, add them to the list
* A customer has chosen to close their account. Remove them from the list.
* */

fun main() {
    var customers: ArrayList<String> = arrayListOf(
        "Alberto C", "Berenice N", "Carolina G",
        "Diego M", "Esmeralda T"
    )
    val newCustomer = "Gloria Z"
    customers.add(newCustomer)
    println(customers)

    customers.remove("Berenice N")
    customers.remove("Berenice N")
    println(customers)

    println(customers.find { it == "Berenice N" })
    println(customers.find { it == "Esmeralda T" })

    // Cómo saber si encontró a un elemento
    // Agregar un menú
}

