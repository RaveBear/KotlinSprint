package lesson_2

import kotlin.math.pow

fun main() {
    val clientDeposit = 70_000
    val bidParcent = 16.7 / 100 // in %

    val clientDepositResult = 70_000 * (1 + (0.167 / 365)).pow(7300)
    println(String.format("%.3f", clientDepositResult))

}