package lists

fun main() {
    val first = listOf("a", "b", "c", "d")
    val second = listOf(1, 2, 3, 4)

    //Método .zip vai criar uma lista de Pair, com os valores que passamos em nossas listas
    println(first.zip(second))
    //O tamanho da lista de Pair que irá nos retornar vai ser determinado pela menor quantidade
    //de elementos contido em alguma das 2 listas(Ex: first[4] ou second[4])
    println((1..100).zip(1..90))


    val ids = listOf(10, 11, 12)
    val names = listOf("Bob", "Jill", "Jim")
    //Zip vai criar uma lista de Person, quando utilizamos lambda , por causa do Transform
    val result = ids.zip(names) { id, name ->
        Person6(id = id, name = name)
    }
    println("List de Person criada pelo .zip através do Transform")
    println(result)

    val numberMap = mapOf<Int, String>(
        1 to "One",
        2 to "Two",
        3 to "Three",
        4 to "Four",
        5 to "Five"
    )
    //Imprimindo o Map
    println("Imprimindo o Map")
    println(numberMap.toList())
    //Tranformando o map em um List e após isso utilizando o .unzip para desagrupar o (Key,Value)
    //criamos 2 listas(Key,Value)
    val (numbers, text) = numberMap.toList().unzip()
    println(numbers)
    println(text)

    val list = listOf(
        listOf(1, 2),
        listOf(2, 4),
        listOf(5, 10)
    )
    println(list)
    //Utilizando o .flatten para retornarmos uma lista só apartir de todas as lista que recebemos nela
    //Ex: ao utilizarmos list que contem uma de list<Int>
    println(list.flatten())

    val letras = listOf(
        listOf("A","B"),
        listOf("C","D"),
        listOf("E","F"),
    )
    //Utilizando o .flatten para retornarmos uma lista só apartir de todas as lista que recebemos nela
    //Ex: ao utilizarmos list que contem uma de list<String>
    println(letras)
    println(letras.flatten())
}


data class Person6(
    val id: Int,
    val name: String
)
