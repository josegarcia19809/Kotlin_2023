package k06_when_conditional

fun main() {
    var animal = "cat"
    var action: String = ""

    when (animal) {
        "cat" -> {
            action = "pet it"
        }

        "dog" -> {
            action = "feed it"
        }

        else -> {
            action = "google it"
        }
    }
    println("Whe you meet a $animal you should $action")
}