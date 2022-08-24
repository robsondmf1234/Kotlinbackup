package init

fun main() {
    val person = Person5(name = "Robson")
    //Inicializando a classe ,chamado o segundo construtor
    val person2 = Person5(name = "Robson", age = 25)
    val person3 = Person5(name = "Robson", age = 25, isMale = true)
    println(person3.toString())
}

//Retirando o val , não conseguiremos mais acessá-lo($name) na função(printName)
class Person5(
    val name: String
//    val age: Int = 0,
//    val isMale: Boolean = false
) {

    init {
        println("Hey $name, I'm currently initializing")
    }

    init {
        println("Executing after the first init block...")
    }

    //Segundo construtor
    //também chamado de "overloaded constructor"
    //Além do construtor inicial class Person5(val name:String)
    //podemos ter um segundo construtor, onde podemos definir um outro atributo
    //no nosso exemplo constructor(name: String, age: Int) : this(name = name)
    // (EX: -> :this , acessaremos o construtor inicial.) e declaramos uma nova property (age:Int)
    constructor(name: String, age: Int) : this(name = name) {
        println("Secondary constructor #1")
    }

    //Declarando um novo construtor
    constructor(name: String, age: Int, isMale: Boolean) : this(name = name) {
        println("Secondary constructor #1")
    }

    /*   fun printName(){
           println("My name is: $name")
       }*/

}