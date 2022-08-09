package strings

//String template
fun main() {
    val number = 10

    val favoriteNumber = "My favorite number is: ${number.toFloat()}"
    println(favoriteNumber)

    setAge(18)

    val about = "Lorem Ipsum is simply dummy text of the printing and typesetting\n" +
            "industry. Lorem Iinter, dummy text of \n" +
            "the printing and typesetting\n" +
            "industry. Lorem Iinter "
    val about1 = """Lorem Ipsum is simply dummy text
         |of the printing and typesetting industry.
         |Lorem Iinter, dummy text of the printing
         |and typesetting industry. Lorem Iinter """.trimMargin()
    val about2 = """Lorem Ipsum is simply dummy text
         #of the printing and typesetting industry.
         #Lorem Iinter, dummy text of the printing
         #and typesetting industry. Lorem Iinter """.trimMargin(marginPrefix = "#")

    println(about)
    println(about1)
    println(about2)
}

fun setAge(age: Int) {
    println("${if (age < 18) "Minor" else "Adult"}")
}