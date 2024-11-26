package k99_text_adventure_game

import java.io.File

fun readLocationInfo(): Map<Int, Location> {
    val locations = mutableMapOf<Int, Location>()

    File("locations_big.txt").reader().forEachLine {
        val tokens = it.split("`")

        val location = Location(tokens[0].toInt(), tokens[1])
        locations[location.locationID] = location
    }

    File("directions_big.txt").reader().forEachLine {
        val tokens = it.split(",")

        locations[tokens[0].toInt()]?.addExit(tokens[1], tokens[2].toInt())
    }
    return locations
}

fun main_() {
    // Leer ubicaciones y direcciones
    val locations = readLocationInfo()

    // Imprimir el resultado
    locations.forEach { (id, location) ->
        println("Location ID: $id")
        println("Description: ${location.description}")
        println("Exits: ${location.exits}")
        println()
    }
}

/*
    val locations = mutableMapOf<Int, Location>()
    Este mapa almacenará las ubicaciones (Location) cargadas desde el archivo locations_big.txt.
    Las claves son los identificadores únicos (locationID), y los valores son instancias de Location.

    Lectura del archivo locations_big.txt:
    Se divide usando el separador ` (backtick).
    Se crea un objeto Location con:
        locationID (convertido a entero).
        description (una cadena descriptiva).
        La ubicación se agrega al mapa locations.

    Lectura del archivo directions_big.txt:
    Se divide usando el separador , (coma).
    Formato esperado:   <locationID>,<direction>,<destinationID> 1,N,2

    Esto indica que desde la ubicación 1, moverse hacia el norte (N) conduce a la ubicación 2.
    Se obtiene la ubicación correspondiente del mapa locations usando el locationID como clave.
    Si la ubicación existe, se agrega la salida usando el método addExit.

    Después de procesar ambos archivos, el mapa locations se devuelve con todos los datos cargados.
 */