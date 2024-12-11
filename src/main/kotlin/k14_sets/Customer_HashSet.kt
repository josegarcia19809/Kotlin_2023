package k14_sets

/*
    You have a list of customers for your online store.
    A new customer has joined.
    Print the list of customers.
    A customer has chosen to leave.
    Print the list of customers.
 */

fun main() {
    val customers = hashSetOf<String>("Luis García", "Pepe Aguilar", "José")
    println(customers)
    customers.add("Carolina")
    println(customers)
    customers.remove("José")
    println(customers)

    print("Input name of joining customer: ")
    val newCustomer = readln()
    customers.add(newCustomer)
    println(customers)

    print("Input name of leaving customer: ")
    val newLeaving = readln()
    customers.remove(newLeaving)
    println(customers)
}