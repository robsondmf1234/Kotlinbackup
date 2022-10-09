package upcastingEdownCasting
//Demonstração de upcasting e downcasting.
//uso do smartcast do koltin e filtragem por tipos de objetos
fun main() {

    val dog = Dog(name = "Rex")
    val cat = Cat(name = "Tom")
    val dog2 = Dog(name = "Thor")
    val cat2 = Cat(name = "Felix")

    val animals = listOf(dog, cat, dog2, cat2)
    //Filtrando para retornar o primeiro elemento da lista do tipo Dog
    val result = animals.find { it is Dog } as? Dog
    println("Result : ${result?.name}")

    val animals2 = listOf(dog, cat, dog2, cat2)
    //Retornando todos os elementos da lista que são do tipo Dog
    val result2 = animals.filterIsInstance<Dog>()
    result2.forEach { dogResult ->
        println(dogResult.name)
    }


//    getAnimal(animal = dog)
//    getAnimal(animal = cat)

//    getAnimal2(animal = dog)
//    getAnimal2(animal = cat)

//    getAnimal3(animal = dog)
//    getAnimal3(animal = cat)

//    getAnimal4(animal = cat)
//    getAnimal4(animal = cat)

//    getAnimal5(animal = cat)
//    getAnimal5(animal = dog)
}

//Polimorfismo, podemos passar qual objeto que implemente Animal, no nosso caso Dog e Cat.
//Dentro do método getAnimal, só teremos acesso aquelas funções(eat e run), que foram definidas na interface e que precisam ser implementadas
//pelas classes filhas
fun getAnimal(animal: Animal) {
    animal.eat()
}

fun getAnimal2(animal: Animal) {
    //Podemos fazer um downcasting , verificamos se o objeto animal que estamos recebendo é do tipo Dog ou Cat e assim podemos
    //acessar seus metodos internos(dog.fecthBall() e cat.scratch())
    if (animal is Dog) {
        //Utilizando o smartCast do Kotlin
        animal.fecthBall()
    }
    if (animal is Cat) {
        //Utilizando o smartCast do Kotlin
        animal.scratch()
    }
}

fun getAnimal3(animal: Animal) {
    when (animal) {
        //Utilizando o smartCast do Kotlin
        is Dog -> animal.fecthBall()
        is Cat -> animal.scratch()
    }
}

fun getAnimal4(animal: Animal) {
    //Realizando a conversão forçadamente, poderemos ter um erro em tempo de execução,pois não poderemos executar um dog para um cat
    //caso recebermos um cat como parametro
    val dog = animal as Dog
    dog.fecthBall()
}

fun getAnimal5(animal: Animal) {
    //Para corrigirmos o problema acima podemos adicionar um safe call operator após a conversão e
    //mais um safecall operator antes de chamarmos o metodo ,para que só seja executado caso nosso objeto não seja null
    val dog = animal as? Dog
    dog?.fecthBall()
}

interface Animal {
    fun eat()
    fun run()
}

class Dog(val name: String) : Animal {
    override fun eat() {
        println("${this::class.simpleName} is eating...")
    }

    override fun run() {
        println("${this::class.simpleName} is running...")
    }

    fun fecthBall() {
        println("Fetching a ball!!")
    }
}

class Cat(val name: String) : Animal {
    override fun eat() {
        println("${this::class.simpleName} is eating...")
    }

    override fun run() {
        println("${this::class.simpleName} is running...")
    }

    fun scratch() {
        println("Scratching with claws...")
    }
}