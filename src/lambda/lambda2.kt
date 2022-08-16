package lambda

import kotlin.random.Random

fun main() {

    //val lambdaName = greeter
    // :(InputType) = (String)
    // -> ReturnType = String
    // {arguments = name
    // :InputType = String
    // -> body = "Hello $name")

    //val lambdaName:(InputType) -> ReturnType = {arguments:InputType -> body)
    val greeter: (String) -> String = { name: String -> "Hello $name" }

    println(greeter("Robson"))

    //val lambdaName:(InputType) -> ReturnType = {arguments:InputType -> body)
    val greeter2: (String, String) -> String = { firstName: String, lastName: String ->
        "Hello $firstName $lastName"
    }

    println(greeter2("Robson", "Ferreira"))

    //val lambdaName = greeter3
    // :(InputType) = (String,String)
    // -> ReturnType = Int
    // {arguments = firstName,lastName
    // :InputType = String
    // -> body =    val firstNameLength = firstName.length
    //        val lastNameLength = lastName.length
    //        val sum = firstNameLength + lastNameLength
    //        sum

    val greeter3: (String, String) -> Int = { firstName: String, lastName: String ->
        val firstNameLength = firstName.length
        val lastNameLength = lastName.length
        val sum = firstNameLength + lastNameLength
        sum
    }

    println(greeter3("Robson", "Ferreira"))

    val greeter4: (String, String) -> Unit = { firstName: String, lastName: String ->
        println("Hello $firstName $lastName")
    }

    println(greeter4("Robson", "Ferreira"))

    //val lambdaName = verifyNumber
    // :(InputType) = (Int,Int)
    // -> ReturnType = Boolean
    // {arguments = firstNumber , secondNumber
    // :InputType = Int , Int
    // -> body =   val cond: Boolean = firstNumber > secondNumber
    val verifyNumber: (Int, Int) -> Boolean = { firstNumber: Int, secondNumber: Int ->
        val cond: Boolean = firstNumber > secondNumber
        cond
    }

    println(verifyNumber(10, 50))

    val lambda1 = { name: String ->
        println("Hello $name")
    }

    println(lambda1("Robson"))


    //val lambdaName = lambdaListaDePares
    // :(InputType) = (List<Int>,List<Int>)
    // -> ReturnType = List<Int>
    // {arguments = firstList,secondList
    // :InputType = List<Int>,List<Int>
    // -> body =   var listaDePares = emptyList<Int>()
    //
    //        listaDePares = firstList.filter { it % 2 == 0 }
    //        listaDePares = secondList.filter { it % 2 == 0 }
    //
    //        listaDePares

    val lambdaListaDePares: (List<Int>, List<Int>) -> List<Int> = { firstList: List<Int>, secondList: List<Int> ->
        var listaDePares = emptyList<Int>()

        listaDePares = firstList.filter { it % 2 == 0 }
        listaDePares = secondList.filter { it % 2 == 0 }

        listaDePares
    }

    val list1 = listOf(2, 4, 6, 6, 4, 112)
    val list2 = listOf(4, 4, 6)
    println(lambdaListaDePares(list1, list2))

    val lambdaNomesGrandes: (MutableList<String>, List<String>) -> List<String> =
        { primeiraListaDeNomes: List<String>, segundaListaDeNomes: List<String> ->
            var listaNomes = mutableListOf<String>()

            primeiraListaDeNomes.forEach {
                if (it.length > 3) {
                    listaNomes.add(it)
                }
            }
            segundaListaDeNomes.forEach {
                if (it.length > 3) {
                    it.lowercase()
                    listaNomes.add(it)
                }
            }
            listaNomes.forEach {
                it.uppercase()
            }
            listaNomes
        }
    val listaNomes1 = mutableListOf("Robson", "Ferreira", "GUstavo", "Marcio", "Bia")
    val listaNomes2 = listOf("Ana", "Cau", "Didi", "Augusto")
    println(lambdaNomesGrandes(listaNomes1, listaNomes2))

    val lista = (1..10).toList()
    println(lista)
    val sum = lista.customSum2 { it % 2 == 1 }


    val listaNomes3 = mutableListOf("Robson", "Ferreira", "GUstavo", "Marcio", "Bia", "Gabriel")
    val listaNomesGrandes = listaNomes3.verificaNomesGrandes { it.length > 5 }
    println(listaNomesGrandes)

    val listaNumeros1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 11, 13, 14, 21, 33, 45, 66, 54, 32, 22)
    val filtered = listaNumeros1.verificaNumeroPar { it % 2 == 0 }
    println(filtered)
}

fun List<Int>.customSum2(conditionToSum: (Int) -> Boolean): Int {
    var result = 0
    for (num in this) {
        if (conditionToSum(num)) {
            result += num
        }
    }
    return result
}

fun List<String>.verificaNomesGrandes(condition: (String) -> Boolean): List<String> {
    val listaNomes: MutableList<String> = mutableListOf()
    for (nome in this) {
        if (condition(nome)) {
            listaNomes.add(nome)
        }
    }

    return listaNomes
}


fun List<Int>.verificaNumeroPar(conditionSum: (Int) -> Boolean): Int {
    var result = 0
    for (num in this) {
        if (conditionSum(num)) {
            result += num
        }
    }
    return result
}

fun button2(onClick: (Int) -> String) {
    onClick(Random.nextInt(from = 0, until = 100))
}