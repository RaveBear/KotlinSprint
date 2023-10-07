package lesson_5

const val USER_001_LOGIN = "Zaphod"
const val USER_001_PASSWORD = "PanGalactic"

fun main() {
    println("Добро пожаловать на борт корабля \"Heart of Gold\"")
    println("Введите Ваше имя: ")
    val userName = readln()

    if (userName != USER_001_LOGIN) {
        println("Пользователь не нейден. Вам необходимо зарегистрироваться!")
        return

    } else {
        println("Введите пароль: ")
        val userPassword = readln()

        if (userPassword == USER_001_PASSWORD)
        println("Ваши данные проверены, и о, чудо, они верны... " +
        "\nПользователь $userName, вам разрешено входить на борт корабля \"Heart of Gold\"")
        }
    }
