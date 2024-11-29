package k10_poo_clases

// WeirdCar_Getters_Setters

class WeirdCar {
    var name = ""
    var speed: Int = 0
        get() = 50
        set(value) {
            name = "High speed car $value"
            field = value
        }
}

fun main() {
    val car = WeirdCar()

    car.speed = 100
    println("car.name: ${car.name}")
    println("car.speed: ${car.speed}")
}

/*
    Comportamiento actual del código:
    Cuando asignas 100 a car.speed, el setter se ejecuta:

    Actualiza el campo de respaldo (field) con 100.
    Cambia name a "High speed car 100".
    Sin embargo, cuando lees car.speed (es decir, llamas al getter), este siempre devuelve 50,
    ignorando el valor almacenado en field.
 */