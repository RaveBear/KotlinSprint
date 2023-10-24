package lesson_7

fun main() {
    println("Кол-во секунд, которые нужно засечь: ")
    var inputSeconds = readln().toInt()
    for (x in inputSeconds downTo   0) {
        println("Осталось секунд: ${inputSeconds--}")
        Thread.sleep(1000)
    }
    println("Время вышло")

}
