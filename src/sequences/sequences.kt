package sequences

fun main() {
    val list = listOf(1, 2, 3, 4)
    //  list.filter { it % 2 == 0 }.map { it * it }.any { it < 10 }
    println("--LIST--")
    list.filter(Int::isEven)
        .map(Int::square)
        .any(Int::lessThanTen)

    println("--SEQUENCE--")
    list.asSequence()
        .filter(Int::isEven)
        .map(Int::square)
        .any(Int::lessThanTen)
}


fun Int.isEven(): Boolean {
    println("isEven()")
    return this % 2 == 0
}

fun Int.square(): Int {
    println("square()")
    return this * this
}

fun Int.lessThanTen(): Boolean {
    println("lessThanTen()")
    return this < 10
}

