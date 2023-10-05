package lesson_5

const val FIRST_NUM_OF_TASK = 2
const val SECOND_NUM_OF_TASK = 5

fun main() {
    val rightAnswer = FIRST_NUM_OF_TASK + SECOND_NUM_OF_TASK
    println("Подтвердите, что Вы не робот. Решите задачу: $FIRST_NUM_OF_TASK + $SECOND_NUM_OF_TASK =")
    val userAnswer = readln().toInt()

    if (userAnswer == rightAnswer) {
        println("Добро пожаловать")
    } else { println("Доступ запрещен") }

}
