package k03_ciclos

fun main(){
    for (i in 1..3){
        println("Strike #$i")
    }
    println("You're out!")

    println("-".repeat(50))

    for (x in 10 downTo 0){
        println(x)
        when(x){
            9-> println("Start your engines")
            6-> println("On Your marks")
            3-> println("Get set")
            0-> println("GO!")
        }
    }

    println("-".repeat(50))
    for (m in 10 downTo 0 step 3){
        println(m)
    }
}