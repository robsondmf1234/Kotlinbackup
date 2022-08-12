package condicionais

import kotlin.random.Random

//Demonstração do uso do when
fun main() {


    /*//Demonstração do uso do when
    when (Random.nextInt(from = 1, until = 5)) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
    }*/


    //Demonstração do uso do when exaustive, deverá ser implementado o else,para cobrir algum caso, diferentes de nossas
    //condições
/*    val result = when (Random.nextInt(from = 1, until = 5)) {
        1 -> {
            println("1")
        }
        2 -> {
            println("2")
        }
        3 -> {
            println("3")
        }
        else -> {
            println(null)
        }
    }*/

    //Chama o método getPerson e faz a comparação ,caso receba um Person.Male imprime "Male",
    //caso receba um Female irá imprimir "Female"
/*    when(getPerson()){
        is Person.Male -> println("Male")
        is Person.Female -> println("Female")
    }*/

    //Demosntração do uso de when
    //break irá finalizar o programa
    //continue irá saltar para o próximo item
    val number = listOf(1, 2, 3, 4, 5)
    for (n in number) {
        when (n) {
            //  1 -> break
            2 -> continue
            3 -> println("Three")
            4 -> println("Four")
            5 -> println("Five")
        }
    }

}

//Retorna Male caso o numero gerado for 1 e Female caso seja diferente disto
fun getPerson(): Person {
    return if (Random.nextInt(from = 1, until = 3) == 1) Person.Male else Person.Female
}

sealed class Person {
    object Male : Person()
    object Female : Person()
}