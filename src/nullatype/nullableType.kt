package nullatype

fun main() {
    val map = mapOf(1 to "One")
    val result = map[2]
    println(result)

    val resularString = "abc"
//    val text: String = null

    val nullableString: String? = null
    val text2: String? = resularString
//    val text3: String = text2

    if (nullableString != null) {
        println(nullableString.length)
    }

    val person = Person5(name = "Robson", age = 35)
    val nullablePerson: Person5? = null

}

data class Person5(
    val name: String,
    val age: Int
)