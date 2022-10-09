package membersReferences

//Demonstração do uso de members references
fun main() {

    val people = listOf(
        Person5(name = "John", age = 20, male = true),
        Person5(name = "Michael", age = 21, male = true),
        Person5(name = "Sam", age = 22, male = true),
        Person5(name = "Ana", age = 23, male = false),
        Person5(name = "Jenifer", age = 24, male = false)
    )

    //Filtrando as pessoas pelo sexo masculino e imprimindo seus nomes
    people.filter { person -> person.male }.forEach { println(it.name) }

    //Filtrando as pessoas pelo sexo masculino e imprimindo seus nomes,porem ao invés de utilizar expressão
    //lambda no predicated, utilizamos members references, passando a Classe::property
    //Ex: Person5::male
    people.filter(Person5::male).forEach { println(it.name) }

    println()
    println()

    //Filtrando as pessoas pelo sexo feminino e imprimindo seus nomes
    people.filter { person -> !person.male }.forEach { println(it.name) }
    //Filtrando as pessoas, onde a busca é por sexo diferente de masculino e imprimindo seus nomes,
    // porem ao invés de utilizar expressão
    //lambda no predicated, utilizamos members references, passando a Classe::property
    //Ex: Person5::male
    people.filterNot(Person5::male).forEach { println(it.name) }

    println("Ordenando os elementos pela idade.")
    people.sortedBy(Person5::age).forEach { println(it.name) }
    people.sortedByDescending(Person5::age).forEach { println(it.name) }

    ///Function reference
    //Iremos utilizar function reference, para não colocar tanta logica em um lambda
    //Dentro do predicated, só iremos mandar uma referencia a nossa function important
    println(people.any(Person5::important))
    //Replicando a função important, porem sem declarar uma extension function
    println(people.any(::important2))

    val names = listOf("upcastingEdownCasting.Dog", "upcastingEdownCasting.Cat")
    //Função passando somente a referencia da classe
    println(names.mapIndexed(::Animal))
    //Mesma função porem utilizando lambda, mais código a ser feito
    println(names.mapIndexed { index, name ->
        Animal(id = index, name = name)
    })
}

fun Person5.important() = this.name.startsWith(prefix = "M") && this.age > 20

//Regular function
fun important2(person5: Person5) = person5.name.startsWith(prefix = "M") && person5.age > 20

data class Person5(
    val name: String,
    val age: Int,
    val male: Boolean
)

data class Animal(
    val id: Int,
    val name: String
)