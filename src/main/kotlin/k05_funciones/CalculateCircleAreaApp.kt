package k05_funciones

fun calculateCircleArea(radius: Int): Double {
    val pi = 3.1416;
    return pi * radius * radius
}

// Return shorhand
fun calculateAreaCircle(radius: Double) = 3.1416 * radius * radius

fun main() {
    val r = 10;
    val area = calculateCircleArea(r);
    println("A circle with the radious $r has a area of $area")

    val circleArea = calculateAreaCircle(20.0);
    println("A circle with the radious 20 has a area of $circleArea")
}