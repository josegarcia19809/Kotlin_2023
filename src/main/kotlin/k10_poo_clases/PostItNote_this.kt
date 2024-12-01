package k10_poo_clases

class PostItNote {
    var message: String = "No message"

    fun updateMessage(message: String) {
        this.message = message
    }

    fun printMessage() {
        println(this.message)
    }
}

fun main() {
    val note = PostItNote()
    note.printMessage()
    note.updateMessage("Meeting at 5")
    note.printMessage()
}