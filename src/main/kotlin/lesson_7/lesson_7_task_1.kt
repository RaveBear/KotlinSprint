package lesson_7

fun main() {
    val symbolOne = '0'..'9'
    val symbolTwo = 'a'..'z'
    var password = ""

    for (i in 1..3) {
        password += symbolOne.random()
        password += symbolTwo.random()
    }
    println(password)
}
