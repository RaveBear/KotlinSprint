package lesson_7

fun main() {
    val numberOfSms = 1000..9999
    var systemCode = ""

    do {
        systemCode = numberOfSms.random().toString()
        println("Ваш код авторизации: $systemCode")
        println("Введите код авторизации: ")
        val userCode = readln()
        if (userCode == systemCode) {
            println("Код авторизации принят. Добро пожаловать")
        }

    } while (userCode != systemCode)
}