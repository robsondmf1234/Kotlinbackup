package composition


//Demonstração do us de composition em comparação ao uso de interface

fun main() {
    println("Teste")
    val dog = Dog()
    val cleaningRobot = CleaningRobot()
    val cleaningRobotDog = CleaningRobotDog(dog = dog, cleaningRobot = cleaningRobot)
    cleaningRobotDog.move()
    cleaningRobotDog.eat()
}

interface Animal {
    fun eat()
    fun run()
}

class Dog : Animal {
    override fun eat() {
        println("Eating...")
    }

    override fun run() {
        TODO("Not yet implemented")
    }

    fun bark() {}
}

class Cat : Animal {
    override fun eat() {
        println("Eating...")
    }

    override fun run() {
        TODO("Not yet implemented")
    }

    fun hiss() {}
}

interface Robot {
    fun move()
}

class CleaningRobot : Robot {
    fun clean() {}
    override fun move() {
        println("Moving")
    }
}

class ServiceRobot : Robot {
    override fun move() {
        TODO("Not yet implemented")
    }

    fun repair() {}
}

//Classe que usa composition
//Recebemos a instancia de outras classes(Dog e CleaningRobot) e dentro da CleaningRobotDog, utilizamos os metodos especificos de cada classe
class CleaningRobotDog(
    private val dog: Dog,
    private val cleaningRobot: CleaningRobot
) {

    fun eat() {
        dog.eat()
    }

    fun run() {
        dog.run()
    }

    fun move() {
        cleaningRobot.move()
    }

    fun clean() {
        cleaningRobot.clean()
    }
}

/*
class CleaningRobotDog() {

    private val dog = Dog()
    private val cleaningRobot = CleaningRobot()

    fun run() {
        dog.run()
    }

    fun move() {
        cleaningRobot.move()
    }

    fun clean() {
        cleaningRobot.clean()
    }
}
*/
class Parent {
    fun getFood() {
        println("Getting some fodd")
    }
}

class Child(private val parent: Parent) {
    fun getFood() {
        parent.getFood()
    }
}
/*
class Parent {
    fun getFood() {
        println("Getting some fodd")
    }
}

class Child {
    private val parent = Parent()
    val getFood = parent.getFood()
}
*/
