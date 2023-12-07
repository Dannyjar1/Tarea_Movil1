
class Persona(val nombre: String, val edad: Int, val ocupacion: String) {

    fun descripcion() {
        println("$nombre, $edad años, $ocupacion")
    }
}