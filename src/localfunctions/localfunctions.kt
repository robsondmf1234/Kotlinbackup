package localfunctions

import java.lang.StringBuilder

//Local functions são funções criada dentro de outra função
fun main() {
    start()
    addQuotes()
    //Não conseguiremos acessar a local functions .quoted, somente atrabés de um String
    //"Ferreira".quoted

    println()

    val list = listOf(1, 2, 3, 4, 5)
    list.forEach {
        //list.forEach  customFunctions@{
        if (it == 3) {
            //Return vai retornar para o metodo main, não vai alcançar "println("Completed")"
            //ao deixar o cursor em cima do return ,podemos ver que metodo main vai ser destacada pela IDE
            //return

            //Ao colocarmos essa anotations @forEach, vamos retornar o fluxo para a iteração e assim
            // poder alncaçar o "println("Completed")"
            return@forEach
            //      return@customFunctions
        }
        println("Loop $it")
    }
    println("Completed")
}

fun addQuotes() {
    //Só conseguiremos acessar a função .quoted, através de uma String, através de extensions functions
    fun String.quoted() = "\"$this\""
    println("Ferreira".quoted())
}

fun start() {
    val builder = StringBuilder()
    fun log(message: String) = builder.appendLine(message)
    log(message = "Status...OK")
    log(message = "Wings...OK")
    log(message = "Engine starting...OK")
    println(builder)
}
