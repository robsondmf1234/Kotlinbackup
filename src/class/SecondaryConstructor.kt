package `class`

fun main() {
    val person = Person5(name = "Robson")
    val person2 = Person5(name = "Robson", age = 35)
    val person3 = Person5(name = "Robson", age = 35, isMale = true)
}

class Person5(
    val name: String
//    val age: Int = 0,
//    val isMale: Boolean = false
) {
    init {
        println("Hey $name, I'm currently initializing...")
    }

    init {
        println("Executing after the first init block.")
    }

    //Adicionando um segundo construtor com mais parametros
    constructor(name: String, age: Int) : this(name = name) {
        println("Secondary constructor #1.")
    }

    //As properties no seggundo construtor não podem ser do tipo(var ou val)
    constructor(name: String, age: Int, isMale: Boolean) : this(name = name) {
        println("Secondary constructor #2.")
    }

    //Só teremos acesso a esta property caso no construtor primario a property esteja como (val ou var)
    fun printName() {
        println("My name is $name")
    }
}