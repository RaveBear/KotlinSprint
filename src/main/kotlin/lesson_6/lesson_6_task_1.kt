package lesson_6

fun main() {

// Регистрация
    println("Введите имя пользователя:")
    val regUserName = readln()

    println("Введите пароль:")
    val regUserPassword = readln()
    println("Поздравляем! Регистрация прошла успешно.\n")

// Вход в приложение
    do {
        println("Имя пользователя:")
        val entryUserName = readln()
        println("Пароль:")
        val entryUserPassword = readln()

        if (entryUserName == regUserName && entryUserPassword == regUserPassword)
            println("Авторизация прошла успешно")
        else
            println("Имя пользователя или пароль введены неправильно!\nПопробуйте заново.")

    } while (entryUserName != regUserName || entryUserPassword != regUserPassword)

}