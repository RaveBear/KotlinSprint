package lesson_6

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val winNum = Random.nextInt(1..9)
    println(winNum)
    var userTry = 2

    do {
        println("Угадайте число: ")
        val userNum = readln().toInt()
        if (userNum == winNum) {
            println("Это была великолепная игра!")
            break
        } else
            println("Вы не угадали! Осталось попыток: ${--userTry}")
    } while (userTry > 0)

    println("Было загадано число: $winNum")
}
