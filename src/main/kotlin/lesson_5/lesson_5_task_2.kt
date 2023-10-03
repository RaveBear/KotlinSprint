package lesson_5

const val AGE_OF_MAJORITY = 18
const val THIS_YEAR = 2023

fun main() {
    println("Введите свой год рождения:")
    val userYeraOfBirth = readln().toInt()
    val userAge = THIS_YEAR - userYeraOfBirth

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
    if (userAge < AGE_OF_MAJORITY) {
        println("Вернуться на главный экран")
    }

}