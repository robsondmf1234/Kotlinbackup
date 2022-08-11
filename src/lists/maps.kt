package lists

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
    //Removendo um elemento de nosso MutableMap
    animalsMutable.remove("Whale")
    println("MutableMap de animals: $animalsMutable")

    //Imprimindo nosso Map criado
    println("Map de animals: $animals")

    //Imprimindo o value do nosso Map criado, passando o Map e a key("Tiger")
    println(animals["Tiger"])

    //Imprimindo o value de algum elemento que não existe em nosso Map , tomaremos um null, como resposta
    println(animals["Dog"])

    //Imrpimindo todos as keys
    val key = animals.keys
    println(key)

    //Imrpimindo todos os values
    val values = animals.values
    println(values)

    //Imrpimindo todos as keys e values
    for (entry in animals) {
        print("Key:${entry.key} ")
        println("Value: ${entry.value}")
    }

    //Imrpimindo todos as keys e values
    for ((key, value) in animals) {
        print("Key:$key ")
        println("Value: $value")
    }

    //Imrpimindo todos as keys e values
    animals.forEach { (key, value) ->
        println("Key: $key - Value: $value")
    }

    //Imprimindo um valor default ,quando não tivermos algum elemento com a key passado
    //no nosso (EX: key="Dog", valor do value que será retornado como default será "Black")
    println(animals.getOrDefault(key = "Monkey", defaultValue = "Black"))
    println(animals.getOrDefault(key = "Dog", defaultValue = "Black"))

    //Filtrando o Map , para só nos retornar os elementos que tiverem o value maior que 4
    val filterMap = animals.filter {
        it.value.length > 4
    }
    println("Mostrando o Map filtrado: $filterMap")

    //Convertendo um list em Map
    val animalList = listOf("Monkey", "Tiger", "Whale")
    println(animalList.associateBy { it })


    val monkey = Animal(name = "Monkey", age = 2)
    val tiger = Animal(name = "Tiger", age = 4)
    val whale = Animal(name = "Whale", age = 6)
    val animalList2 = listOf(monkey, tiger, whale)

    //Convertendo um list em um map
    val animalMap = animalList2.associateBy({ it.name }, { it.age })
    println(animalMap)
}

class Animal(
    val name: String,
    val age: Int
)