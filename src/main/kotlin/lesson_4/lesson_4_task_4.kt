package lesson_4

const val IS_EVEN_ARM_TRAINING = true
const val IS_EVEN_CRUNCHES_TRAINING = true
const val IS_EVEN_LEGS_TRAINING = false
const val IS_EVEN_BACK_TRAINING = false

fun main() {
    val dayOfTraining = 5
    val trainingToday = dayOfTraining % 2 == 0

    println("Упражнение для рук:    ${trainingToday != IS_EVEN_ARM_TRAINING}" +
            "\nУпражнение для ног:    ${trainingToday != IS_EVEN_LEGS_TRAINING}" +
            "\nУпражнение для спины:  ${trainingToday != IS_EVEN_BACK_TRAINING}" +
            "\nУпражнение для пресса: ${trainingToday != IS_EVEN_CRUNCHES_TRAINING}")

}