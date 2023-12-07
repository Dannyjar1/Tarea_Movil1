open class Animal(val nombre: String) {
    // Método para hacer sonido
    open fun hacerSonido() {
        println("El animal hace un sonido .")
    }
}
class Perro(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("$nombre hace: ¡Guauuuuu!")
    }
}

class Gato(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("$nombre hace: ¡Miauuuuu!")
    }
}