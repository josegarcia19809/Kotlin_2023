package k11_poo_herencia_polimorfismo

// La clase Vehiculo contendrá datos generales sobre todos los vehículos en un inventario

open class Vehiculo(
    private var marca: String,
    private var modelo: String,
    private var kilometraje: Int,
    private var precio: Double
) {
    // Crear métodos set y get para cada atributo
    fun setMarca(marca: String) {
        this.marca = marca
    }

    fun getMarca(): String {
        return this.marca
    }

    fun setModelo(modelo: String) {
        this.modelo = modelo
    }

    fun getModelo(): String {
        return this.modelo
    }

    fun setKilometraje(kilometraje: Int) {
        this.kilometraje = kilometraje
    }

    fun getKilometraje(): Int {
        return this.kilometraje
    }

    fun setPrecio(precio: Double) {
        this.precio = precio
    }

    fun getPrecio(): Double {
        return this.precio
    }
}

// La clase Automovil es una subclase de la clase Vehiculo
class Automovil(
    marca: String,
    modelo: String,
    kilometraje: Int,
    precio: Double,
    private var puertas: Int
) : Vehiculo(marca, modelo, kilometraje, precio) {
    // Métodos set y get
    fun setPuertas(puertas: Int) {
        this.puertas = puertas
    }

    fun getPuertas(): Int {
        return this.puertas
    }
}

// La clase Camioneta es una subclase de la clase Vehiculo
class Camioneta(
    marca: String,
    modelo: String,
    kilometraje: Int,
    precio: Double,
    private var tipoTraccion: String
) : Vehiculo(marca, modelo, kilometraje, precio) {
    // Métodos set y get
    fun setTipoTraccion(tipoTraccion: String) {
        this.tipoTraccion = tipoTraccion
    }

    fun getTipoTraccion(): String {
        return this.tipoTraccion
    }
}

fun pruebaAutomovil() {
    // Crear un objeto de tipo Automovil. Este será un Audi 2007 con 12500 millas,
    // su precio es de $21,500.00 y tiene 4 puertas
    println("-".repeat(100))
    val automovilUsado = Automovil("Audi", "2007", 12500, 21500.00, 4)

    // Mostrar los datos del Automovil usado
    println("Datos del Automovil usado:")
    println("Marca: ${automovilUsado.getMarca()}")
    println("Modelo: ${automovilUsado.getModelo()}")
    println("Kilometraje: ${automovilUsado.getKilometraje()}")
    println("Precio: ${automovilUsado.getPrecio()}")
    println("Número de puertas: ${automovilUsado.getPuertas()}")
}

fun pruebaCamioneta() {
    // La camioneta es una Toyota Pickup 2002 con 40,000 millas,
    // su precio es de $12,000.00 y con una tracción en las 4 ruedas(4WD)
    println("-".repeat(100))
    val camionetaUsada = Camioneta("Toyota", "2002", 40000, 12000.0, "4WD")

    println("Datos de la camioneta usada:")
    println("Marca: ${camionetaUsada.getMarca()}")
    println("Modelo: ${camionetaUsada.getModelo()}")
    println("Kilometraje: ${camionetaUsada.getKilometraje()}")
    println("Precio: ${camionetaUsada.getPrecio()}")
    println("Tipo de tracción: ${camionetaUsada.getTipoTraccion()}")
}

fun main() {
    pruebaAutomovil()
    pruebaCamioneta()
}