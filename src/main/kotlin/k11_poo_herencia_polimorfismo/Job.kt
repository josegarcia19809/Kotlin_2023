package k11_poo_herencia_polimorfismo

import k05_funciones.imprimirLinea

/*
    A class Job has three variables, name, revenue and salary, and two methods,
    work - which increases revenue by the amount in salary
    study - which increases salary

    Two classes, Engineer and Doctor inherit from the Job class, but have different values
    for salary.

    Create objects and call the functions a few times, printing out messages to see the result
    of the functions.
 */
open class Job {
    var name = ""
    var revenue = 0.0
    var salary = 0.0

    fun work() {
        revenue += salary
    }

    fun study() {
        salary += 1000
    }

    fun printInfo() {
        println("Name: $name, revenue: $revenue, salary: $salary")
    }
}

class Engineer : Job() {}

class Doctor : Job() {}

fun main() {
    val enginer = Engineer()
    enginer.name = "Engineer"
    enginer.salary = 5000.00
    enginer.study()
    enginer.work()
    enginer.work()
    enginer.printInfo()
    imprimirLinea()

    val doctor = Doctor()
    doctor.name = "Doctor"
    doctor.salary = 1000.0
    doctor.work()
    doctor.work()
    doctor.work()
    doctor.study()
    doctor.printInfo()
}