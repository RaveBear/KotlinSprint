package lesson_5

const val FIRST_WIN_NUMBER = 6
const val SECOND_WIN_NUMBER = 76

fun main() {
    println("Введите первое число: ")
    val userFirstNumber = readln().toInt()
    println("Введите второе число: ")
    val userSecondNumber = readln().toInt()

    if (userFirstNumber == FIRST_WIN_NUMBER && userSecondNumber == SECOND_WIN_NUMBER) {
        println("Поздравляем! Вы выиграли главный приз!")
    }
    if ((userFirstNumber == FIRST_WIN_NUMBER && userSecondNumber != SECOND_WIN_NUMBER) ||
        (userFirstNumber != FIRST_WIN_NUMBER && userSecondNumber == SECOND_WIN_NUMBER)) {
        println("Вы выиграли утешительный приз!")
        println("Для победы нужны были числа: $FIRST_WIN_NUMBER и $SECOND_WIN_NUMBER")
    }
    if (userFirstNumber != FIRST_WIN_NUMBER && userSecondNumber != SECOND_WIN_NUMBER) {
        println("Неудача! Крутите барабан!")
        println("Для победы нужны были числа: $FIRST_WIN_NUMBER и $SECOND_WIN_NUMBER")
    }
}