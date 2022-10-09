package classeabstrata

fun main() {

}

//Classe abstrata não permite que sejam instanciadas.
//Classes abstratas podem manter estados de suas properties já nas interfaces não
abstract class Animal() {
    //As properties de uma classe abstrata, também são abstratas
    abstract val name: String
    protected var energy: Int = 0

    //Quando não inserirmos a palavra-chave open na frente do método, esse método não será visto como obrigatório nas
    // classes que implementam a classe upcastingEdownCasting.Animal
    fun speak() = "Wof"
    open fun speak2(): String = "Wof"
    abstract fun eat()
}

abstract class Dog : Animal() {
    override val name: String = "Rex"

    override fun eat() {
        energy += 1
    }

    override fun speak2(): String {
        return "Au-Au"
    }

}

/*
interface PersonA {
    val name: String
}

//Por default todas as properties em interface são asbtratas.
interface PersonB {
    abstract val name: String
}*/

abstract class PersonA(private val name: String) {
    open fun printName() {
        println(name)
    }
}

//Por default todas as properties em interface são asbtratas.
interface PersonB {
    fun printName(name: String) {
        println(name)
    }
}

//Consegumios implementar uma classe abstrata e uma interface ao mesmo tempo
//Podemos utilizar seus metodos ,para isso precisamos especificar qual metodo estamos usando atraves do super<NomeDaClasse>
class Male : PersonA(name = "Ferreira"), PersonB {
    override fun printName() {
        super<PersonA>.printName()
    }

    override fun printName(name: String) {
        super<PersonB>.printName(name)
    }
}