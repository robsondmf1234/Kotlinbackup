package interfaces

//Demonstração do uso de interface
//As properties de Interface não carrega estados
fun main() {
    val dog = Dog()
    println("Number steps of dog: ${dog.walk()}")

    //Precisamos inicializar a cor ,pois pedimos esse atributo no construtor primário
    val cat = Cat(color = "Laranja e Branco")
    println("Number steps of cat: ${cat.walk()}")

    //Podemos criar um objeto que implementa o Single Abstract Method(SAM).
    // Para utilizar o método da function interface
    val male = Male()
    male.eyeColor()

    //Podemos utilizar nossa Single Abstract Method(SAM), direto com lambda, ao inves de temos que criar uma classe para
    // utlizar o SAM como no exemplo anterior
    val male2 = Person9 { "Yellow" }
    println("Male2 eyecolor: ${male2.eyeColor()}")
}

class Dog : Animal {
    override val legs: Int = 4
    override val color: String = "Black"

    override fun speak(): String = "Au Au !"
}

class Cat(override val color: String) : Animal {
    override val legs = 4

    override fun speak() = "Miau!"

    //Podemos sobrescrever o metodo da Interface da maneira como precisarmos
    override fun walk(): Int {
        return 0
    }
}

interface Animal {
    val legs: Int
    val color: String

    //Não conseguimos inicializar uma property, pois apresentara erro
    //val color: String = "Black"
    //Podemos executar da seguinte maneira , para temos o comportamento esperado anteriormente
    //val color :String get() = "Black"
    fun speak(): String

    //Conseguimos realizar implementaçã em nossa interface caso necessário
    fun walk(): Int {
        var steps = 0
        for (step in 0..20 step 2) {
            steps += step
        }
        return steps
    }

}

//Simple Abstract Method(SAM)
fun interface Person9 {
    fun eyeColor(): String
    fun hairColor(): String = "Black"
}

class Male : Person9 {
    override fun eyeColor(): String = "Black"
}