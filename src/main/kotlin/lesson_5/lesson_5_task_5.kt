package lesson_5

import kotlin.random.Random

fun main() {
    val firstWinNum = Random.nextInt(1, 100)
    println("Введите первое число: ")
    val userFirstNumber = readln().toInt()

    val secondWinNum = Random.nextInt(1, 100)
    println("Введите второе число: ")
    val userSecondNumber = readln().toInt()

    if (userFirstNumber == firstWinNum && userSecondNumber == secondWinNum
        || userFirstNumber == secondWinNum && userSecondNumber == firstWinNum)
        println("Вы выиграли главный приз!")
    else if (userFirstNumber == firstWinNum || userSecondNumber == secondWinNum)
        println("Вы угадали одно число и получаете утешительный приз!")

    else println("Вы проиграли! Для победы нужны были числа: $firstWinNum и $secondWinNum")
}
