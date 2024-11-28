package k10_poo_clases

// POO: Múltiples constructores - UserAccount
/*
Create an online store user account class that has a userName and balance

Create 3 constructors for this class.

Inside the constructors, based on the user balance, print out whether they can afford the
product tshirt, which costs 20, and if so, how many can they afford.
 */

class UserAccount {
    var userName = "User Name"
    var balance = 2
    val tshirtPrice = 20

    fun canAfford() {
        if (balance > tshirtPrice) {
            println("$userName can afford ${balance / tshirtPrice} tshirts with the balance $balance")
        } else {
            println("$userName cannot afford any tshirts with the balance $balance")
        }
    }

    constructor() {
        userName = "Generic User"
        balance = 1
        canAfford()
    }

    constructor(userName: String, balance: Int) {
        this.userName = userName
        this.balance = balance
        canAfford()
    }

    constructor(newUserName: String) {
        userName = newUserName
        balance = 2
        canAfford()
    }
}

fun main() {
    val user1 = UserAccount()
    val user2= UserAccount("Mary")
    val user3= UserAccount("John", 200)
    val user4= UserAccount("Carol", 500)
}