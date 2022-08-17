package highorderfunction

//Demonstração de High-Order-Functions
//São funções que aceitam outras funções ou lambdas como parametros
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val moreThanTwo: (Int) -> Boolean = { number ->
        number > 2
    }
    //Função any é uma High-Order-Function (HOF)
    println(numbers.any(moreThanTwo))
}