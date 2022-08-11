package extensions

//Demonstração do uso de extensions functions

fun main() {

    /* val name = "Robson"
     println(name.h1())*/

    val person = Person(name = "Robson", age = 34, address = "São Paulo - Brazil ")
    person.info()
    println(person.addressInfo())

}

fun String.h1(): String {
    return "<h1>$this</h1>"
}

class Person(
    private val name: String,
    private val age: Int,
    val address: String
) {
    fun info() = "My name is $name, and I'm $age yeards old!"
}

//Declaração do nome da classe seguido de .nomeDaFuncção
fun Person.addressInfo() = "Come visit me in $address !"