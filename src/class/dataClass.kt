package `class`

fun main() {
    val person = Person2(name = "Robson", age = 35)
    val person2 = person.copy(age = 30)

/*    val personn = Person2(name = "Robson")
    val personn2 = Person2(name = "Robson")
    personn.age = 20
    personn2.age = 30
    println(personn.equals(personn2))*/

}

data class Person2(
    val name: String,
    val age: Int
)

data class Person3(
    val name: String
) {
    var age: Int = 0
}