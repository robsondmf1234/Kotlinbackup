package lists

//Demonstração do uso de list
fun main() {
    //List<> é uma lista imutavel
    val lista = listOf(1, 2, 3, 4, 35, 6, 7, 8, 29, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 13)
    //Imprimindo a lista inteira
    println(lista)
    //Imprimindo um elemento especifico da lista, passando o index[x]
    println(lista[0])
    //Imprimindo o primeiro elemto da lista
    println(lista.first())
    //Imprimindo o ultimo elemento da lista
    println(lista.last())
    //Imprimindo 3 elementos da lista
    println(lista.take(n = 3))
    println("Quatidade de numero 1 encontrado na lista foi :" + countNumberOnList(list = lista, number = 1))

    //Filtrando a lista
    println("Lista filtrada: ${lista.filter { it > 5 }}")

    //Filtrando a lista
    println(
        "Mostrando o numero do index 0: ${
            lista.filterIndexed { index, number ->
                index == 0
            }
        }"
    )

    //Filtrando a lista com o numero que passamos como parametro
    println("Retorna uma lista ,exceto com a variavel que passamos no predicate EX: 1")
    println(lista.filterNot { number ->
        number == 1
    })

    //Filtrando a lista com o numero que passamos como parametro
    val listaWithNull = listOf(1, null, 2, null, 3, null, 4, null)
    println("Retorna uma lista, retirando os valores nulos")
    println(listaWithNull.filterNotNull())

    //Contando a quantidade de elementos que passamos no predicated
    println("Conta a quantidade de numeros 1 que tem na lista")
    println(lista.count { number ->
        number == 1
    })

    //Conta a quantidade de elementos que possuimos na lista
    println("Conta a quantidade de elementos tem na lista")
    println(lista.count())

    //Retorna o elemento caso o mesmo tenha na lista, caso não tenha , retorna null
    println("Retorna o elemento 10 ,caso o mesmo tenha na lista")
    println(lista.find { number ->
        number == 10
    })

    //Retorna o primeiro elemento da lista,mesmo se o primeiro elemento for null
    println("Retorna o primeiro elemento da lista,mesmo se o primeiro elemento for null")
    println(listaWithNull.firstOrNull())

    //Retorna o ultimo elemento da lista,mesmo se o primeiro elemento for null
    println("Retorna o ultimo elemento da lista,mesmo se o primeiro elemento for null")
    println(listaWithNull.lastOrNull())

    //Retorna true, caso algum elemento passado corresponda a condição EX:number ==nul
    println("Retorna true, caso algum elemento passado corresponda a condição")
    println(listaWithNull.any { number ->
        number == null
    })

    //Retorna true, caso todos os elementos satisfaçam a condição EX: serem diferentes de 29
    println("all. Retorna true, caso todos os elementos satisfaçam a condição")
    println(lista.all { number ->
        number != 29
    })

    //Retorna true, caso todos os sejam diferentes da condição EX: serem iguais a 29
    println("none. Retorna true, caso todos os sejam diferentes da condição.")
    println(lista.none { number ->
        number == 29
    })

    //Partition vai nos retornar um pair(List<Int>,List<Int>).
    // Uma lista contendo aqueles elementos que atenderam a condição e outra que não atenderam a condição passada
    // Ex: number ser maior que 10
    println("partition. Retorna uma lista com numeros maiores que 10 e outra que não são maiores")
    val (match, noMatch) = lista.partition { number ->
        number > 10
    }
    println(match)
    println(noMatch)


    val randomNumbers = listOf(2, 3, 1, 5, 4, 8, 6, 7, 9, 10)
    println(".sum .Retorna a soma de todos os elementos da lista :${randomNumbers.sum()}")
    println(randomNumbers)
    println(".sorted .Retorna a lista ordenada :${randomNumbers.sorted()}")
    println(".sortedDescending .Retorna a lista ordenada (maior para menor) :${randomNumbers.sortedDescending()}")

    val personList = listOf(
        Person4(name = "John", age = 32),
        Person4(name = "Marry", age = 25),
        Person4(name = "Marlon", age = 45)
    )
    //Soma todas as idades dos objetos contido na lista
    println(personList.sumOf { person ->
        person.age
    })
    //Ordena a lista de forma ascendente pela idade
    println(personList.sortedBy { person ->
        person.age
    })

    //Ordena a lista de forma descendete pela idade
    println(personList.sortedByDescending {  person ->
        person.age
    })
}

fun countNumberOnList(list: List<Int>, number: Int): Int {
    var count = 0
    for (e in list) {
        if (number == e) {
            count++
        }
    }
    return count
}

data class Person4(
    val name: String,
    val age: Int
)