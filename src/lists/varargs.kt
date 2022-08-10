package lists

//Demonstração no uso de varargs
fun main() {

    //Chamando método e passando alguns valores do tipo Int.
    println(sum(1, 2, 4, 5, 6))

    //Chamando método sum e passando uma array de Ints.
    println(sum(numbers = intArrayOf(1, 2, 4, 5, 6)))

    //Declarando um array de Int
    val meuArray = intArrayOf(5, 10, 15)
    //Chamando método sum e acrescentando o array de Int(meuArray) criado.
    println(sum(numbers = intArrayOf(1, 2, 3, *meuArray)))

}

fun sum(vararg numbers: Int): Int {
    var sum = 0
    for (numero in numbers) {
        sum += numero
    }
    return sum
}
