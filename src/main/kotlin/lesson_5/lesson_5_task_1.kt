package lesson_5

const val RIGHT_ANSWER = 7

fun main() {

    println("Подтвердите, что Вы не робот. Решите задачу: 2 + 5 =")
    val userAnswer = readln().toInt()

    if (userAnswer == RIGHT_ANSWER) {
        println("Добро пожаловать")
    } else { println("Доступ запрещен") }

}
