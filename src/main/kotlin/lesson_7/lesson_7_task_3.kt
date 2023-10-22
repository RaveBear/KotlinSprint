package lesson_7

fun main() {
    println("Введите число: ")
    val userNumber = readln().toInt()
    for (x in 0..userNumber step 2) {
            println(x)
    }

}