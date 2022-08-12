package condicionais

//Demonstração do uso de Enum
fun main() {
    //Recebendo um enum
    val priority = Priority.LOW
    println("Imprimindo o enum: $priority")

    //Outra forma de receber um Enum
    //Obs: Podemos tomar uma Ilegal exception,caso tenhamos passado um Enum que não exista (Ex: "low") ou invés de ("LOW")
    val priority2 = Priority.valueOf(value = "LOW")
    println("Enum: $priority2")

    //Forma de recebermos todos os Enuns e mostrarmos sua property
    for (enum in Priority.values()) {
        println("Color: ${enum.color}")
        //Forma de imprimir o numero do Enum
        println("Ordinal: ${enum.ordinal}")
    }
}

/*
//Declaração de um Enum
enum class Priority {
    LOW,
    MEDIUM,
    HIGH
}*/


//Podemos definir que nossos enuns tenham uma property
enum class Priority(val color: String) {
    LOW(color = "Green"),
    MEDIUM(color = "Orange"),
    HIGH(color = "Red");

    val number: Int
        get() = when (this) {
            LOW -> 1
            MEDIUM -> 2
            HIGH -> 3
        }
}