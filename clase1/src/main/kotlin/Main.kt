//fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//}



fun main() {

    val persona1 = Persona("Danny", 30, "Ingeniero")
    val persona2 = Persona("Sully", 25, "Psicologa")
    val persona3 = Persona("Andres", 35, "Futbolista")


    persona1.descripcion()
    persona2.descripcion()
    persona3.descripcion()



    println("-------------------------")
    println("-------------------------")
    println("-------------------------")






    val animales = listOf(
        Perro("Chikis"),
        Gato("Pancho"),
        Animal("Cry")
    )

    // Llamada al método hacerSonido para cada animal
    for (animal in animales) {
        animal.hacerSonido()
    }


    println("-------------------------")
    println("-------------------------")
    println("-------------------------")

    val coche = Coche()
    val bicicleta = Bicicleta()
    val circulo = Circulo(50.0)
    val cuadrado = Cuadrado(30.0)

    // Uso de los métodos y propiedades
    coche.acelerar()
    bicicleta.acelerar()
    circulo.dibujar()
    cuadrado.dibujar()


}

