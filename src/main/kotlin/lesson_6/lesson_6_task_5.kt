package lesson_6

fun main() {

// Проверка на бота
    var userTry = 3

    do {
        val firstNum = (1..9).random()
        val secondNum = (1..9).random()
        val taskResult = firstNum + secondNum

        println("Решите задачу: $firstNum + $secondNum =")
        println("Ваш ответ: ")
        val userAnswer = readln().toInt()

        if (userAnswer == taskResult) {
            println("Добро пожаловать!")
            return

        } else if (userTry > 0) {
            println("Ответ неправильный!\nОсталось попыток: ${--userTry}")
        }
    } while (userTry > 0)

    println("Доступ запрещен")
}