package lesson_3

fun main() {
    var moveFrom = "E2"
    var moveIn = "E4"
    var moveNumber = 1
    println("Ход номер $moveNumber: $moveFrom-$moveIn")

    moveFrom = "D2"
    moveIn = "D3"
    moveNumber ++
    println("Ход номер $moveNumber: $moveFrom-$moveIn")

}