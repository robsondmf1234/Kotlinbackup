package generics

fun main() {

    val car = Car(tires = Tires(size = 17))
    //Chamada utilizando o Generics, não ficaremos limitados a 1 só tipo de parametro como exemplo1
    val car2 = Car(tires = "Exemplo com Generics 17")
    val car3 = Car(tires = 17)
    println(car.getValue())
    println(car2.getValue())
    println(car3.getValue())

}


data class Tires(val size: Int)
//Definindo Generics <T> em nossa classe, no parametro e no tipo de retorno,
// pois fazendo dessa forma ,poderemos receber qualquer tipo de parametro, e não ficaremos limitados
//como no primeiro Exemplo
class Car<T>(private val tires: T) {
    //Imprimindo a variavel que recebemos como parametro
    fun getValue(): T = tires
}

//Exemplo1
/*
data class Tires(val size: Int)
class Car(private val tires: Tires) {
    //Imprimindo a variavel que recebemos como parametro
    fun getValue() = tires
}*/
