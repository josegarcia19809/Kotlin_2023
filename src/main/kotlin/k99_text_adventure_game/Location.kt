package k99_text_adventure_game

data class Location(val locationID: Int, val description: String) {
    val exits = mutableMapOf<String, Int>()

    init {
        exits["Q"] = 0
    }

    fun addExit(direction: String, destinationId: Int) {
        exits[direction] = destinationId
    }
}

/*
    Este código en Kotlin define una clase de datos llamada Location, que modela un lugar con
    identificadores y descripciones, y permite asociar direcciones de salida con destinos.

    val exits = mutableMapOf<String, Int>()
    Es un mapa mutable (MutableMap), que almacena pares clave-valor:
    Clave (String): Representa una dirección (por ejemplo, "N" para norte, "S" para sur).
    Valor (Int): El identificador de la ubicación de destino al seguir esa dirección.

    Bloque de inicialización (init)
    Cuando se crea un objeto Location, se inicializa el mapa exits con una salida especial:
    "Q": Se interpreta como una opción para "salir" o "quitarse", que lleva al lugar con ID 0.

    Función addExit
    Agrega o actualiza una salida desde la ubicación actual hacia otra ubicación.
    Parámetros:
    direction: La dirección de la salida (por ejemplo, "N", "S", "E", "W").
    destinationId: El identificador de la ubicación a la que conduce esa salida.
    Actualiza el mapa exits para reflejar esta salida.
 */