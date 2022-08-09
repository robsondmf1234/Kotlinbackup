package lists

//Demonstração do uso de list
fun main() {
    //List<> é uma lista imutavel
    val lista = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 1)
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
    println("Numero encontrado na lista foi :" + countNumberOnList(list = lista, number = 1))
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