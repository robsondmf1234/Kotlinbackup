package inheritance

//Demonstração do uso de Herança
//
fun main() {
    val dog = Dog(dogName = "Rex")
    val lion = Lion(lionName = "Max")

    println()
    //Não acessivel devido o portected na classe pai
//    println(dog.energy)
    dog.eat()
    dog.updateColor("Brown")
//    println(dog.energy)

    lion.printEnergy()
    lion.eat()
    lion.printEnergy()

}

open class Animal(val name: String) {

    //Adicionando o protected ,essa variavel não poderá ser acessada fora da classe pain(upcastingEdownCasting.Animal)
    // e das classes filhas (upcastingEdownCasting.Dog e Lion)
    //protected var energy = 0
    protected var energy = 0
    var color = "Black"

    init {
        println("upcastingEdownCasting.Animal class initializing...")
    }

    open fun printEnergy() {
        println("Current $name energy: $energy")
    }
    //Private só será acessado por essa própria classe
//    private var energy = 0

    open fun eat() {
        energy += 1
    }

    open fun run() {
        energy -= 1
    }
}

class Dog(dogName: String) : Animal(name = dogName) {
    init {
        println("upcastingEdownCasting.Dog class initializing...")
    }
    override fun eat() {
        energy += 5
    }

    override fun printEnergy() {
        super.printEnergy()
    }

    override fun run() {
        energy -= 5
    }
}

class Lion(lionName: String) : Animal(name = lionName) {
    init {
        println("Lion class initializing...")
    }
    override fun eat() {
        energy += 10
    }

    override fun printEnergy() {
        super.printEnergy()
    }

    override fun run() {
        energy -= 10
    }
}

fun Animal.updateColor(color: String) {
    this.color = color
}