package lesson_4

val CARGO_CATEGORY = "Average"
val MIN_WEIGHT_AVERAGE_CARGO = 35
val MAX_WEIGHT_AVERAGE_CARGO = 100
val VOLUME_AVERAGE_CARGO = 100

fun main() {
    val weightCargo1 = 20
    val volumeCargo1 = 80
    println("Груз с весом $weightCargo1 кг и объемом $volumeCargo1 л соответствует категории: '$CARGO_CATEGORY':" +
            "${(weightCargo1 >= MIN_WEIGHT_AVERAGE_CARGO) && (weightCargo1 <= MAX_WEIGHT_AVERAGE_CARGO)
            and (volumeCargo1 < VOLUME_AVERAGE_CARGO)}")

    val weightCargo2 = 50
    val volumeCargo2 = 100
    println("Груз с весом $weightCargo2 кг и объемом $volumeCargo2 л соответствует категории: '$CARGO_CATEGORY':" +
            "${(weightCargo2 >= MIN_WEIGHT_AVERAGE_CARGO) && (weightCargo2 < MAX_WEIGHT_AVERAGE_CARGO) 
                    and (volumeCargo2 <= VOLUME_AVERAGE_CARGO)}")

}