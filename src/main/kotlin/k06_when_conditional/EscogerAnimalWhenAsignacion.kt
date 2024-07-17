package k06_when_conditional

fun main(){
    var animal = "dog"
    var action= when(animal){
        "cat"-> "feed it"
        "dog"->"pet it"
        else->"google it"
    }

    println("When you meet a $animal you should $action")
}