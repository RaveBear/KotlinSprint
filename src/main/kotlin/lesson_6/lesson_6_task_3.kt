package lesson_6

fun main() {
    println("Кол-во секунд, которые нужно засечь: ")
    var userSeconds = readln().toInt()

    while (userSeconds > 0) {
        println("Осталось секунд: ${--userSeconds}")
    }
    println("Время вышло")
}