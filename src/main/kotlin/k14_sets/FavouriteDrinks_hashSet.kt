package k14_sets


/*
    Your favourite drinks are
    val myDrinks = hashSetOf("water", "coke", "beer", "orange juice")
    Your partner's favourite drinks are
    val theirDrinks = hashSetOf("water", "orange juice", "pineapple juice", "milk")
    If you want to buy a drink that you both can enjoy, what are the options you have?
    Print out the result.,
 */

fun main() {
    val myDrinks = hashSetOf("water", "coke", "beer", "orange juice")
    val theirDrinks = hashSetOf("water", "orange juice", "pineapple juice", "milk")
    println("drinks that we both can enjoy: ${myDrinks.intersect(theirDrinks)}")


    // El métod0 retainAll en Java/Kotlin se utiliza para modificar un conjunto o lista
    //  eliminando todos los elementos que no están presentes en otra colección proporcionada
    //  como argumento.
    myDrinks.retainAll(theirDrinks)
    println("drinks that we both can enjoy: $myDrinks")
}