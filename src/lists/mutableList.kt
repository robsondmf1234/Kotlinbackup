package lists

//Demonstração do uso de list
fun main() {
    //List<> é uma lista imutavel
    val listaMutavel = mutableListOf<Int>()
    //Imprimindo a lista inteira
    println("Lista mutavel : $listaMutavel")
    listaMutavel.addAll(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    println("Lista mutavel : $listaMutavel")

    //Adicionando elemento na lista mutavel
    listaMutavel.add(element = 11)
    println("Adicionando elemento na lista mutavel")
    println("Lista mutavel: $listaMutavel")

    println("Removendo o elemento 11")
    listaMutavel.remove(11)
    println("Lista mutavel: $listaMutavel")

    println("Removendo o elemento do ultimo index")
    listaMutavel.removeAt(listaMutavel.lastIndex)
    println("Lista mutavel: $listaMutavel")

    println("Mostrando o ultimo index.")
    println(listaMutavel.lastIndex)
    println("Mostrando o tamanho da mutable lista.")
    println(listaMutavel.size)
}
