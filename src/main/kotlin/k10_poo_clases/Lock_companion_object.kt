package k10_poo_clases

import kotlin.random.Random

/*
    A lock needs a key. The lock class will provide the ability to create key classes without
    the need for an object.
    To create the lock, a key must be provided in the constructor. It then sets a secret code
    variable in both the lock and the key, binding them together.
    To open the lock, a key with the same secret code value must be provided.
    Implement this functionality in a program.
 */

class Key {
    var secretCode: String = ""
        set(value) {
            if (field == "") {
                field = value
            }
        }
}

class Lock(key: Key) {
    val secretCode: String

    init {
        secretCode = generateSecret()
        key.secretCode = secretCode
    }

    companion object {
        fun createKey() = Key()
    }

    fun unlock(key: Key) {
        if (key.secretCode == secretCode) {
            println("Lock is open")
        } else {
            println("Key is not correct")
        }
    }

    fun generateSecret(): String {
        return Random(System.currentTimeMillis()).nextInt().toString()
    }
}

fun main() {
    val correctKey = Lock.createKey()
    val myLock = Lock(correctKey)
    myLock.unlock(correctKey)

    val randomKey = Lock.createKey()
    myLock.unlock(randomKey)
}


/*
    Este programa implementa un sistema básico de una cerradura (Lock) que puede ser
    desbloqueada únicamente con la llave (Key) correcta. A continuación, te explico paso a paso
    qué hace el programa:

    Desglose de la funcionalidad
    Clase Key:

    Representa la llave.
    Tiene una propiedad llamada secretCode, inicialmente vacía.
    El código secreto solo se puede establecer una vez (si el valor actual está vacío).
    Clase Lock:

    Representa una cerradura.
    Durante su creación, genera un código secreto usando la función generateSecret() y lo
    asigna al Key que se pasa al constructor.
    Tiene un método unlock(key: Key) que verifica si la llave dada tiene el código secreto correcto:
    Si coincide, imprime "Lock is open".
    Si no coincide, imprime "Key is not correct".
    Método generateSecret():

    Genera un número aleatorio (como cadena) basado en el tiempo actual.
    Método createKey():

    Es un método de utilidad que permite crear una nueva instancia de Key.
    Función principal main:

    Crea una llave inicial (correctKey) utilizando Lock.createKey().
    Crea una cerradura (myLock) con esa llave, vinculándola con un código secreto.
    Intenta desbloquear la cerradura utilizando:
    La llave correcta (correctKey), lo cual funciona.
    Una llave aleatoria nueva (randomKey), lo cual falla porque no tiene el código correcto.
    Salida esperada
    El programa imprime lo siguiente:

    Lock is open
    Key is not correct

    Resumen
    El programa simula una cerradura con un sistema único de llave y código secreto.
    Solo la llave correcta creada durante la inicialización puede abrir la cerradura.
 */