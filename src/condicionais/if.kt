package `if`

fun main() {

    ageRestriction(118, "Male")
    val result = checkNumberSign(1)
    println(result)
}

fun ageRestriction(age: Int, gender: String) {
    val gender = gender.lowercase()

    if (age < 18) println("Access Denied!")
    if (age in 18..35 && gender == "male") println("Can enter to army")
    if (age >= 18) println("Access Approved!")
}

fun checkNumberSign(number: Int): String {
    return if (number > 0) {
        "Positive"
    } else if (number < 0) {
        "Negative"
    } else {
        "Zero"
    }
}