package funcoes

fun main() {
    sumOfTwoNumbers()

    val result2 = sumOfTwoNumbers(3, 7)
    println("Result2: $result2")

    val result3 = sumOfTwoNumbers2(7, 7)
    println("Result3: $result3")

    //Named arguments = Argumentos nomeados, podemos passar os parametros na ordem que quisermos, só precisamos especificar o nome da variavel
    val result4 = sumOfThreeNumbers(b = 5, c = 2, a = 3)
    println("Result4: $result4")

    val result5 = sumof2Numbers(b=3)
    println("Result5: $result5")
}

//Podemos ter métodos com o mesmo nome,porém com assinatura diferentes(quantidade de parametros)
fun sumOfTwoNumbers(a: Int, b: Int): Int {
    return a + b
}

//Podemos ter métodos com o mesmo nome,porém com assinatura diferentes(quantidade de parametros)
fun sumOfTwoNumbers() {
    println("Result1: ${3 + 4}")
}

fun sumOfTwoNumbers2(a: Int, b: Int): Int = a + b

fun sumOfThreeNumbers(a: Int, b: Int, c: Int) = a + b + c

//Default argument, podemos deixar algum parametro com valor padrão, caso aquele parametro não seja recebido na chamada
//do método , o método irá assumir o valor padrão (Ex: a:Int = 20)
fun sumof2Numbers(a: Int = 20, b: Int): Int {
    return a + b
}