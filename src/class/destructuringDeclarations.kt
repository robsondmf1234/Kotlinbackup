package `class`

fun main() {
    val pair = Pair(first = 1, second = "Robson")
    println("First: ${pair.first}")
    println("Second: ${pair.second}")


    val (id, name) = pair
    println("Id: $id")
    println("Name: $name")

    val person = Person4(nome = "Robson", age = 35, address = "São Paulo,Brazil")
//    val (nome, age, address) = person
    val (_, age, _) = person
    println("Age: $age")

    val map = mapOf(1 to "One")
    for ((number,text) in map){
        println("Number: $number and Text: $text")
    }
}


data class Person4(
    val nome: String,
    val age: Int,
    val address: String,
)