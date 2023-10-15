package lesson_6

fun main() {
    println("Кол-во секунд, которые нужно засечь: ")
    var userSeconds = readln().toLong()
    var timerSeconds = userSeconds * 1000

    println("Таймер включен")
    Thread.sleep(timerSeconds)
    println("Прошло ${userSeconds--} секунд")
}