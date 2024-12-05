package k10_poo_clases

import k10_poo_clases.Book.Companion.getEditor

/*
    A book class will provide information about the editor without the need to be instantiated.
    It will also require this information - in the form of an editor object type - in the constructor.
    Implement this in a program.
 */

class Editor(val editorName: String) {}

class Book(val editor: Editor) {
    companion object {
        fun getEditor() = Editor("O'Reilly")
    }
}

fun main() {
    val book = Book(getEditor())
    println(book.editor.editorName)
}