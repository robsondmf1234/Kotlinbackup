package lambda

fun main() {
    println("Test")

    val list = (1..10).toList()
    println(list)
    val sum = list.customSum { it % 2 == 1 }
    println(sum)
}


fun List<Int>.customSum(conditionToSum: (Int) -> Boolean): Int {
    var result = 0
    for (num in this) {
        if (conditionToSum(num)) {
            result += num
        }
    }
    return result
}