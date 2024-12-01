package k10_poo_clases

/*
    The this keyword
    A box has a contents variable as a String, and a function updateContents that also
    takes a contents variable.
    Create a program that updates the class variable in the
    updateContents function.
 */

class Box {
    var contents = ""
    fun updateContents(contents: String) {
        this.contents = contents
    }
}

fun main() {
    val box = Box()
    println("Contents: ${box.contents}")
    box.updateContents("Jewellery")
    println("Contents: ${box.contents}")
}