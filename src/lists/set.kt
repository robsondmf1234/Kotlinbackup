package lists

//Demonstração do uso de Set
//Set não permite que numeros repetidos sejam inseridos
fun main() {
    //declarando um Set
    val mySet = setOf(1, 2, 2, 3, 3, 4, 5)

    //Declarando um Set mutavel
    val mySet2 = mutableSetOf(1, 2, 2, 3, 3, 4, 5)
    println(mySet)

    //Método (.contains) verifica se o elemento(ex:2) contem no nosso Set
    println(mySet.contains(element = 2))

    //Verifica se (2) contém dentro do nosso Set
    println(2 in mySet)

    //Método (.containsAll) verifica se todos os elementos(1, 3, 5)
    println(mySet.containsAll(elements = setOf(1, 3, 5)))

    //Método (.containsAll) verifica se todos os elementos(1, 3, 10)
    println(mySet.containsAll(elements = setOf(1, 3, 10)))

    //Retorna um set com valores que tenham em nosso Set e que não contem no set passado como parametro(Ex:setOf(x,x,x)
    println((mySet subtract setOf(1, 2, 3, 4, 5, 6)))

    //Retorna um set com valores que tenham em nosso Set e que não contem no set passado como parametro(Ex:setOf(x,x,x)
    println((mySet intersect setOf(1, 2, 3, 4, 5, 6, 11)))

    //Retorna um set com valores de nosso Set(mySet) junto com nossos valores passado como parametro(Ex:setOf(6,7,8,9,10)
    println((mySet union setOf(6, 7, 8, 9, 10)))

    //Declarando um list
    val myList = listOf(1, 2, 2, 3, 4, 5, 6, 4)
    println("List: $myList")

    //Convertendo nossa list(myList) para Set com isso eliminando os valores repetidos
    println("Set: ${myList.toSet()}")

    //Método .distinct tem o mesmo efeito que o set, elimina os valores repetidos
    println("Distinct: ${myList.distinct()}")

}