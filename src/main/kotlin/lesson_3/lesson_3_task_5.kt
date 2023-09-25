package lesson_3

fun main() {
    val playersMove = "D2-D4;0".split("-", ";")
    println(playersMove)

    val moveFrom = playersMove[0]
    val moveIn = playersMove[1]
    val moveNumber = playersMove[2]
    println(moveFrom)
    println(moveIn)
    println(moveNumber)


}