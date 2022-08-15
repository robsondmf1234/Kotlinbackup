package nullatype

fun main() {
    getName(name = "Robson")
    getName(name = null)

    getName2(name = "Robson")
    getName2(name = null)
    getName2(name = "")
}

fun getName(name: String?) {
    //Podemos utilizar o Elvis operator para definir um valor padrão quando recebermos algum valor nulo
    //Safe call para podermos utilizar a variavel
    println(name?.length ?: 0)
    //Outro exemplo
    //println(name?.length ?: "Nulo")


}

fun getName2(name: String?) {
    //Retorna true caso nossa varivale seja nula
    println(name.isNullOrBlank())
    //Retorna true caso nossa varival seja nula ou vazia
    println(name.isNullOrEmpty())
}
