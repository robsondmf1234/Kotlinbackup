package lists

import `class`.Person2

//Demonstração do uso de Map
fun main() {

    //Criação de Map, para criar um objeto em Map, precisamos passar uam chave e um valor
    // (Map("key" to "value") (Ex: "Monkey"-> key , "brown" -> value)
    val animals = mapOf(
        "Monkey" to "brown",
        "Tiger" to "orange",
        "Whale" to "blue",
        "Tiger" to "white",
    )

    //Criação de um mutableMap
    val animalsMutable = mutableMapOf(
        "Monkey" to "brown",
        "Tiger" to "orange",
        "Whale" to "blue",
    )
    //Imprimindo nosso Map criado
    println("MutableMap de animals: $animalsMutable")
    println()
    //Removendo um elemento de nosso MutableMap
    animalsMutable.remove("Whale")
    println("MutableMap de animals: $animalsMutable")

    println()

    //Imprimindo nosso Map criado
    println("Map de animals: $animals")

    println()

    //Imprimindo o value do nosso Map criado, passando o Map e a key("Tiger")
    println(animals["Tiger"])

    println()

    //Imprimindo o value de algum elemento que não existe em nosso Map , tomaremos um null, como resposta
    println(animals["Dog"])

    println()

    //Imrpimindo todos as keys
    val key = animals.keys
    println(key)

    println()

    //Imrpimindo todos os values
    val values = animals.values
    println(values)

    println()

    //Imrpimindo todos as keys e values
    for (entry in animals) {
        print("Key:${entry.key} ")
        println("Value: ${entry.value}")
    }

    println()

    //Imrpimindo todos as keys e values
    for ((key, value) in animals) {
        print("Key:$key ")
        println("Value: $value")
    }

    println()

    //Imrpimindo todos as keys e values
    animals.forEach { (key, value) ->
        println("Key: $key - Value: $value")
    }

    //Imprimindo um valor default ,quando não tivermos algum elemento com a key passado
    //no nosso (EX: key="Dog", valor do value que será retornado como default será "Black")
    println(animals.getOrDefault(key = "Monkey", defaultValue = "Black"))
    println(animals.getOrDefault(key = "Dog", defaultValue = "Black"))

    println()

    //Filtrando o Map , para só nos retornar os elementos que tiverem o value maior que 4
    val filterMap = animals.filter {
        it.value.length > 4
    }
    println("Mostrando o Map filtrado: $filterMap")

    println()

    //Convertendo um list em Map
    val animalList = listOf("Monkey", "Tiger", "Whale")
    println(animalList.associateBy { it })

    println()

    val monkey = Animal(name = "Monkey", age = 2)
    val tiger = Animal(name = "Tiger", age = 4)
    val whale = Animal(name = "Whale", age = 6)
    val animalList2 = listOf(monkey, tiger, whale)

    //Convertendo um list em um map
    val animalMap = animalList2.associateBy({ it.name }, { it.age })
    println(animalMap)

    println()

    //Demonstração do uso de .zip , .groupBy

    val names = listOf("Alice", "Bob", "Bill", "Marry", "John")
    val ages = listOf(21, 15, 25, 42)
    //Criando uma lista de Person, através de 2 lsitas que recebemos
    val people = names.zip(ages) { name, age ->
        Person2(name = name, age = age)
    }
    println("Imprimindo a lista criada pelo.zip")
    println(people)

    println()

    val map = people.groupBy(Person2::age)
    //Criando um map criado pelo groupBy, utilizando Member reference, a chave será age
    // //e os values será uma lista de Person)
    println("Imprimindo um map criado pelo groupBy, utilizando Member reference, a chave será age")
    println(map)
    //Imprimindo o elemento com a key[21]
    println(map[21])

    println()

    //Criando um map , o elemento do map, vai ficar associado a property name
    val map2 = people.associateWith(Person2::name)
    println("Imprimindo um map criado pelo associateWith")
    println(map2)

    println()

    val map3 = people.associateBy(Person2::name)
    println(map3)
    //Imprimindo as keys
    println(map3.keys)
    //Imprimindo os values
    println(map3.values)
    println()
    //Podemos buscar algum map com o .getOrElse(key){defaultValue} passando a key , caso não seja encontrado nenhum elemento
    //com aquele valor ,podemos definir um valor padrão
    println(map3.getOrElse(key = "Alice123") { "Unknown" })
    //Quando tiver algum elemento que tenha aquela key o elemento será mostrado
    println(map3.getOrElse(key = "Alice") { "Unknown" })

    println()

    val mutableMap = map3.toMutableMap()
    println(mutableMap)
    //Função .getOrPut irá buscar um elemento pela nossa key passa (Ex:key = "Alice123"), caso não
    //encontre nenhum elemento com esta key, irá incluir um objeto qe podemos definir no defaultValue
    // através do lambda (Ex:  Person2(name = "Alice123", age = 35) )
    println(mutableMap.getOrPut(key = "Alice123") {
        Person2(name = "Alice123", age = 35)
    })
    println(mutableMap)

    println()
    //Função .filterKeys ,irá retornar um map(key,value), no predicated, definimos que só queremos
    // os elementos que comecer com a letra "B"
    println(map3.filterKeys { it.startsWith(prefix = "B") })

    //Aqui utilizamos o .map para transformar nosso map em uma lista de String
    //passando no lambda o value , que usaremos para construir a String no final
    val result = map3.map { (_, value) ->
        "\"${value.name}=${value.age}"
    }
    println(result)
}

class Animal(
    val name: String,
    val age: Int
)