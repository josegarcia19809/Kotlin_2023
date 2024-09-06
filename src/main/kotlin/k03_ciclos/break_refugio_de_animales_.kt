package k03_ciclos

/*
* An animal shelter is accepting all animals except “snake”.
  A user is allowed to bring 5 animals to the shelter.
  Ask the user to input the animals they want to bring.
  If they bring a snake, print a message and stop accepting animals.

*
* */

fun main() {
    val animals= arrayListOf<String>()
    for (i in 1..5){
        print("Please enter a animal: ")
        val animal= readln()
        if (animal == "snake"){
            println("Sorry we cannot accept snakes")
            break
        }
        animals.add(animal)
        println("Current animals: $animals")
    }
}