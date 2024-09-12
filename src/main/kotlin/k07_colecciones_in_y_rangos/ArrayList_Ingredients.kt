package k07_colecciones_in_y_rangos

/*
* A recipe calls for the following ingredients
Chicken
Egg
Mozzarella
Pepper

You decide to replace the Mozzarella with blue cheese
Print out the list of ingredients

* */

fun main() {
    val ingredients = arrayListOf("Chicken", "Egg", "Mozzarella", "Pepper")
    val indexMozzarella = ingredients.indexOf("Mozzarella")
    ingredients[indexMozzarella] = "blue cheese"
    println(ingredients)

}