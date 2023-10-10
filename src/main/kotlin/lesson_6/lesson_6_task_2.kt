package lesson_6

fun main() {
    println("Кол-во секунд, которые нужно засечь: ")
    var userSeconds = readln().toInt()

    println("Таймер включен")
    while (userSeconds > 0) {
        println("Прошло ${userSeconds--} секунд")
        Thread.sleep(1000)
    }
}