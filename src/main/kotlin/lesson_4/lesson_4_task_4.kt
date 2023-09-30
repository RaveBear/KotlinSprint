package lesson_4

val ARM_TRAINING = true
val CRUNCHES_TRAINING = true
val LEGS_TRAINING = false
val BACK_TRAINING = false

fun main() {
    val dayOfTraining = 5
    val trainingToday = dayOfTraining % 2 == 0

    println("Упражнение для рук:    ${trainingToday != ARM_TRAINING}" +
            "\nУпражнение для ног:    ${trainingToday != LEGS_TRAINING}" +
            "\nУпражнение для спины:  ${trainingToday != BACK_TRAINING}" +
            "\nУпражнение для пресса: ${trainingToday != CRUNCHES_TRAINING}")

}