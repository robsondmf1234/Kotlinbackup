package repeticoes

//Exercicio para mostrar letra a letra , a partir de uma palavra passada como parametro
fun main() {

    imprimeString(word = "Campinas é uma cidade proxima de São Paulo.")
    println()
    imprimeString2(word = "Campinas é uma cidade proxima de São Paulo.")

}

private fun imprimeString2(word: String) {
    var count = 0
    do {
        print(word.elementAt(count))
        count++
    } while (count < word.length)
}

private fun imprimeString(word: String) {
    var count = 0
    while (count < word.length) {
        print(word.elementAt(count))
        count++
    }
}

fun countString(word: String): Int = word.length
