package k10_poo_clases

/*
* "Un jetpack puede hacer que un usuario vuele. Lo logra con dos operaciones:

burn(número de segundos): eleva al usuario.
stop(número de segundos): desciende al usuario.
Asume que burn eleva al usuario 1 metro por segundo.
Asume que stop desciende al usuario 3 metros por segundo.
Crea una clase llamada Jetpack que almacena una variable userHeight, y dos funciones,
* burn y stop, que modifican la altura.
Crea un objeto, llama a sus métodos y muestra algunos resultados.
Asegura que el usuario no pueda descender por debajo de 0 en altura."
* */

class Jetpack {
    var userHeight =0

    fun burn(seconds: Int){
        println("Burning for $seconds seconds")
        userHeight += seconds
    }

    fun stop(seconds: Int){
        println("Stopping for $seconds seconds")
        userHeight -= 3 * seconds
        if (userHeight <= 0){
            userHeight = 0
        }
    }

    fun getHeight(){
        println("User's height is $userHeight meters")
    }
}

fun main() {
    val jetpack = Jetpack()
    jetpack.burn(10)
    jetpack.getHeight()
    jetpack.stop(2)
    jetpack.getHeight()
    jetpack.burn(4)
    jetpack.getHeight()
    jetpack.stop(3)
    jetpack.getHeight()
}