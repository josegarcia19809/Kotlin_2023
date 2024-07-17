package k06_when_conditional

fun main() {
    val month = "January"
    val days = when (month) {
        "January", "March", "May", "July", "August", "October", "December" -> 31
        "February" -> 28
        else -> 30
    }
    println("The month $month has $days days")
}