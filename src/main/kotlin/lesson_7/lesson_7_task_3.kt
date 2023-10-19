package lesson_7

fun main() {
    println("Введите число: ")
    val userNumber = readln().toInt()
    val range1 = 0..userNumber
    for (x in range1) {
        if (x % 2 == 0)
            println(x)
    }

}