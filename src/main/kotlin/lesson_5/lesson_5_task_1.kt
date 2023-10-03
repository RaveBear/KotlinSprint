package lesson_5


fun main() {
    val rightAnswer = 2 + 5
    println("Подтвердите, что Вы не робот. Решите задачу: 2 + 5 =")
    val userAnswer = readln().toInt()

    if (userAnswer == rightAnswer) {
        println("Добро пожаловать")
    } else { println("Доступ запрещен") }

}
