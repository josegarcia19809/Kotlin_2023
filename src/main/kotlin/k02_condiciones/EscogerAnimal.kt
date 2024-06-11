package k02_condiciones

fun main() {
    print("Please, enter an animal: ")
    val animal = readln()
    val action = if (animal == "dog") {
        "pet it"
    } else if (animal == "cat") {
        "feed it"
    } else if (animal == "crocodile") {
        "run away"
    } else {
        "google it"
    }

    println("If you encounter a $animal you should $action")
}