class Cuadrado(override val area: Double) : Forma() {
    override fun dibujar() {
        println("Dibujando un cuadrado")
    }
}