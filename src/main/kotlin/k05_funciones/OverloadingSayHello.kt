package k05_funciones

fun sayHello(person: String){
    println("Hi $person")
}

fun sayHello(people: Collection<String>){
    for (person in people){
        println("Hi $person")
    }
}

fun main() {
    sayHello("John")
    sayHello(listOf("Anna", "Bob", "Carol"))
}