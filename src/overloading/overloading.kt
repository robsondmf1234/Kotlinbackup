package overloading

//Demonstração de sobrecarga de métodos
fun main() {

    println(person(name = "Robson"))
    person(name = "Robson", age = 35)

}

//Podemos ter o mesmo nome de método, porem para podermos ter 2 metodos com mesmo nome,
// temos que ter a assinatura de método diferente(Ex: person(name: String) e o outro Ex:person(name: String, age: Int))
fun person(name: String): String {
    return name
}

fun person(name: String, age: Int) {
    println("Nome: $name e idade $age")
}