package k10_poo_clases

/*
    A table allows the user to adjust the height and size, through a function that also takes the
    parameters height and size.
    Create the class, variable, function, instantiate it and call the function to
    adjust height and size.
 */

class NewTable {
    var height = 120
    var size = 200

    fun updateDimensions(height: Int, size: Int) {
        this.height = height
        this.size = size
    }

    fun printInfo() {
        println("Table's height: $height and size: $size")
    }
}

fun main() {
    val table = NewTable()
    table.printInfo()
    table.updateDimensions(150, 250)
    table.printInfo()
}