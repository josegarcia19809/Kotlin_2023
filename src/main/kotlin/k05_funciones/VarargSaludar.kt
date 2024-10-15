package k05_funciones

// VarargSaludar

fun saludarHola(vararg nombres: String){
    for (nombre in nombres){
        println("Hola $nombre")
    }
}

fun main() {
    saludarHola("Maria", "Juan", "Alex")
    saludarHola("Rox", "Carolina", "Carlos", "Luis")
}