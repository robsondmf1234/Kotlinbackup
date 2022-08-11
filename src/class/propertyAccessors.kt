package `class`

fun main() {
    val person = Person()
    println(person.age)
    person.addAge(newAge = 38)
    println(person.age)

/*    val person = Person(age = 17)
    println(person.age)
    println(person.isMinor())*/
}

class Person {
    //private set não permite alterar o valor do property
    var age = 0
        private set

    fun addAge(newAge: Int) {
        age = newAge
    }
}
/*
class Person(val age: Int) {
    fun isMinor() = age < 18

    var age = 0
    //get em Kotlin
        get() {
            return field
        }
        //set em Kotlin
        set(value) {
            field = value
        }


    //Quando uma property for val não se usa o set
      val age2 = 0
          get() {
              return field
          }

}*/

