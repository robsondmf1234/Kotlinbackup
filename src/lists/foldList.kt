package lists

fun main() {

    fold()
    foldRight()
    foldExemplo()
    reduceExemplo()
    foldRunning()
}

fun reduceExemplo() {
    //Exemplo que demonstra o funcionamento da extension .reduce
    //funcionamento é igual ao .fold, porem o reduce não aceita numero initial, ele usa o index 0 de nossa lista
    val list = listOf(1, 10, 100, 1000)

    val result = list.reduce { sum, number ->
        println("Initial: $sum,Number:$number")
        sum + number
    }
    println("Final Reduce: $result")
}

fun foldExemplo() {
    //Exemplo que demonstra o funcionamento da extension .fold
    val list = listOf(1, 10, 100, 1000)
    var accumulator = 0
    val operation = { sum: Int, number: Int -> sum + number }
    for (number in list) {
        accumulator = operation(accumulator, number)
    }
    println("Final: $accumulator")
}

fun foldRight() {
    val list = listOf(1, 10, 100, 1000)
    //Função fold , determinamos o valor inicial de nossa lista
    //Ex: em nossa lista , index =0 , vale 1
    //passamos na função lambda um numero que será o acumulador(sum) e o outro o numeros que serão acrescentados(number)
    //Ao final da iteração na lista teremos o valor acumulador de todos os numeros de nossa lista
    //foldRight , pegara o numero mais a direita Ex: 1000
    // e fará a iteração no nosso exemplo da direita para esquerda
    val result = list.foldRight(initial = 0) { sum, number ->
        println("Initial: $sum,Number:$number")
        sum + number
    }
    println("Final: $result")
}
fun foldRunning() {
    //Exemplo que demonstra o funcionamento da extension .runningFold
    //funcionamento é igual ao .fold, porem o runningFold, retorna ao final uma lista com as somas durante as iteração

    val list = listOf(1, 10, 100, 1000)
    val result = list.runningFold(initial = 0) { sum, number ->
        println("Initial: $sum,Number:$number")
        sum + number
    }
    println("Final runningFold: $result")
}

private fun fold() {
    val list = listOf(1, 10, 100, 1000)
    //Função fold , determinamos o valor inicial de nossa lista
    //Ex: em nossa lista , index =0 , vale 1
    //passamos na função lambda um numero que será o acumulador(sum) e o outro o numeros que serão acrescentados(number)
    //Ao final da iteração na lista teremos o valor acumulador de todos os numeros de nossa lista
    val result = list.fold(initial = 0) { sum, number ->
        println("Initial: $sum,Number:$number")
        sum + number
    }
    println("Final: $result")
}