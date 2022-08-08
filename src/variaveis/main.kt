package variaveis

fun main() {
    val number = 5
    //Pode caber até 15 digitos ,após o ponto decimal
    val doubleNumber = 4.99
    //Pode caber de 6-7 digitos ,após o ponto decimal
    val floatNumber = 4.99f

    val letter = 'A'
    val boolean = true
    val text = "Some random text"
    val textInNumber = "10"

    val textInNumber2 = textInNumber.toInt()
    val numberFromString = Integer.parseInt(textInNumber)

    println(numberFromString)
    println(textInNumber2)

    println(number)
    println(doubleNumber)
    println(floatNumber)
    println(letter)
    println(boolean)
    println(text)
}