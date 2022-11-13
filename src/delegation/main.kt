package delegation

//Demonstração de delegation
fun main() {
    val freeLancer = FreeLancer()
    freeLancer.working = true
    freeLancer.getPaid()
}

//Interface com metodos e propertie
interface Programmer {
    var working: Boolean
    fun work()
    fun getPaid()
}

//Classe que implementa a interface Programmer
class KotlinProgrammer() : Programmer {
    override var working = false

    override fun work() {
        println("Programing with Kotlin...")
        working = true
    }

    override fun getPaid() {
        if (working) {
            println("Getting the money!!")
        } else {
            println("No money! You need to work first.")
        }
        working = false
    }
}

//Classe que implenata a classe KotlinProgrammer por delegação
//As 2 classes tanto a que implenta por delegação e a que é delegada precisam implementar a mesma interface (Programmer)
class FreeLancer : Programmer by KotlinProgrammer()