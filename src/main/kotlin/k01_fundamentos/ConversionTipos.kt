package k01_fundamentos

fun main() {
    val cats = 3
    val longCats = cats.toLong()
    println(cats::class.java)
    println(longCats::class.java)
    println(longCats)
    println("-".repeat(100))

    // Habrá posible pérdida o corrupción de datos al hacerlo al revés
    val people = 7500_000_000
    val fewPeople = people.toInt()
    println(people::class.java)
    println(fewPeople::class.java)
    println(fewPeople)
    println("-".repeat(100))

    // Convertir a cadena
    val dogs = 7
    val dogsString = dogs.toString()
    println(dogsString::class.java)
    println(dogsString)
}