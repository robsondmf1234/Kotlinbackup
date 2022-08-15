package generics

fun main() {

    val vehicle = Vehicle(value = Carro())
    val car = vehicle.getValue()
    //Não é possivel acessar o método de nosso objeto ,pois o mesmo é um objeto do tipo Any e não car
    //Já com o da nossa classe com Vehicle com Generics, conseguiremos retornar o objeto do tipo Carro
    car.start()

    println(getName(name = "Fereira"))
    println(getName(name = 35))

}

//Função com Generics, será possivel passar qualquer tipo de parametro (EX:String ,Int e etc)
fun <T> getName(name: T): T = name

/*
//Exemplo sem Generics
class Vehicle(private val value: Any) {
    fun getValue() = value
}
*/

//Exemplo com Generics
class Vehicle<T>(private val value: T) {
    fun getValue(): T = value
}

class Carro {
    fun start() = "Starting the engine...."
}