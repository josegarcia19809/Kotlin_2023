package k14_sets

/*
    Your company has very strict dress code. Only certain color clothes can be worn in the office.
        val acceptedColors = hashSetOf("white", "black", "grey")
    You have certain colors in your wardrobe.
        val myColors = hashSetOf("blue", "red", "black", "green")
    What color clothes can you wear.
    Your company has added another color, "red" to their list. What options do you have now?
 */

fun main() {
    val acceptedColors = hashSetOf("white", "black", "grey")
    val myColors = hashSetOf("blue", "red", "black", "green")
    println("What color clothes can you wear? ${myColors.intersect(acceptedColors)}")

    acceptedColors.add("red")
    println("What color clothes can you wear? ${myColors.intersect(acceptedColors)}")
}