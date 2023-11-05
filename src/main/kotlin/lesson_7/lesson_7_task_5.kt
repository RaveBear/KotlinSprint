package lesson_7

fun main() {
    val symbolRandom = ('0'..'9') + ('a'..'z') + ('A'..'Z')
    println("Максимальная длина пароля: ")
    val maxLenghtPass = readln().toInt()
    var password = ""

    for (x in 1..maxLenghtPass) {
        password += symbolRandom.random()
        if (maxLenghtPass < 6) {
            println("Пароль не должен быть менее 6 символов.\nПопробуйте снова")
            return
        }
    }
    println(password)

}